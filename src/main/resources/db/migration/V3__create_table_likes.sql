CREATE TABLE `likes` (
  `idlikes` CHAR(36) NOT NULL,
  `posts_idposts` CHAR(36) NOT NULL,
  `data` DATETIME NULL,
  `users_idusers` CHAR(36) NOT NULL,
  PRIMARY KEY (`idlikes`),
  INDEX `fk_likes_posts1_idx` (`posts_idposts` ASC),
  INDEX `fk_likes_users1_idx` (`users_idusers` ASC),
  CONSTRAINT `fk_likes_posts1`
    FOREIGN KEY (`posts_idposts`) REFERENCES `posts` (`idposts`)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_likes_users1`
    FOREIGN KEY (`users_idusers`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;