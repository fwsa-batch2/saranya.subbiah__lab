``` syntax
show databases;
```

| Database           |
|:-----|
| academy            |
| book               |
| class              |
| information_schema |
| library            |
| mysql              |
| performance_schema |
| students           |
| sys                |


###### 9 rows in set (0.01 sec)

``` syntax
use academy;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed

``` syntax
create table user (id int not null primary key auto_increment,name varchar(20));
```
###### Query OK, 0 rows affected (0.04 sec)

``` syntax
insert into user values (1,'dhaya'),(2,'surya');
```
###### Query OK, 2 rows affected (0.01 sec)
###### Records: 2  Duplicates: 0  Warnings: 0

``` syntax
select * from user;
```

| id | name  |
|:---|:---|
|  1 | dhaya |
|  2 | surya |

###### 2 rows in set (0.00 sec)

``` syntax
create table batch (id int not null primary key auto_increment, name varchar(20));
```
###### Query OK, 0 rows affected (0.05 sec)

``` syntax
insert into batch values (1,'Batch 1'),(2,'Batch 2');
```

###### Query OK, 2 rows affected (0.01 sec)
###### Records: 2  Duplicates: 0  Warnings: 0

``` syntax 
select * from batch;
```

| id | name    |
|:---|:---|
|  1 | Batch 1 |
|  2 | Batch 2 |

###### 2 rows in set (0.01 sec)

``` syntax
create table courses (id int not null primary key auto_increment, name varchar(20));
```
###### Query OK, 0 rows affected (0.04 sec)

``` syntax
insert into courses values (1,'HTML'),(2,'CSS'),(3,'JS');
```

###### Query OK, 3 rows affected (0.01 sec)
###### Records: 3  Duplicates: 0  Warnings: 0

``` syntax
select * from courses;
```

| id | name |
|:---|:----|
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |

###### 3 rows in set (0.00 sec)

``` syntax
create table batch_users (id int  primary key, name varchar(20), foreign key (id) references user(id));
```
###### Query OK, 0 rows affected (0.05 sec)

``` syntax
desc batch_users;
```

| Field | Type        | Null | Key | Default | Extra |
|:---|:---|:---|:----|:----|:----|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(20) | YES  |     | NULL    |       |

###### 2 rows in set (0.00 sec)

``` syntax
create table batch_courses (id int primary key, name varchar(20), foreign key (id) references courses(id));
``` 
###### Query OK, 0 rows affected (0.04 sec)

``` syntax
desc batch_courses;
```

| Field | Type        | Null | Key | Default | Extra |
|:---|:---|:---|:----|:---|:----|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(20) | YES  |     | NULL    |       |

###### 2 rows in set (0.00 sec)

``` syntax
drop table batch_users;
``` 
###### Query OK, 0 rows affected (0.04 sec)

``` syntax
create table batch_users (id int primary key  auto_increment, batch_id int, foreign key (batch_id) references batch (id),course_id int, foreign key (course_id) references courses (id));
```
###### Query OK, 0 rows affected (0.07 sec)

mysql> desc batch_users;

| Field     | Type | Null | Key | Default | Extra          |
|:---|:---|:---|:----|:---|:----|
| id        | int  | NO   | PRI | NULL    | auto_increment |
| batch_id  | int  | YES  | MUL | NULL    |                |
| course_id | int  | YES  | MUL | NULL    |                |

###### 3 rows in set (0.01 sec)

``` syntax
insert into batch_users values(1,1,1);
```
###### Query OK, 1 row affected (0.00 sec)

select * from user;

| id | name  |
|:---|:---|
|  1 | dhaya |
|  2 | surya |

###### 2 rows in set (0.01 sec)

``` syntax
select courses.id,courses.name,user.id,user.name,batch.id,batch.name from user join batch on user.id = batch.id join courses on courses.id=user.id;
```

| id | name | id | name  | id | name    |
|:---|:---|:---|:----|:---|:----|
|  1 | HTML |  1 | dhaya |  1 | Batch 1 |
|  2 | CSS  |  2 | surya |  2 | Batch 2 |

###### 2 rows in set (0.00 sec)

``` syntax
select courses.id as course_id,courses.name as course_name,user.id as user_id,user.name as user_name,batch.id as batch_id,batch.name as batch_name from user join batch on user.id = batch.id join courses on courses.id=user.id where courses.name = 'HTML';
```

| course_id | course_name | user_id | user_name | batch_id | batch_name |
|:---|:---|:---|:----|:---|:----|
|         1 | HTML        |       1 | dhaya     |        1 | Batch 1    |

###### 1 row in set (0.00 sec)



