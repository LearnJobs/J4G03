create database if not exists WAREHOUSE1;
use WAREHOUSE1;

select "WAREHOUSE";
drop table if exists WAREHOUSE;
create table WAREHOUSE( 
	warehouse_id int(6) auto_increment, 
	warehouse_name varchar(100) not null, 
	warehouse_location varchar(100) not null,
	warehouse_fencing varchar(100) not null,
	primary key(warehouse_id));

insert into WAREHOUSE(warehouse_name, warehouse_location, warehouse_fencing) values
	("Delhi Warehouse", "54 South Usman Road T Nagar,Delhi,600017,India", "Barb Wire"),
	("Mumbai Warehouse", "A/24 Andheri Kurla Road, Mumbai,400072,India", "No Fence"),
	("Gurugram Warehouse","250 Kurla Complex Bandra ,Gurugram, 400051,India", "Cement Wall"),
	("Pune Warehouse", "14 st Flr Monarch Chambers, Pune, 400059,India", "Barb Wire"),
	("Bilaspur Warehouse", "48 st Floor Sanjay Market, Bilaspur,201301,India", "Brick Wall"),
	("jaipur Warehouse", "17  Hari Krupa, Jaipur,400071,India", "Cement Boundary"),
	("Raipur Warehouse", "56 nrt Hanuman Road T Nagar,Delhi,600017,India", "Barb Wire"),
	("Indore Warehouse","13 Kurla Complex Bandra ,Indore, 405651,India", "Cement Wall"),
	("Rourkela Warehouse", "48 st Floor Gandhi Market, Rourkela,204651,India", "Brick Wall"),
	("Jodhpur Warehouse", "120  Mulji Devshi Bldg ,Jodhpur, 400002,India", "Barb Wire");

select "PROCESS";
drop table if exists PROCESS;
create table PROCESS(
	process_id int(6) auto_increment, 
	process_name varchar(100) not null,
	process_type varchar(100) not null,
	process_time char(05) not null,
	primary key(process_id));

insert into PROCESS(process_name, process_type, process_time) values
	("Production", "Supervision", "8"),
	("Production", "Labouring", "8"),
	("Operations", "Managing", "9"),
	("Operations", "Associate", "9"),
	("Security", "Guard", "12"),
	("Human Resource", "Managing","8"),
	("Human Resource", "Executive","8");
	
select "PRODUCT";
drop table if exists PRODUCT;
create table PRODUCT( 
	product_id int(6) auto_increment,
	product_name varchar(100) not null,
	expiry_date date not null,
	warehouse_id int(6) not null references WAREHOUSE(warehouse_id),
	process_id int(6) not null references PROCESS(process_id),
	primary key(product_id) );

insert into PRODUCT(product_name,  expiry_date, warehouse_id, process_id) values
	("Haldiram Alu Bhujia", "2024-06-02",1, 1 ), 
	("Haldiram Dal Biji", "2023-08-05", 2, 2), 
	("Haldiram All in One", "2024-06-12", 3, 3), 
	("Haldiram Bhelpuri", "2025-12-06", 4, 4), 
	("Haldiram Bhujia Sev", "2022-12-25", 5, 5), 
	("Haldiram Cham Cham", "2022-06-02", 6, 6), 
	("Haldiram Chana Chur", "2024-12-12", 7, 7), 
	("Haldiram Cornflakes", "2023-12-23", 8, 1), 
	("Haldiram Chatpata Dal", "2022-06-06", 9, 2), 
	("Haldiram Diet Chiwda", "2024-12-11", 10, 3), 
	("Haldiram Gol Kachori", "2022-06-25", 1, 4), 
	("Haldiram Halke Fulke", "2024-01-09", 2, 5), 
	("Haldiram Kesar Rasbhari", "2023-09-02", 3, 6), 
	("Haldiram Khara Boondi", "2023-03-02", 4, 7), 
	("Haldiram Lemon Bhel", "2024-12-30", 5, 1), 
	("Haldiram Masala Chana", "2022-06-09", 6, 2), 
	("Haldiram Moong Dal", "2024-06-20", 7, 3), 
	("Haldiram Masala Peanut", "2025-05-04", 8, 4), 
	("Haldiram Mathri", "2024-06-02", 9, 5), 
	("Haldiram Aalo Bhujiya", "2022-08-07", 10, 6);
	

















 