INSERT INTO customer(id, name, last_name, document_type, document_number, email, address) VALUES('cd9ebfc1-1112-46da-a68b-5eb44bc28ecb', 'Jose', 'Hernandez', 'DNI', '78945126', 'jose.h@gmail.com', 'address 12');
INSERT INTO customer(id, name, last_name, document_type, document_number, email, address) VALUES('5a52d080-ad9c-4041-a3c3-17c32b86f960', 'Pedro', 'Quispe', 'DNI', '78945127', 'pedro.quispe@gmail.com', 'address 13');
INSERT INTO customer(id, name, last_name, document_type, document_number, email, address) VALUES('f1a9ab90-16a0-4cb2-9652-d17e3900958c', 'Felipe', 'Huamán', 'DNI', '78945128', 'pedro.quispe@gmail.com', 'address 14');
INSERT INTO customer(id, name, last_name, document_type, document_number, email, address) VALUES('61483930-4a6d-479e-b06f-8558566ad740', 'Alexis', 'Sánchez', 'DNI', '78945129', 'pedro.quispe@gmail.com', 'address 15');
INSERT INTO customer(id, name, last_name, document_type, document_number, email, address) VALUES('b714b277-f6d3-439b-bb20-33df31a41a4b', 'Leonel', 'Benitez', 'DNI', '78945130', 'leo.nitez@gmail.com', 'address 16');

INSERT INTO phone(number, country_code, customer_id) VALUES('998547856', '51', 'cd9ebfc1-1112-46da-a68b-5eb44bc28ecb');
INSERT INTO phone(number, country_code, customer_id) VALUES('999888777', '52', 'cd9ebfc1-1112-46da-a68b-5eb44bc28ecb');
INSERT INTO phone(number, country_code, customer_id) VALUES('988855544', '53', '5a52d080-ad9c-4041-a3c3-17c32b86f960');
INSERT INTO phone(number, country_code, customer_id) VALUES('999999999', '51', '5a52d080-ad9c-4041-a3c3-17c32b86f960');
INSERT INTO phone(number, country_code, customer_id) VALUES('955555555', '51', 'f1a9ab90-16a0-4cb2-9652-d17e3900958c');
INSERT INTO phone(number, country_code, customer_id) VALUES('999888555', '51', '61483930-4a6d-479e-b06f-8558566ad740');
INSERT INTO phone(number, country_code, customer_id) VALUES('999888999', '51', '61483930-4a6d-479e-b06f-8558566ad740');
INSERT INTO phone(number, country_code, customer_id) VALUES('985478578', '56', 'b714b277-f6d3-439b-bb20-33df31a41a4b');