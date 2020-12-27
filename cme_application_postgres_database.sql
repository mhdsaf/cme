drop database cme_application_postgresdb;
drop user cme_application_admin;
create user cme_application_admin with password 'password';
create database cme_application_postgresdb with template=template0 owner=cme_application_admin;
\connect cme_application_postgresdb;
alter default privileges grant all on tables to cme_application_admin;
alter default privileges grant all on sequences to cme_application_admin;

create table questions(
question_id SERIAL PRIMARY KEY,
type varchar(20) not null,
question text not null
);

create table answers(
answer_id SERIAL PRIMARY KEY,
answer text not null,
question_id integer REFERENCES questions(question_id)
);