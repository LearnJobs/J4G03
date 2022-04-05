create database if not exists EMPLOYEE;
use  EMPLOYEE

select "designation";
drop table if exists designation;
CREATE TABLE designation(
	desig_id		INT(6)			AUTO_INCREMENT,
	desig_desc		VARCHAR(100)	NOT NULL,
	desig_abbr		VARCHAR(20),
	del             ENUM("*")		DEFAULT NULL,
	PRIMARY KEY(desig_id)
);
INSERT INTO designation(desig_id,desig_desc,desig_abbr)
VALUES(1,"Chief Executive Officer","CEO"),
	(2,"Chief Operating Officer","COO"),
	(3,"Director General","DG"),
	(4,"General Manager","GM"),
	(5,"Manager Production","MGR");

select "department";
drop table if exists department;
CREATE TABLE department(
   depart_id   INT(6)	AUTO_INCREMENT,
   depart_name VARCHAR(100) NOT NULL,
   depart_abbr VARCHAR(20),
   del             ENUM("*")		DEFAULT NULL,
   PRIMARY KEY(depart_id)
);
INSERT INTO department(depart_id , depart_name ,depart_abbr)
VALUES(10, "ComputerScienceandEngineering", "CSE"),
       (20,"MechanicalEngineering", "ME"),
       (30, "ElectricalandElectronics Engineering", "EEE"),
       (40, "ElectronicsandCommunications Engineering", "ECE"),
       (50, "InformationTechnology", "IT");


select "employ";
drop table if  exists  employ;
CREATE TABLE  employ(
	 employ_id		INT(8)			AUTO_INCREMENT,
	 employ_name     VARCHAR(100)	NOT NULL,
        father_name     VARCHAR(100)    NOT NULL,	
       	desig_id      INT(6)			NOT NULL REFERENCES designation(desig_id),
	depart_id      INT(6)                   NOT NULL REFERENCES department(depart_id),
        gender           ENUM("F","M")           DEFAULT NULL,
        date_of_birth  date not null,
        date_of_job   date not null,
	PRIMARY KEY(employ_id)
);
INSERT INTO  employ( employ_id, employ_name, father_name, desig_id,  depart_id, gender,  Date_Of_Birth,  Date_Of_Job)
VALUES(501, "akhil", "srinu", 1578, 1, "M", "1997-04-12", "2001-01-04"),
      (502, "mahesh", "fasis", 1378, 2, "M", "1797-07-12", "2021-05-08"),
    (503,   "Lokesh",  "Bomkesh Sahu",  1246, 5, "M", "1997-06-13", "2022-03-03"),
    (504,   "Subendu",  "Bhabhendu Das",   1463, 6, "M", "1997-06-11", "2022-03-01"),
    (505,   "Shreyas",  "Jay Prakash",   1465, 1, "M", "1997-06-11", "2022-03-11");

select "salary";
drop table if exists salary;
create table salary(
	salary_id int(8) auto_increment,
	employ_id int(8) not null references employ(employ_id),
         desig_id INT(6) NOT NULL REFERENCES designation(desig_id),
	bank_name varchar(100) not null,
	bank_ifsc varchar(100) not null,
	bank_ac_no int(10) not null,
	primary key(salary_id) 
);

insert into salary(salary_id, employ_id, desig_id, bank_name, bank_ifsc, bank_ac_no)
values(1, 1334, 1578, "ANDHRA BANK",  "HDFC0001234", 78435224),
      (2, 1235, 1378, "UNION BANK",  "UIN0006324",  36592316),
      (3, 1236, 1246,  "UCO BANK",  "UCO0001648", 65493452),
      (4, 1237, 1463, "SYNDICATE BANK",  "SYN0005648", 97524875);

select "Photo";
drop table if exists Photo;
create table  Photo(
Photo_id      int(8) auto_increment,
employ_id     int(8) not null references employ(employ_id),
Photo         BLOB,
primary key(Photo_id) 
);
insert into Photo(Photo_id, employ_id, Photo)
values(1, 1334, 1);