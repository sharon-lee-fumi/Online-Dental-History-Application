CREATE DATABASE mydb;

USE mydb;

CREATE TABLE history(
	name varchar(20) NOT NULL,
    breath varchar(45) default NULL,
    bleeding varchar(45) default NULL,
    teeth varchar(45) default NULL,
    tonque varchar(45) default NULL,
    biting varchar(45) default NULL,
    floss varchar(45) default NULL,
    PRIMARY KEY  (name));
 
select * from history;