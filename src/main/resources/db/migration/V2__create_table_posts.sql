CREATE TABLE `posts` (
  `idposts` CHAR(36) NOT NULL,
  `conteudo` TEXT NULL,
  `midia` TEXT NULL,
  `data` DATETIME NULL,
  `users_idusers` CHAR(36) NOT NULL,
  PRIMARY KEY (`idposts`),
  INDEX `fk_posts_users1_idx` (`users_idusers` ASC),
  CONSTRAINT `fk_posts_users1`
    FOREIGN KEY (`users_idusers`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;