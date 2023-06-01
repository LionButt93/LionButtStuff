CREATE TABLE owners
(owners_id serial PRIMARY KEY,
 owner_name text,
 phone_number int,
 email text
);

CREATE TABLE dogs 
(dog_id serial PRIMARY KEY,
dog_name TEXT, 
dog_age int, 
dog_breed text, 
vaccinations boolean, 
owner_id_fk int REFERENCES owners(owners_id)
);

INSERT INTO owners (owner_name, phone_number, email)
VALUES
()

INSERT INTO dogs (dog_name, dog_age, dog_breed, vaccinations, owner_id_fk)
VALUES
()