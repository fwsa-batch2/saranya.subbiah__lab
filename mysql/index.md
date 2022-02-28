## Indexes

#### Type of Index

| Types               |
|:--------------------|
| Clustered index     |
| Non-clustered index |

#### Create Index

```syntax
create index ix_name ON table_name (column_name asc);
```

#### Index with create table

```syntax
create table table_name (c1 data_type primary key, c2 data_type, c3 data_type, c4 data_type, index index_name (c2,c3,c4));
```

#### Show Index

```syntax
show index from table_name;
```

#### Drop Index

```syntax
DROP INDEX index_name ON table_name;
```
***
#### Table 

``` syntax
select * from class;
```

| id | name      | mark |
|:---|:----|:----|
|  1 | jerusheya | 99   |
|  2 | saranya   | 98   |
|  3 | abisha    | 97   |

###### 3 rows in set (0.00 sec)
***

#### Create Index 

``` syntax
create index ix_name on class (name asc);
```
###### Query OK, 0 rows affected (0.05 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
***

#### Create Composite Index 
``` syntax
 create index name on class (name,mark,id);
 ```
###### Query OK, 0 rows affected (0.05 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
***

#### Non-Clustered Index


```syntax
create index ix_name on class (name asc);
```
###### Query OK, 0 rows affected (0.05 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
***

#### Unique Index 

```syntax
create unique index un_ix_name on class (name);
```


