# MySQL-comments
### MySQL Create Database Statement
```syntax
create database freshworks;
```
###### Query OK, 1 row affected (0.02 sec)

### MySQL Show Databases Statement
```syntax
show databases;
```

| Database           |
|:-----|
| book               |
| class              |
| freshworks         |
| information_schema |
| library            |
| mysql              |
| performance_schema |
| sys                |

###### 8 rows in set (0.02 sec)
***

### MySQL Use Database Statement
```syntax
use freshworks;
```
###### Database changed

### MySQL Create Table Statement
```syntax
create table employees (id int primary key auto_increment,name varchar(20) not null,age int(2) not null,gender varchar(10) not null,salary int(5) not null);
```
###### Query OK, 0 rows affected, 2 warnings (0.06 sec)
***

### MySQL Describe Table Statement
```syntax
desc employees;
```

| Field  | Type        | Null | Key | Default | Extra          |
|:-----|:-----|:-----|:----|:----|:----|
| id     | int         | NO   | PRI | NULL    | auto_increment |
| name   | varchar(20) | NO   |     | NULL    |                |
| age    | int         | NO   |     | NULL    |                |
| gender | varchar(10) | NO   |     | NULL    |                |
| salary | int         | NO   |     | NULL    |                |

###### 5 rows in set (0.01 sec)
***

### MySQL Insert into Statement
```syntax
insert into employees values (1,'saranya','18','female','5000'),(2,'jerusheya','18','female','5000'),(3,'abisha','18','female','5000'),(4,'swetha','18','female','5000'),(5,'haiden','19','male','10000'),(6,'aswath','18','male','10000'),(7,'rishi','19','male','10000'),(8,'annamalai','18','male','10000'),(9,'santhanu','20','male','10000'),(10,'riyas','18','male','10000'),(11,'selva','20','male','10000');
```
###### Query OK, 10 rows affected (0.01 sec)
###### Records: 10  Duplicates: 0  Warnings: 0
***

### MySQL Select Statement
```syntax
select*from employees;
```

| id | name      | age | gender | salary |
|:-----|:----|:----|:----|:----|
|  1 | saranya   |  18 | female |   5000 |
|  2 | jerusheya |  18 | female |   5000 |
|  3 | abisha    |  18 | female |   5000 |
|  4 | swetha    |  18 | female |   5000 |
|  5 | haiden    |  19 | male   |  10000 |
|  6 | aswath    |  18 | male   |  10000 |
|  7 | rishi     |  19 | male   |  10000 |
|  8 | annamalai |  18 | male   |  10000 |
|  9 | santhanu  |  20 | male   |  10000 |
| 10 | riyas     |  18 | male   |  10000 |
| 11 | selva     |  20 | male   |  10000 |

###### 11 rows in set (0.00 sec)
***

### MySQL Where Statement
```syntax
select * from employees where id='1';
```

| id | name    | age | gender | salary |
|:-----|:----|:----|:----|:----|
|  1 | saranya |  18 | female |   5000 |

###### 1 row in set (0.00 sec)

### MySQL Alter Table Statement
```syntax
alter table employees add Email varchar(50);
```
###### Query OK, 0 rows affected (0.03 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```syntax
select * from employees;
```

| id | name      | age | gender | salary | Email |
|:-----|:----|:----|:----|:----|:----|
|  1 | saranya   |  18 | female |   5000 | NULL  |
|  2 | jerusheya |  18 | female |   5000 | NULL  |
|  3 | abisha    |  18 | female |   5000 | NULL  |
|  4 | swetha    |  18 | female |   5000 | NULL  |
|  5 | haiden    |  19 | male   |  10000 | NULL  |
|  6 | aswath    |  18 | male   |  10000 | NULL  |
|  7 | rishi     |  19 | male   |  10000 | NULL  |
|  8 | annamalai |  18 | male   |  10000 | NULL  |
|  9 | santhanu  |  20 | male   |  10000 | NULL  |
| 10 | riyas     |  18 | male   |  10000 | NULL  |
| 11 | selva     |  20 | male   |  10000 | NULL  |

###### 11 rows in set (0.00 sec)
***

### MySQL Modify Statement
```syntax
alter table employees modify Email varchar(30);
```
###### Query OK, 11 rows affected (0.08 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
select *from employees;
```

| id | name      | age | gender | salary | Email |
|:-----|:----|:----|:----|:----|:----|
|  1 | saranya   |  18 | female |   5000 | NULL  |
|  2 | jerusheya |  18 | female |   5000 | NULL  |
|  3 | abisha    |  18 | female |   5000 | NULL  |
|  4 | swetha    |  18 | female |   5000 | NULL  |
|  5 | haiden    |  19 | male   |  10000 | NULL  |
|  6 | aswath    |  18 | male   |  10000 | NULL  |
|  7 | rishi     |  19 | male   |  10000 | NULL  |
|  8 | annamalai |  18 | male   |  10000 | NULL  |
|  9 | santhanu  |  20 | male   |  10000 | NULL  |
| 10 | riyas     |  18 | male   |  10000 | NULL  |
| 11 | selva     |  20 | male   |  10000 | NULL  |

