






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



