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