###### 11 rows in set (0.00 sec)
***

### MySQL Update Statement
```syntax
update employees set Email = "Saranya@gmail.com" where id=1;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
***

```syntax
select * from employees;
```

| id | name      | age | gender | salary | Email             |
|:-----|:----|:----|:-----|:----|:-----|
|  1 | saranya   |  18 | female |   5000 | Saranya@gmail.com |
|  2 | jerusheya |  18 | female |   5000 | NULL              |
|  3 | abisha    |  18 | female |   5000 | NULL              |
|  4 | swetha    |  18 | female |   5000 | NULL              |
|  5 | haiden    |  19 | male   |  10000 | NULL              |
|  6 | aswath    |  18 | male   |  10000 | NULL              |
|  7 | rishi     |  19 | male   |  10000 | NULL              |
|  8 | annamalai |  18 | male   |  10000 | NULL              |
|  9 | santhanu  |  20 | male   |  10000 | NULL              |
| 10 | riyas     |  18 | male   |  10000 | NULL              |
| 11 | selva     |  20 | male   |  10000 | NULL              |

###### 11 rows in set (0.00 sec)
***

### MySQL Delete Statement
```syntax
delete from employees where id=1;
```
###### delete from employees where id=1;
###### Query OK, 1 row affected (0.01 sec)
***

```syntax
select * from employees;
```

| id | name      | age | gender | salary | Email |
|:-----|:----|:----|:----|:-----|:----|
|  2 | jerusheya |  18 | female |   5000 | NULL  |
|  3 | abisha    |  18 | female |   5000 | NULL  |
|  4 | swetha    |  18 | female |   5000 | NULL  |
|  5 | haiden    |  19 | male   |  10000 | NULL  |
|  6 | aswath    |  18 | male   |  10000 | NULL  |
|  7 | rishi     |  19 | male   |  10000 | NULL  |
|  8 | annamalai |  18 | male   |  10000 | NULL  |
|  9 | santhanu  |  20 | male   |  10000 | NULL  |
| 10 | riyas     |  18 | male   |  10000 | NULL  |
| 11 | selva     |  20 | male   |  10000 | NULL  |

###### 10 rows in set (0.00 sec)
***

### MySQL Drop Table Statement
```syntax
drop table employees;
```
###### Query OK, 0 rows affected (0.02 sec)
***

### MySQL Drop Database Statement
```syntax
drop database freshworks;
```
###### Query OK, 0 rows affected (0.03 sec)
***

```syntax
show databases;
```

| Database           |
|:-----|
| book               |
| class              |
| information_schema |
| library            |
| mysql              |
| performance_schema |
| sys                |

###### 7 rows in set (0.00 sec)
***

##### CONSTRAINTS
### Not null
```syntax
create table books (name varchar(30) not null);
```

### Unique
```syntax
create table books (Email varchar (30) unique;
```

### Default
```syntax
create table books (class varchar(20) default '12th');
```

### Check
```syntax
create table books (age int (2) check (age>=18));
```

### Primary Key
```syntax
create table books (id int(3) primary key auto_increnment);
```

### Create Table with Constraints without Foreign Key
```syntax
create table students (id int(3) primary key auto_increment, name varchar(30) not null,Email varchar (30) unique,class varchar(20) default '12th',age int (2) check (age>=18));
```
###### Query OK, 0 rows affected, 2 warnings (0.06 sec)
***

### Insert into
```syntax
insert into students (name,Email,age) values ('saranya','Saranya@gmail.com','18');
```
###### Query OK, 1 row affected (0.01 sec)
***

```syntax
desc students;
```

| Field | Type        | Null | Key | Default | Extra          |
|:-----|:----|:----|:-----|:----|:----|
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   |     | NULL    |                |
| Email | varchar(30) | YES  | UNI | NULL    |                |
| class | varchar(20) | YES  |     | 12th    |                |
| age   | int         | YES  |     | NULL    |                |

###### 5 rows in set (0.00 sec)
***


### Select
```syntax
select * from students;
```

| id | name    | Email             | class | age  |
|:-----|:----|:----|:----|:----|
|  1 | saranya | Saranya@gmail.com | 12th  |   18 |

###### 1 row in set (0.00 sec)
***

### Foreign Key
```syntax
create table foreignkey(id int primary key auto_increment, mark int(2), foreign key(id) references students(id));
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)
***

### Insert into
```syntax
insert into foreignkey (mark,id) values ('98','1');
```
###### Query OK, 1 row affected (0.01 sec)
***

```syntax
desc foreignkey;
```

| Field | Type | Null | Key | Default | Extra          |
|:-----|:----|:----|:----|:----|:----|
| id    | int  | NO   | PRI | NULL    | auto_increment |
| mark  | int  | YES  |     | NULL    |                |

###### 2 rows in set (0.01 sec)
***

### Select
```syntax
select * from foreignkey;
```

