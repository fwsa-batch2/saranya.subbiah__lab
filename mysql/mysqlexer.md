mysql> create table students (id int primary key auto_increment,name varchar(100) not null,email varchar(100) not null,mobile_no bigint not null,password varchar(100) not null,gender char(1) not null,dob date,created_date timestamp not null default current_timestamp,unique (email),check ( gender in ('M','F'))); 
Query OK, 0 rows affected (0.05 sec)

mysql> create table student_class ( id int primary key auto_increment, student_id int not null, class int not null, status varchar(20) not null, foreign key (student_id) references students(id), check( class >= 1 and class <=12), check (status in ('ACTIVE','INACTIVE')) );
Query OK, 0 rows affected (0.05 sec)

mysql> insert into students (name,email,mobile_no,password,gender,dob,created_date) values ('saranya','saran@gmail.com','8798765878','saran20','F','2004-06-20','2022-03-02'),('abisha','abi@gmail.com','8793456778','abi03','F','2003-06-03','2022-03-02'),('jerusheya','jeru@gmail.com','8873567878','jeru26','F','2002-08-26','2022-03-02');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> insert into student_class(student_id,class,status) values(1,12,'ACTIVE'),(2,12,'INACTIVE'),(3,12,'ACTIVE');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select name from students;
+-----------+
| name      |
+-----------+
| saranya   |
| abisha    |
| jerusheya |
+-----------+
3 rows in set (0.00 sec)

mysql> select 'true' where exists(select * from students where email='saran@gmail.com' and password='saran20');
+------+
| true |
+------+
| true |
+------+
1 row in set (0.00 sec)

mysql> update students set password='abisha03' where id=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> insert into students(name,email,mobile_no,password,gender,dob,created_date) value('Swetha','swetha@gmail.com','7448354949','swethams','M','2004-11-17','2022-03-02');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_class(student_id,class,status) values(4,11,'ACTIVE');
Query OK, 1 row affected (0.01 sec)

mysql> select st.name,sc.class from students st inner join student_class sc on st.id=sc.student_id where class=11;
+--------+-------+
| name   | class |
+--------+-------+
| Swetha |    11 |
+--------+-------+
1 row in set (0.00 sec)

mysql> select st.name,sc.class from students st inner join student_class sc on st.id=sc.student_id where class=5;
Empty set (0.00 sec)

mysql> update student_class set class=6 where class=5;
Query OK, 0 rows affected (0.01 sec)
Rows matched: 0  Changed: 0  Warnings: 0

mysql> delete from student_class where id=2;
Query OK, 1 row affected (0.01 sec)

mysql> select * from students inner join student_class on students.id=student_class.student_id where students.dob is null;
Empty set (0.01 sec)

mysql> select count(*) from student_class where status='ACTIVE';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql> select * from student_class;
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |    12 | ACTIVE |
|  3 |          3 |    12 | ACTIVE |
|  4 |          4 |    11 | ACTIVE |
+----+------------+-------+--------+
3 rows in set (0.00 sec)

mysql> select count(*) from student_class where status='ACTIVE' group by class;
+----------+
| count(*) |
+----------+
|        2 |
|        1 |
+----------+
2 rows in set (0.00 sec)

mysql>  select count(*),class from student_class where status='ACTIVE' group by class;
+----------+-------+
| count(*) | class |
+----------+-------+
|        2 |    12 |
|        1 |    11 |
+----------+-------+
2 rows in set (0.00 sec)

mysql> select count(*),class from student_class where status='ACTIVE' group by class having count(*)<5;
+----------+-------+
| count(*) | class |
+----------+-------+
|        2 |    12 |
|        1 |    11 |
+----------+-------+
2 rows in set (0.00 sec)

mysql> select * from students inner join student_class on students.id=student_class.student_id;
+----+-----------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+--------+
| id | name      | email            | mobile_no  | password | gender | dob        | created_date        | id | student_id | class | status |
+----+-----------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+--------+
|  1 | saranya   | saran@gmail.com  | 8798765878 | saran20  | F      | 2004-06-20 | 2022-03-02 00:00:00 |  1 |          1 |    12 | ACTIVE |
|  3 | jerusheya | jeru@gmail.com   | 8873567878 | jeru26   | F      | 2002-08-26 | 2022-03-02 00:00:00 |  3 |          3 |    12 | ACTIVE |
|  4 | Swetha    | swetha@gmail.com | 7448354949 | swethams | M      | 2004-11-17 | 2022-03-02 00:00:00 |  4 |          4 |    11 | ACTIVE |
+----+-----------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+--------+
3 rows in set (0.00 sec)

mysql> select * from students where id in(select student_id from student_class);
+----+-----------+------------------+------------+----------+--------+------------+---------------------+
| id | name      | email            | mobile_no  | password | gender | dob        | created_date        |
+----+-----------+------------------+------------+----------+--------+------------+---------------------+
|  1 | saranya   | saran@gmail.com  | 8798765878 | saran20  | F      | 2004-06-20 | 2022-03-02 00:00:00 |
|  3 | jerusheya | jeru@gmail.com   | 8873567878 | jeru26   | F      | 2002-08-26 | 2022-03-02 00:00:00 |
|  4 | Swetha    | swetha@gmail.com | 7448354949 | swethams | M      | 2004-11-17 | 2022-03-02 00:00:00 |
+----+-----------+------------------+------------+----------+--------+------------+---------------------+
3 rows in set (0.00 sec)

mysql> select * from students inner join student_class on students.id=student_class.student_id where student_class.class=5;
Empty set (0.01 sec)

mysql> select sc.class from students st inner join student_class sc on st.id=sc.student_id where email='n@gmail.com';
Empty set (0.00 sec)

mysql> select name from students where id in(select student_id from student_class where class is not null);
+-----------+
| name      |
+-----------+
| saranya   |
| jerusheya |
| Swetha    |
+-----------+
3 rows in set (0.00 sec)

mysql> select * from students;
+----+-----------+------------------+------------+----------+--------+------------+---------------------+
| id | name      | email            | mobile_no  | password | gender | dob        | created_date        |
+----+-----------+------------------+------------+----------+--------+------------+---------------------+
|  1 | saranya   | saran@gmail.com  | 8798765878 | saran20  | F      | 2004-06-20 | 2022-03-02 00:00:00 |
|  2 | abisha    | abi@gmail.com    | 8793456778 | abisha03 | F      | 2003-06-03 | 2022-03-02 00:00:00 |
|  3 | jerusheya | jeru@gmail.com   | 8873567878 | jeru26   | F      | 2002-08-26 | 2022-03-02 00:00:00 |
|  4 | Swetha    | swetha@gmail.com | 7448354949 | swethams | M      | 2004-11-17 | 2022-03-02 00:00:00 |
+----+-----------+------------------+------------+----------+--------+------------+---------------------+
4 rows in set (0.00 sec)

mysql> select st.name from students st inner join student_class sc on st.id=sc.student_id where class=ALL(select class from student_class where class is not null);
Empty set (0.00 sec)

mysql> select st.name,sc.class from students st left join student_class sc on st.id=sc.student_id;
+-----------+-------+
| name      | class |
+-----------+-------+
| saranya   |    12 |
| abisha    |  NULL |
| jerusheya |    12 |
| Swetha    |    11 |
+-----------+-------+
4 rows in set (0.00 sec)


