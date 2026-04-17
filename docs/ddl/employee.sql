CREATE TABLE `employee` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '社員ID',
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '氏名',
  `furigana` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ふりがな',
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'メールアドレス',
  `age` int NOT NULL COMMENT '年齢',
  `address` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '住所',
  `department` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '部署',
  `hire_date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '入社日',
  `status` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '在籍中' COMMENT '在籍状況',
  `created_at` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `updated_at` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  KEY `idx_email` (`email`),
  KEY `idx_department` (`department`),
  KEY `idx_status` (`status`),
  CONSTRAINT `employee_chk_1` CHECK (((`age` >= 18) and (`age` <= 100)))
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='社員情報テーブル'