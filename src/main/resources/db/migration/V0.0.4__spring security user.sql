CREATE TABLE public.user_role
(
  id SERIAL PRIMARY KEY,
  user_id INT NOT NULL,
  role_id INT NOT NULL
);

CREATE TABLE public.role
(
  id SERIAL PRIMARY KEY,
  name VARCHAR(100)
);

CREATE TABLE public."user"
(
  id SERIAL PRIMARY KEY,
  username VARCHAR(100),
  password VARCHAR(500)
);

INSERT INTO role (id, name) VALUES (1,'user');