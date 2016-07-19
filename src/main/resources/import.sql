CREATE TABLE people (
	id int auto_increment,
	name varchar(255),
	country varchar(255),
	PRIMARY KEY(id)
);
INSERT INTO people(`name`,`country`)
VALUES ('Bob','USA'),('Taro','Japan'),('Zidane','France');
