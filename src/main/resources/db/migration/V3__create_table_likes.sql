CREATE TABLE likes (
    idlikes INT AUTO_INCREMENT PRIMARY KEY,
    posts_idposts INT NOT NULL,
    users_idusers INT NOT NULL,
    data DATETIME NULL,

    CONSTRAINT fk_likes_posts FOREIGN KEY (posts_idposts) REFERENCES posts(idposts),
    CONSTRAINT fk_likes_users FOREIGN KEY (users_idusers) REFERENCES users(idusers)
);
