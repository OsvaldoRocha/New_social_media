CREATE TABLE messages (
    idmessages INT AUTO_INCREMENT PRIMARY KEY,
    conteudo TEXT NULL,
    data DATETIME NULL,
    users_idusers INT NOT NULL,

    CONSTRAINT fk_messages_users FOREIGN KEY (users_idusers) REFERENCES users(idusers)
);
