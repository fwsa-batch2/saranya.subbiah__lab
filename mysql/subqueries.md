
``` syntax
use supply;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed

``` syntax
show tables;
```

| Tables_in_supply |
|:----|
| Item             |
| suppliers        |

###### 2 rows in set (0.01 sec)
***

``` syntax
select * from suppliers;
```

| sup_no | sup_name   | status | city       |
|:----|:-----|:---|:----|
| S1     | Dairy Milk |     30 | Tamil Nadu |
| S2     | 5 Star     |     15 | Kerala     |
| S3     | Kit Kat    |     20 | Hyderabad  |
| S4     | Munch      |     12 | Delhi      |
| S5     | Perk       |     12 | Gujarat    |
| S6     | Milkybar   |     15 | Karnataka  |
| S7     | Snickers   |     20 | Tamil Nadu |

###### 7 rows in set (0.00 sec)


``` syntax
select * from Item;
```

| Item_No | Item_Name  | Price |
|:----|:----|:---|
| I1      | Biscuits   |    20 |
| I2      | Bread      |    10 |
| I3      | Chocolates |    50 |
| I4      | Cake       |    30 |
| I5      | Juice      |    25 |

###### 5 rows in set (0.00 sec)

``` syntax
select * from shipments;
```

| sup_no | Item_No | quantity |
|:----|:---|:---|
| S1     | I1      |       30 |
| S2     | I2      |       20 |
| S3     | I3      |       25 |
| S4     | I4      |       30 |
| S5     | I5      |       10 |
| S6     | I3      |       15 |

###### 6 rows in set (0.00 sec)

``` syntax
select * from shipments where quantity > 15;
```

| sup_no | Item_No | quantity |
|:----|:----|:----|
| S1     | I1      |       30 |
| S2     | I2      |       20 |
| S3     | I3      |       25 |
| S4     | I4      |       30 |

###### 4 rows in set (0.01 sec)

``` syntax
select a.sup_no from (select * from shipments where quantity > 15) as a;
```

| sup_no |
|:------|
| S1     |
| S2     |
| S3     |
| S4     |

###### 4 rows in set (0.00 sec)

``` syntax
select a.* from (select * from shipments where quantity > 15) as a;
```

| sup_no | Item_No | quantity |
|:-----|:----|:----|
| S1     | I1      |       30 |
| S2     | I2      |       20 |
| S3     | I3      |       25 |
| S4     | I4      |       30 |

###### 4 rows in set (0.00 sec)

``` syntax
select * from shipments where quantity > (select avg(quantity) from shipments);
```

| sup_no | Item_No | quantity |
|:----|:----|:----|
| S1     | I1      |       30 |
| S3     | I3      |       25 |
| S4     | I4      |       30 |

###### 3 rows in set (0.00 sec)

``` syntax
select avg(quantity) from shipments;
```

| avg(quantity) |
|:----|
|       21.6667 |

###### 1 row in set (0.00 sec)

``` syntax
select suppliers.sup_name,shipments.quantity from suppliers,shipments;
```

| sup_name   | quantity |
|:-----|:----|
| Dairy Milk |       15 |
| Dairy Milk |       10 |
| Dairy Milk |       30 |
| Dairy Milk |       25 |
| Dairy Milk |       20 |
| Dairy Milk |       30 |
| 5 Star     |       15 |
| 5 Star     |       10 |
| 5 Star     |       30 |
| 5 Star     |       25 |
| 5 Star     |       20 |
| 5 Star     |       30 |
| Kit Kat    |       15 |
| Kit Kat    |       10 |
| Kit Kat    |       30 |
| Kit Kat    |       25 |
| Kit Kat    |       20 |
| Kit Kat    |       30 |
| Munch      |       15 |
| Munch      |       10 |
| Munch      |       30 |
| Munch      |       25 |
| Munch      |       20 |
| Munch      |       30 |
| Perk       |       15 |
| Perk       |       10 |
| Perk       |       30 |
| Perk       |       25 |
| Perk       |       20 |
| Perk       |       30 |
| Milkybar   |       15 |
| Milkybar   |       10 |
| Milkybar   |       30 |
| Milkybar   |       25 |
| Milkybar   |       20 |
| Milkybar   |       30 |
| Snickers   |       15 |
| Snickers   |       10 |
| Snickers   |       30 |
| Snickers   |       25 |
| Snickers   |       20 |
| Snickers   |       30 |

###### 42 rows in set (0.00 sec)

``` syntax
select suppliers.sup_name,shipments.quantity from suppliers,shipments where suppliers.sup_no=shipments.sup_no;
```

| sup_name   | quantity |
|:-----|:-----|
| Dairy Milk |       30 |
| 5 Star     |       20 |
| Kit Kat    |       25 |
| Munch      |       30 |
| Perk       |       10 |
| Milkybar   |       15 |

###### 6 rows in set (0.00 sec)







