CREATE SCHEMA IF NOT EXISTS cars;
CREATE TABLE IF NOT EXISTS cars.car
(
    car_id      uuid             not  null UNIQUE,
    year        timestamp        not null,
    mark        varchar            not null,
    mileage     integer         not  null
);

INSERT INTO cars.car
(car_id, "year", mark, mileage)
VALUES('19d3590a-12f5-4a2e-8f76-ba3d31b05b5a', '2000-01-10', 'bmw', 100);

INSERT INTO cars.car
(car_id, "year", mark, mileage)
VALUES('40ce305b-bbb5-4a59-9ebb-b1351f71fd65', '2002-01-10', 'audi', 1000);

INSERT INTO cars.car
(car_id, "year", mark, mileage)
VALUES('f1c3f8a5-611f-4b5b-ab07-da440aa15f62', '2005-01-10', 'bmw', 1000);

INSERT INTO cars.car
(car_id, "year", mark, mileage)
VALUES('a3b5c577-03c2-4190-86f3-141aca0ee5aa', '2018-01-10', 'mercedes', 10000);

INSERT INTO cars.car
(car_id, "year", mark, mileage)
VALUES('6de89579-ac3b-4fda-aa64-64fc2780a7fb', '2007-01-10', 'lada', 1000000);

INSERT INTO cars.car
(car_id, "year", mark, mileage)
VALUES('02c77284-e4c2-4125-926a-5752e7e23134', '2006-01-10', 'opel', 10078);


