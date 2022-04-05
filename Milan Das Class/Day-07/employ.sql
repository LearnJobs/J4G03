CREATE DATABASE IF NOT EXISTS j4g03;
USE j4g03;

DROP TABLE IF EXISTS designation;
CREATE TABLE designation(
	desig_id		INT(6)			AUTO_INCREMENT,
	desig_desc		VARCHAR(100)	NOT NULL,
	desig_abbr		VARCHAR(20),
	del             ENUM("*")		DEFAULT NULL,
	PRIMARY KEY(desig_id)
);
INSERT INTO designation(desig_desc,desig_abbr) VALUES
	("Chief Executive Officer","CEO"),
	("Chief Operating Officer","COO"),
	("Director General","DG"),
	("General Manager","GM"),
	("Manager Production","MGR"),
	("Junior Manager","JM");

DROP TABLE IF EXISTS employ;
CREATE TABLE employ(
	employ_id		INT(6)			AUTO_INCREMENT,
	employ_name     VARCHAR(100)	NOT NULL,
	desig_id		INT(6)			NOT NULL REFERENCES designation(desig_id),
	PRIMARY KEY(employ_id)
);
INSERT INTO employ(employ_name,desig_id) VALUES("Pramod Reddy", 4);
