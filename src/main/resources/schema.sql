CREATE TABLE discount (
	discount_id INT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	percentage TINYINT(3) NOT NULL
);

CREATE TABLE user_type (
	type_id INT NOT NULL PRIMARY KEY,
	type_name VARCHAR(250) NOT NULL,
	description VARCHAR(250) NULL,
	discount_id INT NULL
);

ALTER TABLE user_type ADD CONSTRAINT fk_user_type_discount FOREIGN KEY
(
   discount_id
)
REFERENCES discount (discount_id) ON UPDATE CASCADE ON DELETE RESTRICT;
 
CREATE TABLE retail_user (
	user_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(250) NOT NULL,
	last_name VARCHAR(250) NOT NULL,
 	type_id INT UNSIGNED NOT NULL,
  	phone VARCHAR(100) NOT NULL,
  	created_date DATETIME NOT NULL
);

ALTER TABLE retail_user ADD CONSTRAINT fk_user_type FOREIGN KEY
(
   type_id
)
REFERENCES user_type (type_id) ON UPDATE CASCADE ON DELETE RESTRICT;

CREATE TABLE category (
	category_id INT NOT NULL PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	description VARCHAR(250) NULL
);

CREATE TABLE stock_item (
	item_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	category_id INT UNSIGNED NOT NULL,
	price DECIMAL(17,2) UNSIGNED NOT NULL
);

ALTER TABLE stock_item ADD CONSTRAINT fk_category FOREIGN KEY
(
   category_id
)
REFERENCES category (category_id) ON UPDATE CASCADE ON DELETE RESTRICT;