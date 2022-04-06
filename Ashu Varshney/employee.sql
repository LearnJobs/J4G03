create database project;
use project;
create table  designation(
	desig_id		INT(6)			AUTO_INCREMENT,
	desig_desc		VARCHAR(100)	NOT NULL,
	desig_abbr		VARCHAR(20),
	del             ENUM("*")		DEFAULT NULL
);
INSERT INTO designation(desig_desc,desig_abbr) VALUES
	("Chief Executive Officer","CEO"),
	("Chief Operating Officer","COO"),
	("Director General","DG"),
	("General Manager","GM"),
	("Junior Manager","JM");
create table department(
        depart_id        int (6)    auto_increament,
        depart_name      varchar(50)    not null,
        depart_abbr      varchar(20)  , 
        del           enum("*")      default null
);
insert into department(depart_name,depart_abbr)
values
("system","ceo"),
("marketing","coo"),
("hotel","manager"),
("sales","am"),
("bussiness","md");

create table  employee(
  employ_id     int(6)   auto_increment,
  employ_name   varchar(50)     not null,
  father_name   varchar(50)    not null,
  desig_id      varchar(20)    not null unique,
  depart_id    varchar(10)     not null unique,
  gender       varchar(1)      not null,
  dob          varchar(20)    not null unique,
  doj          varchar(20)    not null
);
insert into employee(employ_name,father_name,desig_id, depart_id,gender,dob,doj)
values
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

create table salary(
    employ_id  int(6) auto_increment,
    salary_id  int(6)   not null unique,
    bank_name  varchar(10)  not null,
    bank_ifsc  varchar(12)  not null,
    bank_ac_no varchar (12) not null unique
);
insert into salary(salary_id,bank_name,bank_ifsc,bank_ac_no)
values
(0001;,"hdfc""hdfc0022f","0146862516279"),
(0002;,"hdfc""hdfc0022f","0134862516279"),
(0003;,"hdfc""hdfc0022f","01368662516279"),
(0004;,"hdfc""hdfc0022f","0136762516279"),
(0005;,"hdfc""hdfc0022f","0134862516279"),
(0006;,"hdfc""hdfc0022f","0136762516279"),
(0007;,"hdfc""hdfc0022f","01368762516279"),
(0008;,"hdfc""hdfc0022f","0136782516279"),
(0009;,"hdfc""hdfc0022f","01368572516279"),
(0010;,"hdfc""hdfc0022f","01368552516279"),
(0011;,"hdfc""hdfc0022f","0136882516279"),
(0012;,"hdfc""hdfc0022f","0136867516279"),
(0013;,"hdfc""hdfc0022f","01368625416279"),
(0014;,"hdfc""hdfc0022f","01368625076279"),
(0015;,"hdfc""hdfc0022f","013686257579"),
(0016;,"hdfc""hdfc0022f","013686251866779"),
(0017;,"hdfc""hdfc0022f","0136862516669"),
(0018;,"hdfc""hdfc0022f","013686251655679"),
(0019;,"hdfc""hdfc0022f","01368625162677"),
(0020;,"hdfc""hdfc0022f","0136862516266");



  