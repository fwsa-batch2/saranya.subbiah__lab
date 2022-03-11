mysql> use supply;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> create table Item (Item_No varchar(3),Item_Name varchar(20), Price int);
ERROR 1050 (42S01): Table 'Item' already exists
mysql> show tables;
+------------------+
| Tables_in_supply |
+------------------+
| Item             |
| suppliers        |
+------------------+
2 rows in set (0.01 sec)

