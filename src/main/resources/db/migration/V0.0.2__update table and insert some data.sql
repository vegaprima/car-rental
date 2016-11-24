DROP TABLE unit;

DROP TABLE lookup;

create table unit (
  id serial,
  brand_id int,
  type_id int,
  year int,
  police_number VARCHAR (10),
  trans_id int
);

create table lookup (
  id serial,
  code VARCHAR(100),
  value VARCHAR(250)
);

INSERT INTO lookup (code, value) VALUES ('UNIT_BRANDS','HONDA');
INSERT INTO lookup (code, value) VALUES ('UNIT_BRANDS','SUZUKI');
INSERT INTO lookup (code, value) VALUES ('UNIT_TYPES','CRV');
INSERT INTO lookup (code, value) VALUES ('UNIT_TYPES','JAZZ');
INSERT INTO lookup (code, value) VALUES ('UNIT_TRANS','AT');
INSERT INTO lookup (code, value) VALUES ('UNIT_TRANS','MT');