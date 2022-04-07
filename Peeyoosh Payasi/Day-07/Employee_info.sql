show databases;

create database if not exists employee_info;
 
use employee_info;

drop table if exists designation;
 create table designation(
			   desig_id         int(6)           auto_increment not null,
                          desig_desc        varchar(100), 
                          desig_abbr         varchar(20), 
                          del enum("*")                      default null,
                          primary key(desig_id));

insert into designation(desig_desc,desig_abbr) 
	values("Chief Executive Officer","CEO"),
		("Chief Operating Officer","COO"),
		("Director General","DG"),
		("General Manager","GM"),
		("Manager Production","MGR"),
		("Junior Manager","JM");

drop table if exists department;
create table department(
			depart_id             int(6)          auto_increment not null,
                        depart_name           varchar(100) ,
			depart_abbr           varchar(100),
			primary key (depart_id) 
			);

 insert into department(depart_name,depart_abbr)	
 		     values("Accounting Department","AD"),
			   ("Technical Depertment","TD"),
			   ("Human Resource Department","HRD"),
			   ("Transportation Department","TD"),
			   ("Research & Development Department","R&DD");

drop table if exists employ;
create table Employ(
		     employ_id     int(6)          auto_increment not null,
        	     employ_name   varchar(100)    not null,
                     father_name   varchar(100),
        	     desig_id      int(6)          not null references designation(desig_id),
        	     depart_id     int(6)          not null references department(depart_id),
	             gender        varchar(10) ,
        	     dob           date,
                     doj           date,
		     primary key(employ_id));

insert into Employ(employ_name,father_name, desig_id,depart_id,gender,dob,doj)
		values("Aman chaddha","HariLal Chaddha",2,4,"m","1991/11/07","2001/03/23"),
			("Mohan khattar","Praveen Khattar",1,3,"m","1997/10/05","2018/01/22"),
			("Shubham sen","Laljee Sen",3,1,"m","1995/02/12","2011/11/09"),
			("Neha mittal","Krishna Mittal",4,1,"f","2001/01/09","2010/08/02"),
			("Alexa tom","Harry Tom  ",3,5,"f","1999/04/29","2018/07/17"),
			("Anand Mishra","Radhe mohan Mishra",3,4,"m","2005/09/012","2011/05/23"),
			("Pranjal Singh","Piyush Singh",2,5,"m","1992/05/11","2014/11/03"),
			("Shoumik dabe "," Deepak dabe",2,1,"m","1998/02/18","2013/09/07"),
			("Aakriti Bansal ","  Alok Bansal ",3,1,"f","2207/04/06","2009/08/23"),
			("Divyani Arora ","P S Arora",1,5,"f","1982/03/9","1998/11/22"),
			("Preeti Paal"," Ajay Paal",2,5,"f","1983/3/23","1999/11/02"),
			("Jitendra Gupta ","Bhajan lal Gupta",3,2,"m","2010/01/05","2020/12/08"),
			("Iyyaar"," Hira lal",3,5,"m","1997/02/17","2019/04/27"),
			("Ram Lakhn singh","Sumit singh ",1,3,"m","2000/03/12","2016/01/12"),
			("Ankit Goyal"," Shailendra Goyal",3,1,"m","2012/12/10","2019/02/25"),
			("Rahul Baghela"," Shreekumar Bahghela",1,4,"m","1982/05/18","2001/08/23"),
			("NAzia sekh","KAbir sekh",5,1,"f","1999/02/12","2012/04/15"),
			("Harprit Barar","Sukhvindar Barar",2,3,"m","1991/02/28","2013/03/09"),
			("Roshan Patel"," Heeralal PAtel ",3,1,"m","2205/06/07","2013/07/30"),
			("John marshal"," Alex MArshal ",3,4,"m","1997/05/28","2016/01/15"),
			("Shubhangi Sharma","Vishnu Sharma",5,3,"f","2013/03/17","2019/12/13");
			

drop table if exists salary;
create table salary(
                     salary_id      int(6)       auto_increment ,
 		     employ_id      int(6)       not null references employ(employ_id),
     	             desig_id       int(6)       not null references designation(desig_id),
     		     bank_name      varchar(100) not null,
   	  	     bank_ifsc      varchar(30)  not null,
     	             bank_ac_no     varchar(100) not null,
		     salary         double       not null,
		     primary key(salary_id));

insert into salary(employ_id, desig_id, bank_name,bank_ifsc ,bank_ac_no,salary)
		Values(1,2,"BOB", "BOB00009890","32874459781436",123500),
			(4,2,"ICICI","ICICI23003442","827346872134732",327443.34),
			(2,3,"SBI","SBIN000302232","422747283430",238400.50),
			(1,4,"HSBC","HSBC0023030020","234UT2343247673",123872.234),
			(2,5,"Axis","Axis000245","345988763428845",456790.00),
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
			(1,1,"SGB","SGB000348762","00125863252342344",789435.20);

drop table if exists photo;
create  table photo(
			  photo_id int(6) auto_increment not null ,
			  employ_id int(6) references employ(employ_id), 
			  photo  varchar(100),
		    	  primary key(photo_id));			 	

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