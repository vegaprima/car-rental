create table driver (
  id serial,
  name VARCHAR (250),
  place_of_birth VARCHAR (100),
  date_of_birth DATE,
  gender_id int,
  telp VARCHAR (20),
  address VARCHAR (250),
  province_id int,
  city_id int,
  license_type_id int,
  years_of_experience int,
  status_id int
);

ALTER TABLE lookup ADD parent int;

TRUNCATE lookup;

INSERT INTO lookup (id, code, value) VALUES (1, 'UNIT_BRANDS','HONDA');
INSERT INTO lookup (id, code, value) VALUES (2, 'UNIT_BRANDS','SUZUKI');
INSERT INTO lookup (id, code, value, parent) VALUES (3, 'UNIT_TYPES','CRV', 1);
INSERT INTO lookup (id, code, value, parent) VALUES (4, 'UNIT_TYPES','JAZZ', 1);
INSERT INTO lookup (id, code, value) VALUES (5, 'UNIT_TRANS','AT');
INSERT INTO lookup (id, code, value) VALUES (6, 'UNIT_TRANS','MT');
INSERT INTO lookup (id, code, value) VALUES (7, 'GENDER','MALE');
INSERT INTO lookup (id, code, value) VALUES (8, 'GENDER','FEMALE');
INSERT INTO lookup (id, code, value) VALUES (9, 'PROVINCE','West Java');
INSERT INTO lookup (id, code, value, parent) VALUES (10, 'CITY','Depok', 9);
INSERT INTO lookup (id, code, value) VALUES (11, 'LICENSE_TYPE','A');
INSERT INTO lookup (id, code, value) VALUES (12, 'DRIVER_STATUS','Active');
INSERT INTO lookup (id, code, value) VALUES (13, 'DRIVER_STATUS','Inactive');