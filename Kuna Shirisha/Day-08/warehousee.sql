 CREATE DATABASE IF NOT EXISTS WAREHOUSEE;

 show databases;

 use WAREHOUSEE;

 CREATE TABLE WAREHOUSE(
		  warehouse_id         int(6)         auto_increment,
    		  warehouse_name       varchar(100)   ,
		  warehouse_location   varchar(100),
    		  warehouse_area       varchar(100)	,     
    		  warehouse_fencing    int(6),
		primary key(warehouse_id));

INSERT INTO WAREHOUSE(warehouse_name,warehouse_location,warehouse_area,warehouse_fencing)
		    VALUES("ZAPPOS","London","England",1),
			   ("DIAPERS","NewYork","siliconvally",2),
			   ("UPS WORLDPORT","Mumbai","Newyork",3),
			   ("IKEA","Pune","Mexico",4),
			   ("NIKE","Lucknow","Badshanagar",5),
			   (" WALMART","Delhi","Secter57",6),
			   (" COCA COLA","Hyderabad","Mysore Road",7),
			   ("NETFLIX","Kolkata","KaliGhat",8),
			   ("AMAZON","Colombia","Eden Garden",9),
			   ("NIKE", "New York","sri nagar colony",10);

DROP TABLE IF EXISTS PROCESS; 
CREATE TABLE PROCESS(    process_id            int(6)           AUTO_INCREMENT,
			       process_name          varchar(100),
   			       process_type          varchar(100),
   				 process_time_hour      int(6)    ,
				 primary key(process_id));

INSERT INTO PROCESS(process_name ,process_type ,process_time_Hour)
		VALUES ("Requirment Gathering","Plan For Work",  20 ),
			 ("Analyzing", "Collect information",   30),
			 ("Coding" , "coding for given data",   22),
			 ("Designing", "create Design",   35),
			 ("Requirment Gathering", "Collect data",50),
			 ("Testing", "Testing The Product",   39),
			 ("Installation", "installation in client pc",  40),
			 ("Maintanance", "maintaining the product ",60);


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
		      VALUES("Bingo", "2020/09/07" ,5,3,"2020/09/03"  ,"2022/10/04"),
			      (  "Lays", "2028/09/01" ,6              ,4             ,"2020/09/03" ,"2022/10/04" ),
				(  "Furniture", "2029/09/05" ,3              ,5             ,"2020/09/03" ,"2022/10/04" ),
				(  "Table Light ", "2022/09/06" ,6              ,3             ,"2020/09/03","2022/10/04" ),
				(  "Sofas", "2028/09/25 ",1              ,6             ,"2020/09/03"   ,"2022/10/04" ),
				(  "Coffee", "2022/08/10" ,7              ,3             ,"2020/09/03"   ,"2022/10/04" ),
				(  "Tables", "2026/09/03" ,8              ,6             ,"2020/09/03","2022/10/04" ),
				(  "Bookshelves","2029/09/03" ,9              ,8   ,"2020/09/03","2022/10/04" ),
				(  "Media storage", "2024/09/03 ",4              ,2             ,"2020/09/03","2022/10/04" ),
				(  "Doorknobs", "2022/12/03" ,3              ,1             ,"2020/09/03","2022/10/04" ),
				(  "Kitchen appliances", "2029/09/09" ,2              ,6             ,"2020/09/03","2022/10/04" ),
				(  "Carpets","2020/01/03 ",4              ,9             ,"2020/09/03","2022/10/04"),
				(  "Mats","2025/09/03",6              ,2             ,"2020/09/03","2022/10/04" ),
				(  "Billy bookcase","2023/09/10" ,1              ,3             ,"2020/09/03","2022/10/04"),
				(  "Butter Chicken", "2022/04/08",4              ,1             ,"2020/09/03","2022/10/04" ),
				(  "Frozen Yogurt", "2025/08/06",2              ,0             ,"2020/09/03","2022/10/04" ),
				(  "Moong Dal", "2025/08/02",3              ,4             ,"2020/09/03","2022/10/04" ),
				(  "Egg puff", "2025/03/12",5 ,5,"2020/09/03","2022/10/04");

CREATE VIEW  product_warehouse_process AS
SELECT  p.prod_id,p.prod_name,w.warehouse_name,pr.process_name 
FROM  product AS p
LEFT JOIN warehouse AS w ON p.warehouse_id=w.warehouse_id
LEFT JOIN process AS pr ON p.process_id=pr.process_id;

     