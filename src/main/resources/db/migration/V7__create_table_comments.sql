CREATE TABLE comments (
    idcomments INT AUTO_INCREMENT PRIMARY KEY,
    conteudo TEXT NULL,
    data DATETIME NULL,
    posts_idposts INT NOT NULL,
    users_idusers INT NOT NULL,

    CONSTRAINT fk_comments_posts FOREIGN KEY (posts_idposts) REFERENCES posts(idposts),
    CONSTRAINT fk_comments_users FOREIGN KEY (users_idusers) REFERENCES users(idusers)
);
