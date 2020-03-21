drop table Person;
create table Person(
id integer not null,
name varchar(225) not null,
location varchar(225) not null,
primary key(id)
);

insert into Person values (1,'Siddharth','Bangalore');
insert into Person values (2,'Rajat','Noida');
insert into Person values (3,'Aditya','Hyderabad');
insert into Person values (4,'Ayan','Gurugram');
insert into Person values (5,'Rishabh','Bareilly');
insert into Person values (6,'Sparsh','IIT');