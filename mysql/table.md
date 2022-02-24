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

