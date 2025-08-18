CREATE TABLE `messages` (
  `idmessages` CHAR(36) NOT NULL,
  `conteudo` TEXT NULL,
  `data` DATETIME NULL,
  `sender_id` CHAR(36) NOT NULL,
  `receiver_id` CHAR(36) NOT NULL,
  PRIMARY KEY (`idmessages`),
  INDEX `fk_messages_users1_idx` (`sender_id` ASC),
  INDEX `fk_messages_users2_idx` (`receiver_id` ASC),
  CONSTRAINT `fk_messages_users1`
    FOREIGN KEY (`sender_id`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_messages_users2`
    FOREIGN KEY (`receiver_id`) REFERENCES `users` (`idusers`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;