CREATE TABLE `comments` (
  `idcomments` CHAR(36) NOT NULL,
  `conteudo` TEXT NULL,
  `data` DATETIME NULL,
  `posts_idposts` CHAR(36) NOT NULL,
  `users_idusers` CHAR(36) NOT NULL,
  PRIMARY KEY (`idcomments`),
  INDEX `fk_comments_posts1_idx` (`posts_idposts` ASC),
  INDEX `fk_comments_users1_idx` (`users_idusers` ASC),
  CONSTRAINT `fk_comments_posts1`
    FOREIGN KEY (`posts_idposts`) REFERENCES `posts` (`idposts`)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_comments_users1`
    FOREIGN KEY (`users_idusers`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;