CREATE TABLE security(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(255) NOT NULL UNIQUE,
password VARCHAR(255) NOT NULL,
roles VARCHAR(15) DEFAULT 'USER',
status VARCHAR(15) DEFAULT 'ACTIVE'
)
ENGINE = InnoDB;

INSERT INTO security (email,password,roles)
VALUES ('user@mail.ru','$2y$12$WPzhk1/87spB8uRF7CJoteLWhT7bB0uX6DzvPOo51paWQJ6xJe2nG','USER'),
('admin@mail.ru','$2y$12$HURoEMxhh0xogQvUs5t6JOLNffIw4YKhRm1UvmzhtEmPJ9wkwibza','ADMIN')

