SELECT * FROM clients
RIGHT JOIN branches ON clients.branch_id = branches.id
RIGHT JOIN adresses ON clients.adress_id = adresses.id
RIGHT JOIN client_type ON clients.customer_type_id = client_type.id
RIGHT JOIN employees ON clients.employee_id = employees.id