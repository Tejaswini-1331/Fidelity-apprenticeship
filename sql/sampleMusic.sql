--creating tables



create table artist(
artistid int primary key,
name_ varchar(30)
)

insert into artist values(1,'AC'),(2,'SMITH'),(3,'ALEX'),(4,'Aerosmith')

create table album(
albumid int primary key,
title varchar(50),
artistid int,
foreign key (artistid) references artist(artistid)
)

insert into album values(1,'for those who rock',3),(2,'balls to the wall',2),(3,'fast as a shark',1),
(4,'restless and wild',1),(5,'princess of the daw',2),(6,'put fingers on u',4)

create table genre(
Genreid int primary key,
Name_ varchar(50)
)

insert into genre values(1,'rock'),(2,'jazz'),(3,'classical'),(4,'Metal'),(5,'suttle')

create table track(
trackid serial primary key,
tname varchar(50),
albumid int,
Genreid int,
Composer varchar(50),
foreign key(albumid) references album(albumid),
Foreign key (Genreid) references genre(Genreid)
)

insert into track(tname,albumid,Genreid,Composer) values('for those who',1,1,'some guy'),('PRINCESSDAW',2,1,'AC/DC'),
('restless and wild',3,1,'AC/DC'),('balls on the wall',3,2,'AC/DC'),('hiii',4,2,'AC/DC'),
('cheap thrills',2,1,'AC/DC')





