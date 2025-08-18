CREATE TABLE `users` (
  `idusers` CHAR(36) NOT NULL,
  `name` VARCHAR(255) NULL,
  `email` VARCHAR(255) NULL,
  `password` VARCHAR(255) NULL,
  `photo` VARCHAR(45) NULL,
  `biograph` TEXT NULL,
  `role` ENUM('usuario', 'moderador', 'admin') NULL DEFAULT 'usuario',
  PRIMARY KEY (`idusers`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC)
) ENGINE=InnoDB;
