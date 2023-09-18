create table people (
                              id serial PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              email VARCHAR(255) UNIQUE,
                              age INT NOT NULL,
                              city VARCHAR(100)
);
