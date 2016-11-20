create table unit (
  id serial primary key,
  brand_id int,
  type_id int,
  year int,
  police_number VARCHAR (10),
  trans_id int
);

create table lookup (
  id serial primary key,
  code VARCHAR(100),
  value VARCHAR(250)
);