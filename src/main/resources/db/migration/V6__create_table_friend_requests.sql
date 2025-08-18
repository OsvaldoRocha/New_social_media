CREATE TABLE `friend_requests` (
  `idfriend_requests` CHAR(36) NOT NULL,
  `users_idusers` CHAR(36) NOT NULL,
  `users_idusers1` CHAR(36) NOT NULL,
  `status` ENUM("pendente", "aceito", "recusado") NULL DEFAULT 'pendente',
  `data_criacao` DATETIME NULL,
  PRIMARY KEY (`idfriend_requests`),
  INDEX `fk_users_has_users_users2_idx` (`users_idusers1` ASC),
  INDEX `fk_users_has_users_users1_idx` (`users_idusers` ASC),
  UNIQUE INDEX `unique_users_pair` (`users_idusers` ASC, `users_idusers1` ASC),
  CONSTRAINT `fk_users_has_users_users1`
    FOREIGN KEY (`users_idusers`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_has_users_users2`
    FOREIGN KEY (`users_idusers1`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;