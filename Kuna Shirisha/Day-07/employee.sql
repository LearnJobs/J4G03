 create database if not exists J4g03;
 use J4g03;
select "designation";
drop table if exists designation;
  create table designation(
				 desig_id            int(6)         AUTO_INCREMENT not null,
                                 desig_desc          varchar(100), 
                                 desig_abbr          varchar(20), 
                                 del                  enum("*")     default null,
                                 primary key(desig_id)
                           );

 insert into designation(desig_desc, desig_abbr) 
	  values("Chief Executive Officer" , "CEO"),
		("Chief Operating Officer" , "COO"),
		("Director General"    ,      "DG"),
		("General Manager" ,          "GM"),
		("Manager Production"    ,    "MGR"),
		("Junior Manager"       ,     "JM");
 select "department";
 drop table if exists department;
 create table department(
				depart_id          int(6)            auto_increment not null,
                                depart_name        varchar(100) ,
				depart_abbr        varchar(100),
				primary key (depart_id) 
			);

 insert into department(depart_name, depart_abbr)	
 	 values("Accounting Department"             ,"AD"),
	       ("Technical Depertment",              "TD"),
	       ("Human Resource Department",        "HRD"),
	       ("Transportation Department",         "TD"),
	       ("Research & Development Department","R&DD");
    select "employ";
   drop table if exists employ;
     create table employ(
		         employ_id              int(6)                     auto_increment not null,
        	         employ_name            varchar(100)               not null,
                         father_name            varchar(100),
        	         desig_id               int(6)                    not null references designation(desig_id),
        	         depart_id              int(6)                    not null references department(depart_id),
	                 gender                 enum("M","F") default null,
        	         date_of_birth         date not null,
                         date_of_joining       date not null,
		         primary key(employ_id)
                      );

  insert into employ(employ_name, father_name,  desig_id, depart_id, gender, date_of_birth, date_of_joining)
		  values("Shirisha" ,       "Anji"      ,  1 , 1,   "F",    "2000/03/21",   "2017/03/01"),
                        ("Manasa"   ,       "Ramesh"    ,  2 , 2,   "F",    "1996/05/22",   "2015/05/11"),
                        ("Renuka"   ,       "Sampath"   ,  3 , 6,   "F",    "2000/02/13",   "2020/10/31"),
                        ("Ankitha"  ,       "Ravi"      ,  4 , 5,   "F",    "1995/05/24",   "2019/09/25"),
                        ("Shruthi"  ,       "Laxman"    ,  5 , 3,   "F",    "1991/04/02",   "2016/01/22"),
                        ("Shailu"   ,       "Janardan"  ,  6 , 1,   "F",    "1992/09/03",   "2020/09/24"),
                        ("Thulasi"  ,       "Ram gopal" ,  7 , 6,   "F",    "1993/08/30",   "2021/02/13"),
                        ("Anusha"   ,       "Ramu"       , 8 , 4,  "F",    "1997/03/25",   "2015/09/19"),
                        ("Swetha"   ,       "Chiranjeevi", 9 , 6,   "F",    "1998/03/20",   "2012/08/29"),
                        ("Janaki"   ,       "Kamal"      , 10 ,3,   "F",    "1997/02/27",   "2011/07/04"),
                        ("Prasanna" ,       "Charan"     , 11, 3,    "F",    "1993/06/28",   "2009/06/06"),
                        ("Kajal"    ,       "Venu"       , 12, 1,   "F",    "1998/07/20",   "2000/03/24"),
                        ("Prabhas"  ,       "Srinu"      ,  13, 5,   "M",    "1994/01/19",   "2007/07/15"),
                        ("Mahesh"   ,       "Krishna"    ,  14, 6,   "M",    "1992/03/18",   "2003/01/18"),
                        ("Vijay"    ,       "Gowtham"    ,  15, 2,   "M",    "1991/07/01",   "2020/08/31"),
                        ("Anirudh"  ,       "Raj varma"  ,  16, 5,   "M",    "1996/09/30",   "2022/04/25"),
                        ("prasad"   ,       "sri prasad" ,  17, 1,   "M",    "1997/08/24",   "2012/03/27"),
                        ("Shekar"   ,        "Kairm"     ,  18, 5,   "M",    "1999/03/15",   "2002/07/30"),
                        ("Vaishnavi ,        "Anil"      ,  19, 2,   "F",    "1998/06/13",   "2000/07/05"),
                        ("Kavitha"  ,        "Srikanth"  ,  20, 4,   "M",    "1990/05/12",   "2021/08/07");
	select "salary";		

  drop table if exists salary;
  create table salary(salary_id int(6) auto_increment ,
 			  employ_id          int(6)            not null references employ(employ_id),
     			  desig_id           int(6)            not null references designation(desig_id),
     			  bank_name          varchar(100)      not null,
   	  	 	  bank_ifsc          varchar(30)       not null,
     			  bank_ac_no         varchar(100)      not null,
			  salary             double            not null,
			  primary key(salary_id)
                     );

 insert into salary(employ_id, desig_id, bank_name,bank_ifsc ,bank_ac_no,salary)
		  Values(1,2,   "HDFC",   "HDFC0000518",     "5473268748732",    217321.23),
			(4,2,   "ICICI",  "ICICI25673211",   "6473468721347",    327443.34),
			(2,3,   "ANDB", "ANDB000246",      "85372834325",      2384687.23),
			(1,4,   "HDFC",   "HDFC0000518",     "226523432476",     123872.234),
			(2,5,   "SBI",    "SBIN0000023",     "7416487634288",    2387423.32),
			(1,4,   "HDFC",   "HDFC0000518",     "4321572346878",    287346.42),
			(2,3,   "SBI",    "SBIN0000023",     "9723476238748",    72837667.34),
			(2,5,   "KDCC",   "KDCC29836894",    "3526487328876",    4278943.767),
			(3,1,   "ANDB"  ,  "ANDB000246",      "8316487263874",    3274672.35),
			(4,1,   "UBI",    "UBNI0530557",     "3417687468223",    326487678.43),
			(1,4,   "HDFC",   "HDFC0000518",     "4327523432476",    123872.234),
			(2,5,   "SBI",    "SBIN0000023",     "81223487634288",    2387423.32),
			(1,4,   "SBI",    "SBIN0000023",     "43269723468782",   287346.42),
			(2,3,   "UBI",    "UBNI0530557",     "85446762387487",   72837667.34),
			(1,4,   "HDFC",   "HDFC0000518",     "32468723468782",   287346.42),
			(2,3,   "ANDB",    "ANDB000246",      "86358762387487",   72837667.34),
			(2,5,   "KDCC",   "KDCC29836894",    "91224873288768",   4278943.767),
			(3,1,   "ANDB",    "ANDB000246",      "943254872638742",  3274672.35),
			(4,1,   "UBI",    "UBNI0530557",     "8351874682232",    326487678.43),
			(1,4,   "HDFC",   "HDFC0000518",     "2454768324767",   123872.234);
		select "photo";	
   drop table if exists photo;
      create  table photo(
			    photo_id           int(6)            auto_increment not null ,
			    employ_id          int(6)            references employ(employ_id), 
			    photo              varchar(100),
		    	    primary key(photo_id)
                       );			 	

insert into photo(employ_id,photo)
		  values(1, "img6248761287.jpg"),
			(2, "img4324242332.jpg"),
			(3, "img2342342344.jpg"),
			(4, "img3242344234.jpg"),	 			 			 			 			 			 			 
			(5, "img5234234324.jpg"),
			(6, "img2342342343.jpg"),
			(7, "img2343432434.jpg"),
			(8, "img4564564564.jpg"),
			(9, "img34534554524.jpg"),
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
			(20,"img35634656464.jpg");
			
