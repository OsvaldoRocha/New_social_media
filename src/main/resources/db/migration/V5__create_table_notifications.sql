CREATE TABLE `notification` (
  `idnotification` CHAR(36) NOT NULL,
  `tipo` VARCHAR(45) NULL,
  `conteudo` TEXT NULL,
  `data` DATETIME NULL,
  `lida` ENUM("sim", "nao") NULL DEFAULT 'nao',
  `users_idusers` CHAR(36) NOT NULL,
  PRIMARY KEY (`idnotification`),
  INDEX `fk_notification_users1_idx` (`users_idusers` ASC),
  CONSTRAINT `fk_notification_users1`
    FOREIGN KEY (`users_idusers`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;