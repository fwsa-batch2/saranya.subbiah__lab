show databases;
+--------------------+
| Database           |
+--------------------+
| academy            |
| book               |
| class              |
| information_schema |
| library            |
| mysql              |
| performance_schema |
| students           |
| sys                |
+--------------------+
9 rows in set (0.01 sec)

use academy;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
show tables;
+-------------------+
| Tables_in_academy |
+-------------------+
| batch             |
| batch_courses     |
| batch_users       |
| courses           |
| student_class     |
| students          |
| user              |
+-------------------+
7 rows in set (0.01 sec)


create table blazers (id int,name varchar(20),age int(2),class varchar(20), gender varchar(20));
Query OK, 0 rows affected, 1 warning (0.05 sec)

desc blazers;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| id     | int         | YES  |     | NULL    |       |
| name   | varchar(20) | YES  |     | NULL    |       |
| age    | int         | YES  |     | NULL    |       |
| class  | varchar(20) | YES  |     | NULL    |       |
| gender | varchar(20) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)


insert into blazers values ('1','Saran','18','12','female'),('2','Abisha','18','11','female'),('3','Jerusheya','18','12','female'),('4','Swetha','18','11','female');
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

select * from blazers;
+------+-----------+------+-------+--------+
| id   | name      | age  | class | gender |
+------+-----------+------+-------+--------+
|    1 | Saran     |   18 | 12    | female |
|    2 | Abisha    |   18 | 11    | female |
|    3 | Jerusheya |   18 | 12    | female |
|    4 | Swetha    |   18 | 11    | female |
+------+-----------+------+-------+--------+
4 rows in set (0.00 sec)

create view queens as select name, class from blazers where class > 12;
Query OK, 0 rows affected (0.01 sec)

select * from queens;
Empty set (0.00 sec)


create or replace view queens as select id,name from blazers where id=1;
Query OK, 0 rows affected (0.02 sec)

select * from queens;
+------+-------+
| id   | name  |
+------+-------+
|    1 | Saran |
+------+-------+
1 row in set (0.00 sec)

select * from queens;
+------+-------+
| id   | name  |
+------+-------+
|    1 | Saran |
+------+-------+
1 row in set (0.00 sec)

insert into queens values ('4','Aswath'),('5','Haiden');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

select * from queens;
+------+-----------+
| id   | name      |
+------+-----------+
|    2 | Abisha    |
|    3 | Jerusheya |
|    4 | Swetha    |
|    4 | Aswath    |
|    5 | Haiden    |
+------+-----------+
11 rows in set (0.00 sec)

show full tables where table_type != 'view';
+-------------------+------------+
| Tables_in_academy | Table_type |
+-------------------+------------+
| batch             | BASE TABLE |
| batch_courses     | BASE TABLE |
| batch_users       | BASE TABLE |
| blazers           | BASE TABLE |
| courses           | BASE TABLE |
| queens            | VIEW       |
| student_class     | BASE TABLE |
| students          | BASE TABLE |
| user              | BASE TABLE |
+-------------------+------------+
9 rows in set (0.00 sec)

create view stars as  select blazers.name,students.id from blazers,students where blazers.name=students.id;
Query OK, 0 rows affected (0.02 sec)

select * from stars;
Empty set, 7 warnings (0.01 sec)

drop view  stars;
Query OK, 0 rows affected (0.01 sec)

show tables;
+-------------------+
| Tables_in_academy |
+-------------------+
| batch             |
| batch_courses     |
| batch_users       |
| blazers           |
| courses           |
| idiots            |
| student_class     |
| students          |
| user              |
+-------------------+
9 rows in set (0.01 sec)


