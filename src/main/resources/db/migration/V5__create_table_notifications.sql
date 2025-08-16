CREATE TABLE notifications (
    idnotification INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(45) NULL,
    conteudo TEXT NULL,
    data DATETIME NULL,
    lida ENUM('sim', 'nao') DEFAULT 'nao',
    users_idusers INT NOT NULL,

    CONSTRAINT fk_notifications_users FOREIGN KEY (users_idusers) REFERENCES users(idusers)
);
