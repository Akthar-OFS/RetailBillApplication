INSERT INTO discount (discount_id, name, percentage) VALUES
	(1, 'Employee Discount', 30),
	(2, 'Affliated User Discount', 10);

INSERT INTO user_type (type_id, type_name, description, discount_id) VALUES
	(1, 'EMPLOYEE', 'Employee who woks in office', 1),
	(2, 'STORE_AFFILIATE', 'Affliated user to store', 2),
	(3, 'CUSTOMER', 'Customer who buys retail items', null);

INSERT INTO retail_user (first_name, last_name, type_id, phone, created_date) VALUES
  ('Kumareshan', 'Ramasamy', 1, '9986634382', '2019-08-26'),
  ('Bill', 'Gates', 2, '7484746354', '2019-03-22'),
  ('Henry', 'Los', 3, '9954545553', '2018-01-06'),
  ('Sathya', 'Narayanan', 3, '9754527753', '2016-10-22');
	
INSERT INTO category (category_id, name, description) VALUES
	(1, 'Stationary', 'Stationary items'),
	(2, 'Cosmetics', 'Cosmetics items'),
	(3, 'Grocery', 'Grocery items');

INSERT INTO stock_item (name, category_id, price) VALUES
	('Life Boy Soap', 2, 30),
	('Vatika Hair Oil', 2, 40),
	('Power Pen', 1, 20),
	('Natraj Pencil', 1, 30),
	('Dal', 3, 160),
	('Rice', 3, 200),
	('Salt', 3, 100);