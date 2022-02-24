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

