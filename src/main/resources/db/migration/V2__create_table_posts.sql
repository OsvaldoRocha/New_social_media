CREATE TABLE posts (
    idposts INT AUTO_INCREMENT PRIMARY KEY,
    conteudo TEXT NULL,
    midia TEXT NULL,
    data DATETIME NULL,
    users_idusers INT NOT NULL,

    CONSTRAINT fk_posts_users FOREIGN KEY (users_idusers) REFERENCES users(idusers)
);
