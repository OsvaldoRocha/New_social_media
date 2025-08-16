CREATE TABLE users (
    idusers INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NULL,
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255) NULL,
    photo VARCHAR(45) NULL,
    biograph TEXT NULL,
    role ENUM('usuario', 'moderador', 'admin') DEFAULT 'usuario'
);

