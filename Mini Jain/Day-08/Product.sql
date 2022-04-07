CREATE DATABASE IF NOT EXISTS product;
USE product;

select "warehouse";

DROP TABLE IF EXISTS warehouse;
CREATE TABLE  warehouse(
    warehouse_id  int(6)  auto_increment,
    warehouse_name varchar(100) not null,
    warehouse_location varchar(100) not null,
    warehouse_area  varchar(100) not null,
    warehouse_fencing varchar(100) not null,
    primary key(warehouse_id)
);   
insert into warehouse(warehouse_id, warehouse_name, warehouse_location, warehouse_area, warehouse_fencing)
  values(1, "indorewarehouse", "india", 405651, "cement wall"),
        (2, "georgiawarehouse","america",153910, "iron wall"),
        (3, "southafricawarehouse", "africa",303712, "power wall"),
        (4, "amalapuramwarehouse", "andhra", 400000, "brik wall"),
        (5, "jaipurwarehouse", "jaipur", 40071, "cement boundary"),
        (6, "hyderabadwarehouse", "telangana", 436651, "mud wall"),
        (7, "rajasthanwarehouse", "gujarat", 444441, "fire wall"),
        (8, "dholakpurwarehouse", "odisa", 457771, "iron bricks"),
        (9, "biharwarehouse", "goa", 666651, "cement bricks"),
        (10, "londonwarehouse", "britan", 455551, "zinc wall"); 
           
select "process";
DROP TABLE IF EXISTS process;
CREATE TABLE  process(
    process_id  int(6)  auto_increment,
    process_name varchar(100) not null,
    process_type varchar(100) not null,
    process_time  time not null,
    primary key(process_id)
); 
insert into process(process_id, process_name, process_type, process_time)
            values(1, "production", "junior manager", 1),
                  (2, "production", "senior manager", 2),
                  (3, "operations",  "managing", 3),
                  (4,  "security", "gaurd", 4),
                  (5,  "cheifexecutiveofficer", "ceo", 5),
                  (6, "chief operating officer", "coo", 6),
		  (7, "director general","dg", 7),
		  (8,  "general manager", "gm", 8),
		  (9,  "manager production", "mgr", 9),
		  (10, "junior manager", "jm", 10);
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
	


 select p.product_id,p.product_name,p.expiry_date,w.warehouse_name,pr.process_name from product as p
    -> left join warehouse as w on p.warehouse_id=w.warehouse_id
    -> left join process as pr on p.process_id=pr.process_id;