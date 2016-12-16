
CREATE DATABASE adsLister;
USE adsLister;

CREATE TABLE users (
  user_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL ,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY (user_id)
);


Create TABLE ads(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id int UNSIGNED DEFAULT NULL,
  title VARCHAR(50),
  description VARCHAR(100),
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (user_id)
);

INSERT INTO users (username, password)
VALUES ('user1', 'password1');

INSERT INTO users (username, password)
VALUES ('user2', 'password2');

INSERT INTO users (username, password)
VALUES ('user3', 'password3');

INSERT INTO users (username, password)
VALUES ('user4', 'password4');

INSERT INTO users (username, password)
VALUES ('user5', 'password5');