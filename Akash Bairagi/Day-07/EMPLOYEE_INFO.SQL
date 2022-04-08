create database if not exists EMPLOYEE_INFO;
use EMPLOYEE_INFO;

select "designation";
drop table if exists designation;
create table designation(

	desig_id int(8) auto_increment, desig_desc varchar(100) not null, desig_abbr varchar(30), del enum("*")	default null, primary key(desig_id)
	);

insert into designation(desig_desc, desig_abbr) values
    
	("Chief Executieve Officer", "CEO"),
  	("Area Sales Manager",       "ASM"),
	("Chief Marketing Officer",  "CMO"),
	("Chief Operating Officer",  "COO"),
	("Director General",         "DG"),
	("Chief Finance Officer",    "CFO"),
	("Chief Technology Officer", "CTO"),
	("Production Manager",       "PM"),
	("Junior Executive",         "JE"),
	("Chief legal Officer",      "CLO");

select "department";
drop table if exists department;
create table department(
	depart_id int(10) auto_increment,
	depart_name varchar(100),
	depart_abrr varchar(30),
	primary key(depart_id) 
	);

insert into department(depart_name, depart_abrr) values
	("Computer Science & Engineering Department", "CSD"),
	("Cloud Computuing Department",      "CCD"),    
	("Software Engineering Department",  "SED"),
	("Computer Networking Department",   "CND"),
	("Machine Learning Department" ,     "MLD"),
	("Network Security Department",      "NSD"),
	("Information Technology Department","ITD");

select "employ";
drop table if exists employ;
create table employ(
	employ_id int(8) auto_increment, 
	employ_name varchar(100) not null,
	father_name varchar(100) not null,
	desig_id int(8) not null references designstion(desig_id),
	depart_id int(8) not null references department(depart_id),
	gender enum("M","F") default null,
	date_of_birth date not null,
	date_of_joining date not null,	
	primary key(employ_id) );

insert into employ(employ_name,father_name, desig_id, depart_id, gender, date_of_birth, date_of_joining) values
	("Ajay",     "Vijay kumar",     1612, 4, "M", "1994-02-10", "2022-03-05"),
	("Aman",     "Prakash Porwal",  1689, 3, "M", "1995-06-03", "2022-03-09"),
	("Hena",     "Rehan khan",      1612, 2, "F", "1994-02-03", "2022-03-10"),
	("Rahul",    "Ranjit Rai",      1385, 1, "M", "1998-02-19", "2022-03-01"),
	("Ankit",    "Udai Panchal ",   1526, 9, "M", "1997-02-10", "2022-03-03"),
	("Ram",      "Sunil dixit",     1758, 6, "M", "1992-02-02", "2022-03-30"),
	("Amit",     "Ramesh Upadhay",  1866, 7, "M", "1995-02-03", "2022-02-21");

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
	(1050, "SBI", "SBIN0006529",  195866331144),
	(2613, "ICICI","ICICI0001312",156816795828),
	(1566, "BOI", "BIO0007896",   207895611255),
	(1133, "HDFC", "HDFC0006642", 223366884478);
