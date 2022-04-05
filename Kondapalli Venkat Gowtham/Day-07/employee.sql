create database if not exists EMPLOYEE;
use EMPLOYEE;

select "designation";
drop table if exists designation;
create table designation(
	desig_id int(6) auto_increment, desig_desc varchar(100) not null, desig_abbr varchar(20), del enum("*")	default null, primary key(desig_id)
	);

insert into designation(desig_desc, desig_abbr) values
	("Chief Executieve Officer", "CEO"),
	("Chief Operating Officer", "COO"),
	("Director General", "DG"),
	("Chief Finance Officer", "CFO"),
	("Production Manager", "PM"),
	("Junior Executive", "JE");

select "department";
drop table if exists department;
create table department(
	depart_id int(10) auto_increment,
	depart_name varchar(100),
	depart_abrr varchar(20),
	primary key(depart_id) 
	);

insert into department(depart_name, depart_abrr) values
	("Electrical Engineering Department", "EED"),
	("Software Engineering Department", "SED"),
	("Admin Department", "AD"),
	("Security Department", "SD"),
	("Finance and Account Department", "FAD"),
	("Information Technology Department", "ITD");

select "employ";
drop table if exists employ;
create table employ(
	employ_id int(8) auto_increment, 
	employ_name varchar(100) not null,
	father_name varchar(100) not null,
	desig_id int(6) not null references designstion(desig_id),
	depart_id int(6) not null references department(depart_id),
	gender enum("M","F") default null,
	date_of_birth date not null,
	date_of_joining date not null,	
	primary key(employ_id) );

insert into employ(employ_name,father_name, desig_id, depart_id, gender, date_of_birth, date_of_joining) values
	("Gowtham",  "Srinivasa Rao",   1578, 3, "M", "1997-06-11", "2022-03-01"),
	("Sunita",   "Chandra Shekhar", 1349, 2, "F", "1997-07-22", "2022-03-06"),
	("Khushboo", "BK Dubey",        1694, 4, "F", "1997-06-11", "2022-03-25"),
	("Lokesh",   "Bomkesh Sahu",    1246, 5, "M", "1997-06-13", "2022-03-03"),
	("Subendu",  "Bhabhendu Das",   1463, 6, "M", "1997-06-11", "2022-03-01"),
	("Shreyas",  "Jay Prakash",   1465, 1, "M", "1997-06-11", "2022-03-11");

select "salary";
drop table if exists salary;
create table salary(
	salary_id int(8) auto_increment,
	employ_id int(8) not null references employ(employ_id),
	bank_name varchar(100) not null,
	bank_ifsc varchar(100) not null,
	bank_ac_no int(10) not null,
	primary key(salary_id) 
	);

insert into salary(employ_id, bank_name, bank_ifsc, bank_ac_no) values
	(1578, "HDFC", "HDFC0001234", 19653820),
	(1349, "SBI", "SBIN0006324",  16795828),
	(1694, "HDFC", "HDFC0001648", 97366982),
	(1246, "HDFC", "HDFC0005648", 35987542);













	
	
























