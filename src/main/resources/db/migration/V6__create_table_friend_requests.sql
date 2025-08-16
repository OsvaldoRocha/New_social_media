CREATE TABLE friend_requests (
    idfriend_requests INT AUTO_INCREMENT PRIMARY KEY,
    users_idusers INT NOT NULL,
    users_idusers1 INT NOT NULL,
    status ENUM('pendente', 'aceito', 'recusado') DEFAULT 'pendente',
    data_criacao DATETIME NULL,

    CONSTRAINT fk_friend_requests_sender FOREIGN KEY (users_idusers) REFERENCES users(idusers),
    CONSTRAINT fk_friend_requests_receiver FOREIGN KEY (users_idusers1) REFERENCES users(idusers)
);
