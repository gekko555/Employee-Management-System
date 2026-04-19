# 従業員管理システム【未完成】

Spring Boot（バックエンド）とReact（フロントエンド）で構築されたフルスタック従業員管理アプリケーション。

## プロジェクト概要

This is a comprehensive employee management system that allows you to:
- View all employees in a structured table format
- Add new employees with detailed information
- Manage employee data including personal details, department, and employment status

## 技術スタック

### バックエンド (Java Spring Boot)
- **Framework**: Spring Boot 3.2.5
- **Java Version**: Java 21
- **Database**: MySQL with JPA/Hibernate
- **Security**: Spring Security with JWT authentication
- **Build Tool**: Maven

### フロントエンド (React + TypeScript)
- **Framework**: React 19.2.4
- **Language**: TypeScript
- **Build Tool**: Vite 8.0.1
- **Styling**: Inline CSS styles
- **Development Server**: Vite dev server

## プロジェクト構造

```
project2/
|
 employee-management-backend/          # Spring Boot Backend
 |  pom.xml                           # Maven configuration
 |  src/
 |    main/
 |      java/com/example/employeemanagementsystem/
 |        EmployeeManagementSystemApplication.java  # Main application class
 |        controller/
 |          EmployeeController.java                 # REST API endpoints
 |        service/
 |          EmployeeService.java                    # Business logic
 |        entity/
 |          Employee.java                           # JPA Entity
 |          Users.java                              # User entity
 |        dto/
 |          EmployeeCreateDto.java                  # Data transfer object for creation
 |          EmployeeDisplayDto.java                 # Data transfer object for display
 |        repository/
 |          EmployeeRepository.java                 # JPA Repository
 |          UsersRepository.java                    # User repository
 |        config/
 |          SecurityConfig.java                     # Security configuration
 |      resources/
 |        application.properties                    # Application configuration
 |
 employee-management-frontend/         # React Frontend
 |  package.json                      # NPM configuration
 |  src/
 |    App.tsx                         # Main React component
 |    main.tsx                        # Application entry point
 |    index.css                       # Global styles
 |    App.css                         # Component styles
 |
 docs/                                # Documentation
```

## 機能

### バックエンド機能
- RESTful API endpoints for employee management
- JPA database integration with MySQL
- DTO pattern for clean data transfer
- CORS support for frontend integration
- Spring Security configuration (ready for JWT implementation)

### フロントエンド機能
- Responsive employee management interface
- Form validation for employee creation
- Real-time employee list updates
- Clean table display with all employee information
- Error handling and user feedback

## APIエンドポイント

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/employees` | Retrieve all employees |
| POST | `/api/employees` | Create a new employee |

## データベーススキーマ

### 従業員エンティティ
- `id`: Long (Primary Key, Auto-generated)
- `name`: String (Employee name)
- `furigana`: String (Phonetic reading)
- `email`: String (Email address)
- `age`: Integer (Employee age)
- `address`: String (Home address)
- `department`: String (Department name)
- `hireDate`: String (Hire date)
- `status`: String (Employment status)
- `createdAt`: String (Creation timestamp)
- `updatedAt`: String (Last update timestamp)

## 前提条件

### バックエンド用
- Java 21 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### フロントエンド用
- Node.js 18 or higher
- npm or yarn package manager

## インストールとセットアップ

### 1. リポジトリのクローン
```bash
git clone <repository-url>
cd project2
```

### 2. バックエンドセットアップ

#### データベース設定
1. Create a MySQL database:
```sql
CREATE DATABASE employee_management;
```

2. Update `employee-management-backend/src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

#### バックエンドの実行
```bash
cd employee-management-backend
mvn clean install
mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

### 3. フロントエンドセットアップ

#### 依存関係のインストール
```bash
cd employee-management-frontend
npm install
```

#### フロントエンドの実行
```bash
npm run dev
```

The frontend will start on `http://localhost:5173`

## 使用方法

1. **Start the Backend**: Run the Spring Boot application
2. **Start the Frontend**: Run the React development server
3. **Access the Application**: Open `http://localhost:5173` in your browser
4. **Add Employees**: Use the form to add new employees
5. **View Employees**: The table will display all registered employees

## 開発

### バックエンド開発
- Use `mvn spring-boot:run` for development
- API documentation available at `http://localhost:8080/swagger-ui.html` (if configured)
- Database changes are automatically applied with `ddl-auto=update`

### フロントエンド開発
- Use `npm run dev` for hot-reloading development
- Build for production with `npm run build`
- Lint code with `npm run lint`

## セキュリティ機能

- Spring Security integration ready for JWT implementation
- CORS configuration for frontend-backend communication
- Input validation on both frontend and backend

## 今後の拡張

- JWT authentication implementation
- Employee update and delete operations
- Advanced filtering and search
- File upload for employee photos
- Export functionality (PDF, Excel)
- Role-based access control
- Audit logging

## コントリビューション

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## ライセンス

This project is for educational purposes and learning Java/Spring Boot development.

## トラブルシューティング

### 一般的な問題

1. **Database Connection Error**
   - Ensure MySQL is running
   - Check database credentials in application.properties
   - Verify database exists

2. **CORS Issues**
   - Backend CORS is configured for localhost:3000 and localhost:5173
   - Ensure frontend is running on these ports

3. **Port Conflicts**
   - Backend default: 8080
   - Frontend default: 5173
   - Change ports if conflicts occur

### サポート

For issues and questions, please check the existing documentation or create an issue in the repository.
