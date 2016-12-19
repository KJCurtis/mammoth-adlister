
Create DATABASE IF NOT EXISTS adlister;

USE adlister;

CREATE TABLE IF NOT EXISTS users (
  user_id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(50),
  email    VARCHAR(100),
  password VARCHAR(100),
  PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS ads (
  id      INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  content TEXT         NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (user_id)
);
 