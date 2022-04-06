CREATE DATABASE IF NOT EXISTS ashu;
USE ashu;

SELECT "designation";
DROP TABLE IF EXISTS designation;
CREATE TABLE designation(
	desig_id		INT(6)			AUTO_INCREMENT,
	desig_desc		VARCHAR(100)	NOT NULL,
	desig_abbr		VARCHAR(20),
	del             ENUM("*")		DEFAULT NULL,
	PRIMARY KEY(desig_id)
);
INSERT INTO designation(desig_desc,desig_abbr) VALUES
	("Chief Executive Officer","CEO"),
	("Chief Operating Officer","COO"),
	("Director General","DG"),
	("General Manager","GM"),
	("Junior Manager","JM");


SELECT "department";
DROP TABLE IF EXISTS department;
CREATE TABLE department(
    depart_id       INT(6)			AUTO_INCREMENT,
    depart_name     VARCHAR(50)		NOT NULL,
    depart_abbr     VARCHAR(20),
    del				ENUM("*")		DEFAULT NULL,
	PRIMARY KEY(depart_id)
);
INSERT INTO department(depart_name,depart_abbr) VALUES
	("System",		"CEO"),
	("Marketing",	"COO"),
	("Hotel",		"Manager"),
	("Sales",		"AM"),
	("Bussiness",	"MD");


SELECT "employee";
DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
    employ_id		INT(6)			AUTO_INCREMENT,
    employ_name		VARCHAR(50)     NOT NULL,
    father_name		VARCHAR(50)		NOT NULL,
    desig_id		VARCHAR(20)		NOT NULL REFERENCES designation(desig_id),
    depart_id		VARCHAR(10)     NOT NULL REFERENCES department(depart_id),
    gender			VARCHAR(1)      NOT NULL,
    dob				VARCHAR(20)		NOT NULL,
    doj				VARCHAR(20)		NOT NULL,
	PRIMARY KEY(employ_id)
);
INSERT INTO employee(employ_name,father_name,desig_id, depart_id,gender,dob,doj) VALUES
	("ashu","mr satish kumar","dhj235","617876","m","01-08-2001","01-04-2022"),
	("vikas","mr ashu kumar","dhj25","678726","m","01-09-2001","01-04-2022"),
	("ansh","mr vasu kumar","dhj2335","678476","m","01-07-2011","01-04-2022"),
	("rishabh","mr ankit kumar","dhfj235","2667876","m","01-03-2001","01-04-2022"),
	("anurag","mr anuj kumar","dhj2345","678776","m","02-07-2001","01-04-2022"),
	("akash","mr anurag kumar","dhj2385","678796","m","03-07-2001","01-04-2022"),
	("veeresh","mr akash kumar","dhj2315","678766","m","11-07-2001","01-04-2022"),
	("lokesh","mr sveeresh kumar","dhj2235","675876","m","21-07-2001","01-04-2022"),
	("shalini","mr satish kumar","dhj2335","678746","f","06-07-2001","01-04-2022"),
	("anshika","mr satish kumar","dhj2375","6787386","f","07-07-2001","01-04-2022"),
	("nisha","mr satish kumar","dhj2535","678756","f","01-07-2001","01-04-2022"),
	("akrati","mr satish kumar","dhj2135","678176","f","09-07-2001","01-04-2022"),
	("vanshika","mr satish kumar","dhjh235","672876","f","01-07-2001","01-04-2022"),
	("myank","mr satish kumar","dhjs235","678763","m","01-07-2002","01-04-2022"),
	("monu","mr satish kumar","dhju235","674876","m","01-07-2003","01-04-2022"),
	("vinay","mr satish kumar","dhjl235","657876","m","01-07-2005","01-04-2022"),
	("ankit","mr satish kumar","dhjw235","667876","m","01-07-2006","01-04-2022"),
	("ashutosh","mr satish kumar","dfhj235","767876","m","01-08-2001","01-04-2022"),
	("narayan","mr satish kumar","dhdj235","687876","m","24-07-2001","01-04-2022"),
	("vashu","mr satish kumar","dhje235","678796","m","27-07-2001","01-04-2022");


SELECT "salary";
DROP TABLE IF EXISTS salary;
CREATE TABLE salary(
    salary_id	INT(6)			NOT	NULL AUTO_INCREMENT,
    employ_id	INT(6)			NOT NULL,
    bank_name	VARCHAR(10)		NOT NULL,
    bank_ifsc	VARCHAR(12)		NOT NULL,
    bank_ac_no	VARCHAR (20)	NOT NULL UNIQUE,
	PRIMARY KEY(salary_id)
);
INSERT INTO salary(employ_id,bank_name,bank_ifsc,bank_ac_no) VALUES
	(0001,	"hdfc","hdfc0022f","0146862516279"),
	(0002,	"hdfc","hdfc0022f","0134862516279"),
	(0003,	"hdfc","hdfc0022f","01368662516279"),
	(0004,	"hdfc","hdfc0022f","01367625162793"),
	(0005,	"hdfc","hdfc0022f","0134862516427329"),
	(0006,	"hdfc","hdfc0022f","01367625167279"),
	(0007,	"hdfc","hdfc0022f","01368762516279"),
	(0008,	"hdfc","hdfc0022f","0136782516279"),
	(0009,	"hdfc","hdfc0022f","01368572516279"),
	(0010,	"hdfc","hdfc0022f","01368552516279"),
	(0011,	"hdfc","hdfc0022f","0136882516279"),
	(0012,	"hdfc","hdfc0022f","0136867516279"),
	(0013,	"hdfc","hdfc0022f","01368625416279"),
	(0014,	"hdfc","hdfc0022f","013686250765279"),
	(0015,	"hdfc","hdfc0022f","0513686257579"),
	(0016,	"hdfc","hdfc0022f","0136786251866779"),
	(0017,	"hdfc","hdfc0022f","01368625168669"),
	(0018,	"hdfc","hdfc0022f","0139686251655679"),
	(0019,	"hdfc","hdfc0022f","013686325162677"),
	(0020,	"hdfc","hdfc0022f","01366862516266");