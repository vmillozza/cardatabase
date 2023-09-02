CREATE TABLE IF NOT EXISTS `car` (
    `id`             BIGINT AUTO_INCREMENT  PRIMARY KEY,
    `brand`          VARCHAR(255) NOT NULL,
    `model`          VARCHAR(255) NOT NULL,
    `color`          VARCHAR(255) NOT NULL,
    `registerNumber` VARCHAR(255) NOT NULL,
    `year`           INT  DEFAULT  NULL,
    `price`          INT DEFAULT  NULL
);