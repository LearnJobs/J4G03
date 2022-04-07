create database if not exists EMPLOYEE;
use  EMPLOYEE

select "designation";
show databases;

create database if not exists employee;

use employee;

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
 create table designation(
				  desig_id int(6) auto_increment not null,
                          desig_desc varchar(100), 
                          desig_abbr varchar(20), 
                          del enum("*") default null,
                          primary key(desig_id));

insert into designation(desig_desc,desig_abbr) 
	values("Chief Executive Officer","CEO"),
		("Chief Operating Officer","COO"),
		("Director General","DG"),
		("General Manager","GM"),
		("Manager Production","MGR"),
		("Junior Manager","JM");

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
create table department(
				depart_id int(6) auto_increment not null,
                        depart_name varchar(100) ,
				depart_abbr varchar(100),
				primary key (depart_id) 
				);

 insert into department(depart_name,depart_abbr)	
 		     values("Accounting Department","AD"),
				("Technical Depertment","TD"),
				("Human Resource Department","HRD"),
				("Transportation Department","TD"),
				("Research & Development Department","R&DD");

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
VALUES(501, "akhil", "srinu", 1578, 1, "M", "1997/04/12", "2001/01/04"),
      (502, "mahesh", "fasis", 1378, 2, "M", "1797/07/12", "2021/05/08"),
      (503,   "Lokesh",  "Bomkesh Sahu",  1246, 5, "M", "1997/06/13", "2022/03/03"),
      (504,   "Subendu",  "Bhabhendu Das",   1463, 6, "M", "1997/06/11", "2022/03/01"),
      (505,   "Shreyas",  "Jay Prakash",   1465, 1, "M", "1997/06/11", "2022/06//11"),
      (506,  "SimranSaah","Rajkumar Saah",1234,4, "F", "1992/09/01","2012/01/05"),
     (507,  "SurajYadav","Ram lalyadav",1236,5,"M","1990/03/02","2011/04/02"),
     (508,   "JethaLaL "," Champaklal",1456,1,"M","1989/02/05","2011/04/04"),
     (509,"Aatma Ram","  Ramlal ",1256,1,"M","1999/04/06","2013/08/02"),
     (510,"Abhijeet singh ","Ram Singh",1446,5,"M,"1967/03/09","2001/08/19"),
     (511,"Preeti Paal","Ajay Paal",1447,5,"F","1983/03/23","1999/11/02"),
     (512,"Lucifer the Devil ","God",1353,2,"M","2002/04/08","2021/12/09"),
     (513,"Iyyaar"," Hira lal",1263,5,"M","1997/02/17","2019/04/27"),
     (514,"Ram Lakhn singh","Sumit singh ",1980,3,"M","2000/03/12","2016/01/12"),
     (515,"vishal Maurya"," Ram anuj Maurya",1243,1,"M","2002/08/23","2019/02/27"),
    (516,"Shani Parihar"," Ashok Parihar",1181,4,"M","1978/1/01","2001/08/23"),
    (517,"Ali Muraad","Jaakir khan",1245,1,"M","1979/02/19","2012/01/29"),
    (518,"Sameera Singh","Sameer Singh",1222,3,"F","1991/02/28","2013/03/09"),
    (519,"Ammir Khan"," rafeek khan ",1333,1,"M","1988/06/09","2013/07/30"),
    (520,"Shruti Hussan"," Kamal Hassan ",1343,4,"F","1990/07/28","2013/04/09");
drop table if exists employ;
create table Employ(
		 employ_id int(6) auto_increment not null,
        	 employ_name varchar(100) not null,
             father_name varchar(100),
        	 desig_id int(6) not null references designation(desig_id),
        	 depart_id int(6) not null references department(depart_id),
	       gender varchar(10) ,
        	 dob  date,
             doj date,
		primary key(employ_id));

insert into Employ(employ_name,father_name, desig_id,depart_id,gender,dob,doj)
		values("Rajat singh","Veera singh",2,4,"m","1997/03/04","2016/04/08"),
			("Vijay Rana","Hari Rana",1,3,"m","1999/12/23","2021/02/04"),
			("Shyamji Yadav","Uday Yadav",3,1,"m","1991/04/01","2013/05/01"),
			("Lisa Willium","Harry Watsom",4,1,"f","1996/01/09","2010/08/02"),
			("Jully oak"," a]Alax oak",3,5,"f","1998/01/03","2020/08/01"),
			("Simran Saah","Rajkumar Saah",3,4,"f","1992/09/01","2012/01/05"),
			("Suraj Yadav","Ram lal yadav",2,5,"m","1990/03/02","2011/04/02"),
			("Jetha LaL "," Champak lal",2,1,"m","1989/02/05","2011/04/04"),
			("Aatma Ram","  Ram lal ",3,1,"m","1999/04/06","2013/08/02"),
			("Abhijeet singh ","Ram Singh",1,5,"m","1967/03/9","2001/08/19"),
			("Preeti Paal"," Ajay Paal",2,5,"f","1983/3/23","1999/11/02"),
			("Lucifer the Devil ","God",3,2,"m","2002/04/08","2021/12/09"),
			("Iyyaar"," Hira lal",3,5,"m","1997/02/17","2019/04/27"),
			("Ram Lakhn singh","Sumit singh ",1,3,"m","2000/03/12","2016/01/12"),
			("vishal Maurya"," Ram anuj Maurya",3,1,"m","2002/08/23","2019/02/27"),
			("Shani Parihar"," Ashok Parihar",1,4,"m","1978/1/01","2001/08/23"),
			("Ali Muraad","Jaakir khan",5,1,"m","1979/02/19","2012/01/29"),
			("Sameera Singh","Sameer Singh",2,3,"f","1991/02/28","2013/03/09"),
			("Ammir Khan"," rafeek khan ",3,1,"m","1988/06/09","2013/07/30"),
			("Shruti Hussan"," Kamal Hassan ",3,4,"f","1990/07/28","2013/04/09"),
			("Vansika Maurya","Kuldeep Maurya",5,3,"f","1987/08/26","2014/12/12");


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
      (2, 1235, 1378, "UNIONBANK",  "UIN0006324",  36592316),
      (3, 1236, 1246,  "UCOBANK",  "UCO0001648", 65493452),
      (4, 1237, 1463, "SYNDICATE BANK",  "SYN0005648", 97524875);
create table salary(salary_id int(6) auto_increment ,
 			  employ_id int(6) not null references employ(employ_id),
     			  desig_id  int(6) not null references designation(desig_id),
     			  bank_name varchar(100) not null,
   	  	 	  bank_ifsc varchar(30) not null,
     			  bank_ac_no varchar(100) not null,
			  salary double not null,
			  primary key(salary_id));

insert into salary(employ_id, desig_id, bank_name,bank_ifsc ,bank_ac_no,salary)
		Values(1,2,"HDFC", "HDFC000001232","6873268748732",217321.23),
			(4,2,"ICICI","ICICI23003442","827346872134732",327443.34),
			(2,3,"IDBI","IDBI0240302232","832747283432",2384687.23),
			(1,4,"HSBC","HSBC0023030020","234UT2343247673",123872.234),
			(2,5,"SBI","SBIN0000023","832648763428876",2387423.32),
			(1,4,"BOI","BOI03040043334","3246872346878273",287346.42),
			(2,3,"PNB","PNB9826387964",2364876238748724,72837667.34),
			(2,5,"INDIAN","INDIAN29836894","237648732887687",4278943.767),
			(3,1,"SINDICATE","SIN283764872648","283648726387423",3274672.35),
			(4,1,"LENA","LENA263864878","234768746822323",326487678.43),
			(1,4,"HSBC","HSBC0023030020","234UT2343247673",123872.234),
			(2,5,"SBI","SBIN0000023","832648763428876",2387423.32),
			(1,4,"BOI","BOI03040043334","3246872346878273",287346.42),
			(2,3,"PNB","PNB9826387964",2364876238748724,72837667.34),
			(1,4,"BOI","BOI03040043334","3246872346878273",287346.42),
			(2,3,"PNB","PNB9826387964",2364876238748724,72837667.34),
			(2,5,"INDIAN","INDIAN29836894","237648732887687",4278943.767),
			(3,1,"SINDICATE","SIN283764872648","283648726387423",3274672.35),
			(4,1,"LENA","LENA263864878","234768746822323",326487678.43),
			(1,4,"HSBC","HSBC0023030020","234UT2343247673",123872.234),
			(1,1,"WORLDBANK","WORLD00034348762","83275463252342344",8732687.232);

drop table if exists photo;
create  table photo(
			  photo_id int(6) auto_increment not null ,
			  employ_id int(6) references employ(employ_id), 
			  photo  varchar(100),
		    	  primary key(photo_id));			 	

select "Photo";
drop table if exists Photo;
create table  Photo(
Photo_id      int(8) auto_increment,
employ_id     int(8) not null references employ(employ_id),
Photo         BLOB,
primary key(Photo_id) 
);
insert into Photo(Photo_id, , Photo, employ_id)
values(1, 1, 1334),
      (2, 2, 1234),
      (3, 3, 1343),
      (4, 4, 1333),	 			 			 			 			 			 			 
      (5, 5, 1222),
      (6, 6, 1245),
			(7,7,),
			(8,8,),
			(9,9,),
			(10,10,),
			(11,11,),
			(12,12,),
			(13,13,),	
			(14,14,),
			(15,15,),
			(16,16,1465),
			(17,17,1463),
			(18,18,1246),
			(19,19,1378),
			(20, 20, 1578);
insert into photo(employ_id,photo)
		values(1,"img6248761287.jpg"),
			(2,"img4324242332.jpg"),
			(3,"img2342342344.jpg"),
			(4,"img3242344234.jpg"),	 			 			 			 			 			 			 
			(5,"img5234234324.jpg"),
			(6,"img2342342343.jpg"),
			(7,"img2343432434.jpg"),
			(8,"img4564564564.jpg"),
			(9,"img34534554524.jpg"),
			(10,"img24656245643.jpg"),
			(11,"img45645363453.jpg"),
			(12,"img54645624662.jpg"),
			(13,"img45262635323.jpg"),	
			(14,"img76878867867.jpg"),
			(15,"img67857685687.jpg"),
			(16,"img35635664465.jpg"),
			(17,"img75635737377.jpg"),
			(18,"img34544564645.jpg"),
			(19,"img75633733765.jpg"),
			(20,"img35634656464.jpg"),
			(21,"img35357365833.jpg"); 