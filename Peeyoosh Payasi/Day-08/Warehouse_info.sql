CREATE DATABASE IF NOT EXISTS Warehouse_info;

Show databases;

USE Warehouse_info;

DROP TABLE IF EXISTS Warehouse_info;
CREATE TABLE WAREHOUSE(
		  warehouse_id         int(8)         auto_increment,
    		  warehouse_name       varchar(100)   ,
		  warehouse_location   varchar(100),
    		  warehouse_area       varchar(100)	,     
    		  warehouse_fencing    int(8),
		primary key(warehouse_id));

INSERT INTO WAREHOUSE(warehouse_name,warehouse_location,warehouse_area,warehouse_fencing)
		  VALUES ("Open-minded","Indore","Vijay Nagar",7),
			   ("Cozy-fox","Bhopal","Sidharthnagar",3),
			   ("Lyzoo","Jabalpur","Gandhinagar",2),
			   ("Pinkchew","Pune","Baner",5),
			   ("Findmine","Vadodara","Shantinagar",2),
			   ("Brainchord","Gandhinagar","Subhashcolony",9),
			   ("Icyflame","Kanpur","Ramghat",1),
			   ("Rightplace","Jaipur","Ranimahal",4),
			   ("Tulip bed","Nagpur","Orange city",7),
			   ("Just be Self", "Laddakh","Khan Market",3);

DROP TABLE IF EXISTS PROCESS; 
CREATE TABLE PROCESS(          process_id            int(6)           AUTO_INCREMENT,
			       process_name          varchar(100),
   			       process_type          varchar(100),
   			       process_time_hour     int(6)    ,
			       primary key(process_id));

INSERT INTO PROCESS(process_name ,process_type ,process_time_Hour)
		VALUES ("Process Genratig","Process of data",  86 ),
			 ("Process correction", "information Correction",   12),
			 ("Planning" , "Plan For Work",   16),
			 ("Designing", "create Design",   108),
			 ("Coding", "Code Genrating",   200),
			 ("Testing", "Test The Product",   300),
			 ("Installation", "install in Shpowers Shop",  76 ),
			 ("Maintanance", "maintain the product ",  76);


DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT(        prod_id        int (6)        AUTO_INCREMENT,
     			     prod_name      varchar(100),
			     expiry_dt	    date,
			     warehouse_id   int(6) not null REFERENCES warehouse(warehouse_id),
   			     process_id     int(6) not null REFERENCES process(process_id),
			     prod_mfg_dt    date,
			     prod_exp_dt    date ,
			primary key(prod_id)); 

INSERT INTO PRODUCT(prod_name,expiry_dt,warehouse_id,process_id,prod_mfg_dt,prod_exp_dt)
		      VALUES    (  "Structural System", "2026/06/02" ,4,2,"2018/06/02"  ,"2023/05/12"),
			        (  "Inquiry Label", "2027/05/25" ,4              ,3             ,"2014/05/25" ,"2022/10/04" ),
				(  "IASys", "2025/09/03" ,6              ,1             ,"2015/09/03" ,"2024/05/02" ),
				(  "SPR-670", "2025/09/03" ,6              ,3             ,"2020/09/03","2022/10/04" ),
				(  "Salary Payroll", "2025/09/03 ",1              ,6             ,"2020/09/03"   ,"2022/10/04" ),
				(  "Wender collebr", "2027/05/25" ,7              ,3             ,"2020/09/03"   ,"2022/10/04" ),
				(  "Product balance System", "2027/05/25" ,8              ,6             ,"2020/09/03","2022/10/04" ),
				(  "Electric Motor","2027/05/25" ,9              ,8   ,"2020/09/03","2022/10/04" ),
				(  "Product enquiry", "2025/09/03 ",4              ,2             ,"2020/09/03","2022/10/04" ),
				(  "Cleanners Payment System", "2027/05/25" ,3              ,1             ,"2020/09/03","2022/10/04" ),
				(  "Party System", "2025/09/03" ,2              ,6             ,"2020/09/03","2022/10/04" ),
				(  "Section System","2027/05/25",4              ,9             ,"2020/09/03","2022/10/04"),
				(  "Public Relationship System","2025/09/03",6              ,2             ,"2020/09/03","2022/10/04" ),
				(  "Public Billing System","2027/05/25" ,1              ,3             ,"2020/09/03","2022/10/04"),
				(  "Local party System", "2031/09/03",4              ,1             ,"2020/09/03","2022/10/04" ),
				(  "Destroyer System", "2023/10/09",2              ,0             ,"2020/09/03","2022/10/04" ),
				(  "employee System", "2025/09/06",3              ,4             ,"2020/09/03","2022/10/04" ),
				(  "Creative Marketing", "2022/09/29",5 ,5,"2020/09/03","2022/10/04");


CREATE VIEW  product_warehouse_process AS
SELECT  p.prod_id,p.prod_name,w.warehouse_name,pr.process_name 
FROM  product AS p
LEFT JOIN warehouse AS w ON p.warehouse_id=w.warehouse_id
LEFT JOIN process AS pr ON p.process_id=pr.process_id;




SELECT * FROM warehouse;

SELECT * FROM process;

SELECT * FROM product;				

SELECT * FROM product_warehouse_process;             // view created successfully
