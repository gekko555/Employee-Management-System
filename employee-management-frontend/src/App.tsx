import React, { useState, useEffect } from 'react';

interface EmployeeDisplayDto {
  id: number;
  name: string;
  furigana: string;
  age: string;
  email: string;
  department: string;
  address: string;
  hireDate: string;
  status: string;
}

interface EmployeeFormData {
  name: string;
  furigana: string;
  age: string;
  email: string;
  address: string;
  department: string;
  hireDate: string;  
  status: string;    
}

function App(): JSX.Element {
  const [employees, setEmployees] = useState<EmployeeDisplayDto[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [formData, setFormData] = useState<EmployeeFormData>({
    name: '',
    furigana: '',
    age: '',
    email: '',
    department: '',
    status: '',
    address: '',
    hireDate: ''
  });

  useEffect(() => {
    fetch('http://localhost:8080/api/employees')
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        setEmployees(data);
        setLoading(false);
      })
      .catch(error => {
        console.error('APIエラー:', error);
        setLoading(false);
      });
  }, []);

  const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>): void => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>): void => {
    e.preventDefault();

    fetch('http://localhost:8080/api/employees', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(formData)
    })
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then((data: EmployeeDisplayDto) => {
        setEmployees([...employees, data]);
        setFormData({
          name: '',
          furigana: '',
          age: '',
          email: '',
          department: '',
          status: '',
          address: '',
          hireDate: ''
        });
        alert('社員を追加しました!')
      })
      .catch(error => {
        console.error('追加エラー:', error);
        alert('追加に失敗しました');
      });
  };

  if (loading) {
    return <div>読み込み中...</div>;
  }

  return (
    <div style={{ padding: '20px' }}>
      <h1>社員管理システム</h1>

      {/* 社員追加フォーム */}
      <div style={{ marginBottom: '30px', padding: '20px', border: '1px solid #ccc', borderRadius: '5px' }}>
        <h2>社員追加</h2>
        <form onSubmit={handleSubmit}>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>名前: </label>
            <input
              type="text"
              name="name"
              value={formData.name}
              onChange={handleChange}
              required
              style={{ padding: '5px', width: '200px' }}
            />
          </div>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>ふりがな: </label>
            <input
              type="text"
              name="furigana"
              value={formData.furigana}
              onChange={handleChange}
              style={{ padding: '5px', width: '200px' }}
            />
          </div>
          <div style={{ marginBottom: '10px'}}>
            <label style={{ display: 'inline-block', width: '80rx'}}>年齢: </label>
            <input
              type="number"
              name='age'
              value={formData.age}
              onChange={handleChange}
              min="18"
              max="75"
              required
              style={{ padding: '5px', width: '200px' }}
            />
          </div>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>メール: </label>
            <input
              type="email"
              name="email"
              value={formData.email}
              onChange={handleChange}
              required
              style={{ padding: '5px', width: '200px' }}
            />
          </div>
          <div style={{ marginBottom: '10px' }}>
            <label>部署:</label>
            <select
              name="department"
              value={formData.department}
              onChange={handleChange}
              required
              style={{ marginLeft: '10px', padding: '5px' }}
            >
              <option value="">部署を選択してください</option>
              <option value="営業部">営業部</option>
              <option value="技術部">技術部</option>
              <option value="人事部">人事部</option>
              <option value="総務部">総務部</option>
              <option value="経理部">経理部</option>
            </select>
          </div>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>住所: </label>
            <input
              type="text"
              name="address"
              value={formData.address}
              onChange={handleChange}
              style={{ padding: '5px', width: '300px' }}
            />
          </div>
          
          <div style={{ marginBottom: '10px' }}>
            <label>在籍状況：</label>
            <select
              name="status"
              value={formData.status}
              onChange={handleChange}
              required
              style={{ marginLeft: '10px', padding: '5px' }}
            >
              <option value="">在籍状況を選択してください</option>
              <option value="在籍中">在籍中</option>
              <option value="休職中">休職中</option>
              <option value="退職">退職</option>
            </select>
          </div>

          <div style={{ marginBottom: '10px' }}>
            <label style={{ display: 'inline-block', width: '80px' }}>入社日: </label>
            <input
              type="date"
              name="hireDate"
              value={formData.hireDate}
              onChange={handleChange}
              required
              style={{ padding: '5px', width: '200px' }}
            />
          </div>
          <button
            type="submit"
            style={{
              padding: '8px 16px',
              backgroundColor: '#007bff',
              color: 'white',
              border: 'none',
              borderRadius: '4px',
              cursor: 'pointer'
            }}
          >
            追加
          </button>
        </form>
      </div>

      <h2>社員一覧</h2>
      {loading ? (
        <div>読み込み中...</div>
      ) : (
        <table border="1" style={{ borderCollapse: 'collapse' }}>
          <thead>
            <tr>
              <th style={{ padding: '10px' }}>社員ID</th>
              <th style={{ padding: '10px' }}>名前</th>
              <th style={{ padding: '10px' }}>フリガナ</th>
              <th style={{ padding: '10px' }}>年齢</th>
              <th style={{ padding: '10px' }}>Email</th>
              <th style={{ padding: '10px' }}>部署</th>
              <th style={{ padding: '10px' }}>在籍状況</th>
              <th style={{ padding: '10px' }}>住所</th>
              <th style={{ padding: '10px' }}>入社日</th>
            </tr>
          </thead>
          <tbody>
            {employees.map(emp => (
              <tr key={emp.id}>
                <td style={{ padding: '10px' }}>{emp.id}</td>
                <td style={{ padding: '10px' }}>{emp.name}</td>
                <td style={{ padding: '10px' }}>{emp.furigana}</td>
                <td style={{ padding: '10px' }}>{emp.age}</td>
                <td style={{ padding: '10px' }}>{emp.email}</td>
                <td style={{ padding: '10px' }}>{emp.department}</td>
                <td style={{ padding: '10px' }}>{emp.status}</td>
                <td style={{ padding: '10px' }}>{emp.address}</td>
                <td style={{ padding: '10px' }}>{emp.hireDate}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}

export default App