| id | mark |
|:-----|
|  1 |   98 |

###### 1 row in set (0.00 sec)
***

##### OPERATORS
### Select
```syntax
select * from students;
```

| id | name    | Email             | class | age  |
|:-----|:----|:----|:----|:----|
|  1 | saranya | Saranya@gmail.com | 12th  |   18 |

###### 1 row in set (0.00 sec)
***

### And
```syntax
select* from students where name='saranya' and age='18';
```

| id | name    | Email             | class | age  |
|:-----|:----|:-----|:----|:----|
|  1 | saranya | Saranya@gmail.com | 12th  |   18 |

###### 1 row in set (0.00 sec)
***

### Not 
```syntax
select * from students where not age = 18;
```

| id | name      | Email          | class | age  |
|:-----|:----|:----|:----|:----|
|  2 | jerusheya | jeru@gmail.com | 12th  |   19 |
|  3 | abisha    | abi@gmail.com  | 12th  |   19 |

###### 2 rows in set (0.00 sec)
***

### Between
```syntax
select * from students where age between 18 AND 20;
```

| id | name      | Email             | class | age  |
|:-----|:----|:----|:----|:----|
|  1 | saranya   | Saranya@gmail.com | 12th  |   18 |
|  2 | jerusheya | jeru@gmail.com    | 12th  |   19 |
|  3 | abisha    | abi@gmail.com     | 12th  |   19 |

###### 3 rows in set (0.00 sec)
***

### In
```syntax
select * from students where age in (18);
```

| id | name    | Email             | class | age  |
|:-----|:----|:----|:----|:----|
|  1 | saranya | Saranya@gmail.com | 12th  |   18 |

###### 1 row in set (0.00 sec)
***

### Like
```syntax
select * from students where name like 'ab%';
```

| id | name   | Email         | class | age  |
|:-----|:----|:----|:-----|:----|
|  3 | abisha | abi@gmail.com | 12th  |   19 |

###### 1 row in set (0.00 sec)
***

```syntax
select * from students where name like '%ya';
```

| id | name      | Email             | class | age  |
|:-----|:----|:----|:----|:-----|
|  1 | saranya   | Saranya@gmail.com | 12th  |   18 |
|  2 | jerusheya | jeru@gmail.com    | 12th  |   19 |

###### 2 rows in set (0.00 sec)
***

### Any
```syntax
create table marks(id int,mark int,name varchar(20));
```
###### Query OK, 0 rows affected (0.05 sec)
***

```syntax
insert into marks (id,mark,name) values (1,98,'saran'),(2,98,'jeru'),(3,98,'abi');
```
###### Query OK, 3 rows affected (0.01 sec)
###### Records: 3  Duplicates: 0  Warnings: 0

```syntax
select * from marks;
```

| id   | mark | name  |
|:-----|:----|:----|
|    1 |   98 | saran |
|    2 |   98 | jeru  |
|    3 |   98 | abi   |

###### 3 rows in set (0.00 sec)
***

```syntax
create table score(id int,mark int,name varchar(20));
```
###### Query OK, 0 rows affected (0.04 sec)
***

```syntax
insert into score (id,mark,name) values (1,98,'saranya'),(2,98,'jerusheya'),(3,98,'abisha');
```
###### Query OK, 3 rows affected (0.01 sec)
###### Records: 3  Duplicates: 0  Warnings: 0
***

```syntax
select * from score;
```

| id   | mark | name      |
|:-----|:----|:----|
|    1 |   98 | saranya   |
|    2 |   98 | jerusheya |
|    3 |   98 | abisha    |

###### 3 rows in set (0.00 sec)
***

```syntax
select mark from  marks where mark = any (select mark from score);
```

| mark |
|:-----|
|   98 |
|   98 |
|   98 |

###### 3 rows in set (0.00 sec)
***

##### AGGREGATE FUNCTIONS
```syntax
select * from students;
```

| id | name      | Email             | class | age  |
|:-----|:----|:----|:----|:----|
|  1 | saranya   | Saranya@gmail.com | 12th  |   18 |
|  2 | jerusheya | jeru@gmail.com    | 12th  |   19 |
|  3 | abisha    | abi@gmail.com     | 12th  |   19 |

###### 3 rows in set (0.00 sec)
***

### Min
```syntax
select min(age) from students;
```

| min(age) |
|:-----|
|       18 |

###### 1 row in set (0.00 sec)
***

### Max
```syntax
select max(age) from students;
```

| max(age) |
|:-----|
|       19 |

###### 1 row in set (0.00 sec)
***

### Avg
```syntax
select avg(age) from students;
```

| avg(age) |
|:-----|
|  18.6667 |

###### 1 row in set (0.00 sec)
***

### Count
```syntax
select count(age) from students;
```

| count(age) |
|:-----|
|          3 |

###### 1 row in set (0.00 sec)
***

### Sum
```syntax
select sum(age) from students;
```

| sum(age) |
|:-----|
|       56 |
###### 1 row in set (0.00 sec)

