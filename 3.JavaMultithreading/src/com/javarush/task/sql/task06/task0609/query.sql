INSERT INTO sale_addresses
SELECT street, city, state, zip_code, country
FROM customers
WHERE customers.country != 'Testostan'