select * from class inner join class2 on class.mark=class2.mark;
+----+-----------+------+----+----------+------+
| id | name      | mark | id | name     | mark |
+----+-----------+------+----+----------+------+
|  1 | jerusheya | 99   |  1 | aswath   | 99   |
|  2 | saranya   | 98   |  2 | haiden   | 98   |
|  3 | abisha    | 97   |  3 | santhanu | 97   |
+----+-----------+------+----+----------+------+
select class.mark,class2.mark from class inner join class2 on class.mark=class2.mark;
+------+------+
| mark | mark |
+------+------+
| 99   | 99   |
| 98   | 98   |
| 97   | 97   |
+------+------+
3 rows in set (0.00 sec)
select * from class left join class2 on class.mark=class2.mark;
+----+-----------+------+------+----------+------+
| id | name      | mark | id   | name     | mark |
+----+-----------+------+------+----------+------+
|  1 | jerusheya | 99   |    1 | aswath   | 99   |
|  2 | saranya   | 98   |    2 | haiden   | 98   |
|  3 | abisha    | 97   |    3 | santhanu | 97   |
+----+-----------+------+------+----------+------+
3 rows in set (0.00 sec)

select class.mark,class2.mark from class left join class2 on class.mark=class2.mark where class2.mark is not null;
+------+------+
| mark | mark |
+------+------+
| 99   | 99   |
| 98   | 98   |
| 97   | 97   |
+------+------+
3 rows in set (0.01 sec)

 select * from class right join class2 on class.mark=class2.mark;
+------+-----------+------+----+----------+------+
| id   | name      | mark | id | name     | mark |
+------+-----------+------+----+----------+------+
|    1 | jerusheya | 99   |  1 | aswath   | 99   |
|    2 | saranya   | 98   |  2 | haiden   | 98   |
|    3 | abisha    | 97   |  3 | santhanu | 97   |
+------+-----------+------+----+----------+------+
3 rows in set (0.00 sec)



 select class.mark,class2.mark from class right join class2 on class.mark=class2.mark where class.mark is not null;
+------+------+
| mark | mark |
+------+------+
| 99   | 99   |
| 98   | 98   |
| 97   | 97   |
+------+------+
3 rows in set (0.00 sec)

select * from class cross join class2;
+----+-----------+------+----+----------+------+
| id | name      | mark | id | name     | mark |
+----+-----------+------+----+----------+------+
|  3 | abisha    | 97   |  1 | aswath   | 99   |
|  2 | saranya   | 98   |  1 | aswath   | 99   |
|  1 | jerusheya | 99   |  1 | aswath   | 99   |
|  3 | abisha    | 97   |  2 | haiden   | 98   |
|  2 | saranya   | 98   |  2 | haiden   | 98   |
|  1 | jerusheya | 99   |  2 | haiden   | 98   |
|  3 | abisha    | 97   |  3 | santhanu | 97   |
|  2 | saranya   | 98   |  3 | santhanu | 97   |
|  1 | jerusheya | 99   |  3 | santhanu | 97   |
+----+-----------+------+----+----------+------+
9 rows in set (0.00 sec)

 select * from class cross join class2 where class.mark=class2.mark;
+----+-----------+------+----+----------+------+
| id | name      | mark | id | name     | mark |
+----+-----------+------+----+----------+------+
|  1 | jerusheya | 99   |  1 | aswath   | 99   |
|  2 | saranya   | 98   |  2 | haiden   | 98   |
|  3 | abisha    | 97   |  3 | santhanu | 97   |
+----+-----------+------+----+----------+------+
3 rows in set (0.00 sec)

