ASSIGNMENT (06-04-2022)
    a)  warehouse_id
    b)  warehouse_name
    c)  warehouse_location
    d)  warehouse_area
    e)  warehouse_fencing

    10 ROWS

2.  Process
    a)  process_id
    b)  process_name
    c)  process_type
    d)  process_time

    10 ROWS

3.  Product
    a)  prod_id
    b)  prod_name
    c)  expiry_dt
    d)  warehouse_id
    e)  process_id
    f)  prod_mfg_dt
    g)  prod_exp_dt

    20 ROWS

Create a view from the SQL statement that will display all products with their warehouse name and process name.
Write a Java to display the query?


CREATE DATABASE IF NOT EXISTS WAREHOUSE;

Show databases;

USE WAREHOUSE;

DROP TABLE IF EXISTS WAREHOUE;
CREATE TABLE WAREHOUSE(
		  warehouse_id         int(6)         auto_increment,
    		  warehouse_name       varchar(100)   ,
		  warehouse_location   varchar(100),
    		  warehouse_area       varchar(100)	,     
    		  warehouse_fencing    int(6),
		primary key(warehouse_id));

INSERT INTO WAREHOUSE(warehouse_name,warehouse_location,warehouse_area,warehouse_fencing)
		  VALUES ("Sun","London","QueensPalace",5),
			   ("Moon","NewYork","siliconvally",6),
			   ("Vinus","Mumbai","maharashtra",4),
			   ("Mars","Pune","Viman Nager",3),
			   ("Earth","Lucknow","Badshanagar",2),
			   ("Jupiter","Delhi","Secter57",8),
			   ("Saturn","Banglore","Mysore Road",9),
			   ("Marcury","Kolkata","KaliGhat",7),
			   ("Sirious","Colombia","Eden Garden",1),
			   ("Maurya", "New York","Wall Street",0);

DROP TABLE IF EXISTS PROCESS; 
CREATE TABLE PROCESS(    process_id            int(6)           AUTO_INCREMENT,
			       process_name          varchar(100),
   			       process_type          varchar(100),
   				 process_time_hour      int(6)    ,
				 primary key(process_id));

INSERT INTO PROCESS(process_name ,process_type ,process_time_Hour)
		VALUES ("Requirment Gathering","Collect data",  72 ),
			 ("Analyzing", "Collect information",   48),
			 ("Planning" , "Plan For Work",   16),
			 ("Designing", "create Design",   50),
			 ("Coding", "Code for product",   1000),
			 ("Testing", "Test The Product",   300),
			 ("Installation", "install in client pc",  52 ),
			 ("Maintanance", "maintain the product ",  43);


DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT(  prod_id        int (6)        AUTO_INCREMENT,
     			     prod_name      varchar(100),
			     expiry_dt	  date,
			     warehouse_id   int(6) not null REFERENCES warehouse(warehouse_id),
   			     process_id     int(6) not null REFERENCES process(process_id),
			     prod_mfg_dt    date,
			     prod_exp_dt    date ,
			primary key(prod_id)); 

INSERT INTO PRODUCT(prod_name,expiry_dt,warehouse_id,process_id,prod_mfg_dt,prod_exp_dt)
		VALUES 	(  "ERP System", "2025/09/03" ,5,3,"2020/09/03"  ,"2022/10/04"),
			      (  "Attendence_System", "2025/09/03" ,6              ,4             ,"2020/09/03" ,"2022/10/04" ),
				(  "Library  System", "2025/09/03" ,3              ,5             ,"2020/09/03" ,"2022/10/04" ),
				(  "TransportationSystem", "2025/09/03" ,6              ,3             ,"2020/09/03","2022/10/04" ),
				(  "Salary Payroll", "2025/09/03 ",1              ,6             ,"2020/09/03"   ,"2022/10/04" ),
				(  "Students System", "2025/09/03" ,7              ,3             ,"2020/09/03"   ,"2022/10/04" ),
				(  "Admin System", "2025/09/03" ,8              ,6             ,"2020/09/03","2022/10/04" ),
				(  "ElectricityBilling System","2025/09/03" ,9              ,8   ,"2020/09/03","2022/10/04" ),
				(  "Internet Billing System", "2025/09/03 ",4              ,2             ,"2020/09/03","2022/10/04" ),
				(  "Cleanners Payment System", "2025/09/03" ,3              ,1             ,"2020/09/03","2022/10/04" ),
				(  "Teacher System", "2025/09/03" ,2              ,6             ,"2020/09/03","2022/10/04" ),
				(  "Department System","2025/09/03 ",4              ,9             ,"2020/09/03","2022/10/04"),
				(  "Public Relationship System","2025/09/03",6              ,2             ,"2020/09/03","2022/10/04" ),
				(  "Canteen Billing System","2025/09/03" ,1              ,3             ,"2020/09/03","2022/10/04"),
				(  "Scholarship System", "2025/09/03",4              ,1             ,"2020/09/03","2022/10/04" ),
				(  "BoysHostal System", "2025/09/03",2              ,0             ,"2020/09/03","2022/10/04" ),
				(  "GirlsSystem", "2025/09/03",3              ,4             ,"2020/09/03","2022/10/04" ),
				(  "BuildingManufacturing", "2025/09/03",5 ,5,"2020/09/03","2022/10/04");


CREATE VIEW  product_warehouse_process AS
SELECT  p.prod_id,p.prod_name,w.warehouse_name,pr.process_name 
FROM  product AS p
LEFT JOIN warehouse AS w ON p.warehouse_id=w.warehouse_id
LEFT JOIN process AS pr ON p.process_id=pr.process_id;




SELECT * FROM warehouse;

SELECT * FROM process;

SELECT * FROM product;				

SELECT * FROM product_warehouse_process;             // view created successfully





