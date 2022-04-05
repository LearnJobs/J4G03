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
	("shirisha",  "Anji",   1234, 3, "F", "2000-10-30", "2021-06-24"),
	("manasa",   "Ramesh", 1235, 2, "F", "2003-06-25", "2020-05-22"),
	("Anusha", "Ramesh",        1236, 4, "F", "2000-03-2", "2020-07-26"),
	("sravanthi",   "Ramesh",    1237, 5, "F", "2000-04-2", "2019-01-20"),
	("Prasanna",  "Narasimha chary",   1238, 6, "F", "2000-03-25", "2020-05-28"),
	("Rakhi",  "Ramu",   1239, 1, "M", "1997-06-11", "2006-10-3","2021-08-27");

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
	(1234, "ANDHRA BANK", "HDFC0001234", 78435224),
	(1235, "UNION BANK", "SBIN0006324",  36592316),
	(1236, "KDCC", "HDFC0001648", 65493452),
	(1237, "ANDHRA BANK", "HDFC0005648", 97524875);

