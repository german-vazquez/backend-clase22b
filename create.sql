drop table if exists entrenadores;
create table entrenadores(id int auto_increment primary key, nombre varchar(50) not null);
insert into entrenadores (nombre) values ('pedro');
insert into entrenadores (nombre) values ('juan');