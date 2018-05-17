--creating user table
CREATE TABLE `libraryframework`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `address` VARCHAR(125) NULL,
  `eligibility` TINYINT(1) NULL,
  `approvedBy` INT NULL,
  `createdAt` DATETIME(5) NULL,
  `updatedAt` DATETIME(5) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));
