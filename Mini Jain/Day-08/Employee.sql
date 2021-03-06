show databases;

create database if not exists employee;
 
use employee;

drop table if exists designation;
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

drop table if exists department;
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
			

drop table if exists salary;
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