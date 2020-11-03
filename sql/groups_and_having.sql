SELECT branches.id, adresses.line_1,adresses.line_2, branches.capital 
FROM branches INNER JOIN adresses 
ON branches.adress_id = adresses.id
HAVING branches.capital > 1000000;

SELECT countries.country, countries.id, COUNT(cities.id)
FROM countries INNER JOIN cities 
ON countries.id=cities.country_id
GROUP BY countries.id
HAVING countries.id > 0;

SELECT countries.country, countries.id, cities.id AS cities_id
FROM countries INNER JOIN cities 
ON countries .id=cities.country_id
HAVING cities.id > 0;

SELECT adresses.id, adresses.line_1, adresses.line_2, clients.adress_id, COUNT(clients.id)
FROM adresses INNER JOIN clients
ON adresses.id=clients.adress_id
GROUP BY adresses.id
HAVING clients.adress_id=2;

SELECT adresses.id AS adress_id, adresses.line_1, adresses.line_2, clients.adress_id AS clients_adress_id, clients.id AS clients_id
FROM adresses INNER JOIN clients
ON adresses.id=clients.adress_id
HAVING clients.adress_id=2;

SELECT client_type.id, client_type.client_type, COUNT(clients.id)
FROM client_type INNER JOIN clients
ON client_type.id=clients.customer_type_id
GROUP BY client_type.id
HAVING client_type='Person';

SELECT client_type.id, client_type.client_type, clients.id AS client_id, clients.first_name, clients.last_name
FROM client_type INNER JOIN clients
ON client_type.id=clients.customer_type_id
HAVING client_type='Person';
