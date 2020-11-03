INSERT INTO Ref_Countries(country)
VALUES	('country 1'),
		('country 2');
INSERT INTO Ref_Cities (city, country_id)
VALUES	('city 1', 1),
		('city 2', 1),
        ('city 3', 2);
INSERT INTO Adresses (line_1,line_2,district,postal_code,city_id)
VALUES	('this street','this number','province', 5000, 1),
		('this other street', 'this other number', 'some province', 3000, 2),
		('etc','...', 'province 3', 2000, 3),
        ('P. Sherman', 'Wallabi 42', 'Sydney',6500,3);
INSERT INTO Branches (adress_id,capital, number_of_clients, bank_id)
VALUES  (2,1000000.00, 50000, 1),
		(3,34000000.00, 70000,3),
        (1,700000000.00, 45000, 2);
INSERT INTO Ref_Client_Type (client_type)
VALUES  ('person'),
		('society'),
        ('legal entity');
INSERT INTO Ref_Employee_Type (type)
VALUES	('cashier'),
		('account manager');
INSERT INTO Ref_Transaction_Type (transaction_type)
VALUES	('monetary transaction'),
		('ATM'),
		('Online'),
		('Check'),
        ('Move Shares');
INSERT INTO Employees (salary, branch_id, employee_type_id, transaction_type_id)
VALUES	(5000, 2, 1, 1),
		(3000, 1, 2,1);
INSERT INTO Clients (branch_id,adress_id,customer_type_id,first_name,last_name,phone_number,employee_id)
VALUES	(3, 2, 1, 'Manuel', 'Benitez','123456789', 1),
		(3, 2, 1, 'Matias', 'Benitez','123453456', 1);
		(1,1,2,'Evil','Corp.','987654321',2),
        (2,4,1, 'John', 'Wick', 987785764, 2);
        