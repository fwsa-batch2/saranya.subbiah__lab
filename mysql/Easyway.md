






![Drawing (2) (1)](https://user-images.githubusercontent.com/93571075/159632721-5f109eef-86b0-4393-921b-509337ca4991.png)







![ERR ](https://user-images.githubusercontent.com/93571075/159429799-d2acc8cf-5a10-413c-a779-b1fc07a56ed6.jpeg)


### EasyWay

```syntax
create database EasyWay;
```

###### Query OK, 1 row affected (0.01 sec)

```syntax
use EasyWay;
```
###### Database changed

```syntax
create table User (User_id int auto_increment primary key, Username varchar(10), Email varchar(2s0), Password varchar(10));
```
###### Query OK, 0 rows affected (0.05 sec)

```syntax
desc User;
```

| Field    | Type        | Null | Key | Default | Extra          |
|:-----|:-----|:----|:----|:----|:-----|
| User_id  | int         | NO   | PRI | NULL    | auto_increment |
| Username | varchar(10) | YES  |     | NULL    |                |
| Email    | varchar(20) | YES  |     | NULL    |                |
| Password | varchar(10) | YES  |     | NULL    |                |

###### 4 rows in set (0.00 sec)

```syntax
insert into User values ('1','Saranya','Saran@gmail.com','S@ran20'),('2','Abisha','Abisha@gmail.com','Abi2003'),('3','Jerusheya','Jeru@gmail.com','jeru2002'),('4','Swetha','Swetha@gmail.com','swetha20'),('5','Aswath','Aswath@gmail.com','aswath26'),('6','Haiden','haiden@gmail.com','haidenfdo'),('7','Riyas','riyas@gmail.com','riyas404'),('8','Rishi','rishi@gmail.com','brainy30'),('9','Santhanu','santhanu@gmail.com','santa606'),('10','Selva','selva@gmail.com','ace2000'),('11','Annamalai','Annamalai@gmail.com','anna202');
```
###### Query OK, 11 rows affected (0.01 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
select * from User;
```

| User_id | Username  | Email               | Password  |
|:-----|:-----|:-----|:-----|
|       1 | Saranya   | Saran@gmail.com     | S@ran20   |
|       2 | Abisha    | Abisha@gmail.com    | Abi2003   |
|       3 | Jerusheya | Jeru@gmail.com      | jeru2002  |
|       4 | Swetha    | Swetha@gmail.com    | swetha20  |
|       5 | Aswath    | Aswath@gmail.com    | aswath26  |
|       6 | Haiden    | haiden@gmail.com    | haidenfdo |
|       7 | Riyas     | riyas@gmail.com     | riyas404  |
|       8 | Rishi     | rishi@gmail.com     | brainy30  |
|       9 | Santhanu  | santhanu@gmail.com  | santa606  |
|      10 | Selva     | selva@gmail.com     | ace2000   |
|      11 | Annamalai | Annamalai@gmail.com | anna202   |

###### 11 rows in set (0.00 sec)

```syntax
create table Passenger(Id int auto_increment primary key, Name varchar(20), Age tinyint, Gender varchar(10), Mobile_No bigint unique, Address varchar(100));
```
###### Query OK, 0 rows affected (0.06 sec)

```syntax
desc Passenger;
```

| Field     | Type         | Null | Key | Default | Extra          |
|:------|:-----|:----|:-----|:-----|:-----|
| Id        | int          | NO   | PRI | NULL    | auto_increment |
| Name      | varchar(20)  | YES  |     | NULL    |                |
| Age       | tinyint      | YES  |     | NULL    |                |
| Gender    | varchar(10)  | YES  |     | NULL    |                |
| Mobile_No | bigint       | YES  | UNI | NULL    |                |
| Address   | varchar(100) | YES  |     | NULL    |                |

###### 6 rows in set (0.00 sec)

```syntax
insert into Passenger values('1001','Saranya','17','Female','7538802252','Ambasamudram'),('1002','Abisha','18','Female','6379481526','Thalaiyuthu'),('1003','Jerusheya','18','Female','9363232559','Pulavanpatti'),('1004','Swetha','17','Female','9025336748','Madurai'),('1005','Aswath','18','Male','7449050819','Ramanathapuram'),('1006','Haiden','19','Male','9360243948','Koothanguli'),('1007','Riyas','18','Male','8248966539','Tirunelveli'),('1008','Rishi','19','Male','6381950080','Tirupur'),('1009','Santhanu','19','Male','8870522547','Theni'),('1010','Selva','20','Male','6374336552','Chennai'),('1011','Annamalai','18','Male','7695883749','Madurai');
```
###### Query OK, 11 rows affected (0.01 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
select * from Passenger;
```

| Id   | Name      | Age  | Gender | Mobile_No  | Address        |
|:--------|:----|:-----|:------|:-----|:----|
| 1001 | Saranya   |   17 | Female | 7538802252 | Ambasamudram   |
| 1002 | Abisha    |   18 | Female | 6379481526 | Thalaiyuthu    |
| 1003 | Jerusheya |   18 | Female | 9363232559 | Pulavanpatti   |
| 1004 | Swetha    |   17 | Female | 9025336748 | Madurai        |
| 1005 | Aswath    |   18 | Male   | 7449050819 | Ramanathapuram |
| 1006 | Haiden    |   19 | Male   | 9360243948 | Koothanguli    |
| 1007 | Riyas     |   18 | Male   | 8248966539 | Tirunelveli    |
| 1008 | Rishi     |   19 | Male   | 6381950080 | Tirupur        |
| 1009 | Santhanu  |   19 | Male   | 8870522547 | Theni          |
| 1010 | Selva     |   20 | Male   | 6374336552 | Chennai        |
| 1011 | Annamalai |   18 | Male   | 7695883749 | Madurai        |

###### 11 rows in set (0.00 sec)

```syntax
create table Booking(Booking_id int primary key, Seat_No int, Date date, Time time, Place varchar(20), BusName varchar(20), foreign key(Booking_id) references Passenger(Id));
```
###### Query OK, 0 rows affected (0.06 sec)


```syntax
desc Booking;
```

| Field      | Type        | Null | Key | Default | Extra |
|:------|:-----|:-----|:------|:----|:----|
| Booking_id | int         | NO   | PRI | NULL    |       |
| Seat_No    | int         | YES  |     | NULL    |       |
| Date       | date        | YES  |     | NULL    |       |
| Time       | time        | YES  |     | NULL    |       |
| Place      | varchar(20) | YES  |     | NULL    |       |
| BusName    | varchar(20) | YES  |     | NULL    |       |

###### 6 rows in set (0.00 sec)

```syntax
insert into Booking values('1001','15','2022-04-29','5:00:00-6:00:00','Chennai','Selvam Travels'),('1002','21','2022-04-18','7:00:00-5:00:00','Coimbatore','Ganapathy Travels'),('1003','30','2022-04-15','8:00:00-7:00:00','Trinvandrum','SreeJothi Travels'),('1004','23','2022-04-17','11:00:00-5:00:00','Chennai','Selvam Travels'),('1005','20','2022-04-10','1:00:00-7:00:00','Tirupur','Subethra Travels'),('1006','26','2022-04-07','8:00:00-7:00:00','Chennai','Santhiya Travels'),('1007','22','2022-05-05','01:00:00-11:00:00','Trichy','Jerlin Travels'),('1008','28','2022-04-02','11:00:00-10:00:00','Kerala','Subam Travels'),('1009','24','2022-04-22','4:00:00-10:00:00','Villupuram','ADJ Travels'),('1010','28','2022-04-26','08:00:00-6:00:00','Salem','Sabari Travels'),('1011','16','2022-04-23','09:00:00-7:00:00','Banglore','Sutha Travels');
```
###### Query OK, 11 rows affected (0.01 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
select * from Booking;
```

| Booking_id | Seat_No | Date       | Time              | Place       | BusName           |
|:-----|:-----|:----|:----|:----|:----|
|       1001 |      15 | 2022-04-29 | 5:00:00-6:00:00   | Chennai     | Selvam Travels    |
|       1002 |      21 | 2022-04-18 | 7:00:00-5:00:00   | Coimbatore  | Ganapathy Travels |
|       1003 |      30 | 2022-04-15 | 8:00:00-7:00:00   | Trinvandrum | SreeJothi Travels |
|       1004 |      23 | 2022-04-17 | 11:00:00-5:00:00  | Chennai     | Selvam Travels    |
|       1005 |      20 | 2022-04-10 | 1:00:00-7:00:00   | Tirupur     | Subethra Travels  |
|       1006 |      26 | 2022-04-07 | 8:00:00-7:00:00   | Chennai     | Santhiya Travels  |
|       1007 |      22 | 2022-05-05 | 01:00:00-11:00:00 | Trichy      | Jerlin Travels    |
|       1008 |      28 | 2022-04-02 | 11:00:00-10:00:00 | Kerala      | Subam Travels     |
|       1009 |      24 | 2022-04-22 | 4:00:00-10:00:00  | Villupuram  | ADJ Travels       |
|       1010 |      28 | 2022-04-26 | 08:00:00-6:00:00  | Salem       | Sabari Travels    |
|       1011 |      16 | 2022-04-23 | 09:00:00-7:00:00  | Banglore    | Sutha Travels     |

###### 11 rows in set (0.00 sec)

```syntax
create table Payment(Payment_id int primary key, Card_No bigint, HolderName varchar(30), foreign key(Payment_id) references Passenger(Id));
```
###### Query OK, 0 rows affected (0.05 sec)

```syntax
desc Payment;
```

| Field      | Type        | Null | Key | Default | Extra |
|:-----|:----|:----|:----|:----|:----|
| Payment_id | int         | NO   | PRI | NULL    |       |
| Card_No    | bigint      | YES  |     | NULL    |       |
| HolderName | varchar(30) | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

```syntax
insert into Payment values('1001','657847893622','Saranya'),('1002','578609834093','Abisha'),('1003','256387675463','Jerusheya'),('1004','674378784547','Swetha'),('1005','345687568763','Aswath'),('1006','354678787653','Haiden'),('1007','786765347878','Riyas'),('1008','245378985356','Rishi'),('1009','623567879823','Santhanu'),('1010','526372567288','Selva'),('1011','657789896565','Annamalai');
```
###### Query OK, 11 rows affected (0.01 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
select * from Payment;
```

| Payment_id | Card_No      | HolderName |
|:----|:-----|:----|
|       1001 | 657847893622 | Saranya    |
|       1002 | 578609834093 | Abisha     |
|       1003 | 256387675463 | Jerusheya  |
|       1004 | 674378784547 | Swetha     |
|       1005 | 345687568763 | Aswath     |
|       1006 | 354678787653 | Haiden     |
|       1007 | 786765347878 | Riyas      |
|       1008 | 245378985356 | Rishi      |
|       1009 | 623567879823 | Santhanu   |
|       1010 | 526372567288 | Selva      |
|       1011 | 657789896565 | Annamalai  |

###### 11 rows in set (0.00 sec)

 ```syntax
create table Roles(Role_id int primary key, Role_Name varchar(50), Role_Desc varchar(30));
```
###### Query OK, 0 rows affected (0.04 sec)

```syntax
desc Roles;
```

| Field     | Type        | Null | Key | Default | Extra |
|:-----|:----|:----|:----|:----|:----|
| Role_id   | int         | NO   | PRI | NULL    |       |
| Role_Name | varchar(50) | YES  |     | NULL    |       |
| Role_Desc | varchar(30) | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

```syntax
 insert into Roles values ('1001','Admin','Add Buses'),('1002','User','Book Tickets'),('1003','User','Online Payment'),('1004','Admin','Delete Buses'),('1005','Admin','Change Time'),('1006','Admin','Add new features'),('1007','Admin','Change details of Buses'),('1008','Admin','Insert Blogs'),('1009','Admin','Change contact details'),('1010','User','Give Reviews');
 ```
###### Query OK, 10 rows affected (0.01 sec)
###### Records: 10  Duplicates: 0  Warnings: 0

```syntax
select * from Roles;
```

| Role_id | Role_Name | Role_Desc               |
|:----|:-----|:----|
|    1001 | Admin     | Add Buses               |
|    1002 | User      | Book Tickets            |
|    1003 | User      | Online Payment          |
|    1004 | Admin     | Delete Buses            |
|    1005 | Admin     | Change Time             |
|    1006 | Admin     | Add new features        |
|    1007 | Admin     | Change details of Buses |
|    1008 | Admin     | Insert Blogs            |
|    1009 | Admin     | Change contact details  |
|    1010 | User      | Give Reviews            |

###### 10 rows in set (0.00 sec)


```syntax
create table Reviews(Review_id int primary key, Name varchar(30), Comments text, foreign key(Review_id) references User(User_id));
```
###### Query OK, 0 rows affected (0.06 sec)

```syntax
desc Reviews;
```

| Field     | Type        | Null | Key | Default | Extra |
|:-----|:----|:----|:----|:-----|:-----|
| Review_id | int         | NO   | PRI | NULL    |       |
| Name      | varchar(30) | YES  |     | NULL    |       |
| Comments  | text        | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

```syntax
insert into Reviews values('1','Saranya','Awesome page'),('2','Abisha','High Price'),('3','Jerusheya','Good'),('4','Swetha','Easy to book tickets'),('5','Aswath','Helpful'),('6','Haiden','Useful'),('7','Riyas','Expecting more'),('8','Rishi','Nice'),('9','Santhanu','Good page'),('10','Selva','Very nice'),('11','Annamalai','Helpful');
```
###### Query OK, 11 rows affected (0.01 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
select * from Reviews;
```

| Review_id | Name      | Comments             |
|:------|:-----|:-----|
|         1 | Saranya   | Awesome page         |
|         2 | Abisha    | High Price           |
|         3 | Jerusheya | Good                 |
|         4 | Swetha    | Easy to book tickets |
|         5 | Aswath    | Helpful              |
|         6 | Haiden    | Useful               |
|         7 | Riyas     | Expecting more       |
|         8 | Rishi     | Nice                 |
|         9 | Santhanu  | Good page            |
|        10 | Selva     | Very nice            |
|        11 | Annamalai | Helpful              |

###### 11 rows in set (0.00 sec)
