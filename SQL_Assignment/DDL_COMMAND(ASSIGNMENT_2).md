Assignment\_2:



mysql> create database library\_System;

Query OK, 1 row affected (0.00 sec)



mysql> use library\_System;

Database changed

mysql>



1.Create the table Member, Books and Issue without any constraints as

mentioned in the schema description above.



mysql> create table Books(Book\_no int,Book\_Name varchar(30),Author\_name varchar(50) ,cost decimal(7,2) ,Category char(10));

Query OK, 0 rows affected (0.05 sec)



mysql> create table Member(Member\_Id int primary key,Member\_Name varchar(30),Member\_address varchar(50) ,Acc\_Open\_Date date ,Membership\_type varchar(20),Fees\_paid int ,Max\_Books\_Allowed int ,Penalty\_Amount Decimal(7,2));

Query OK, 0 rows affected (0.03 sec)



mysql> create table Issue(Lib\_Issue\_Id int,Book\_No int,Member\_Id int ,Issue\_Date date ,Return\_date date);

Query OK, 0 rows affected (0.05 sec)



2.View the structure of the tables.



mysql> desc Member;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_Id         | int(11)      | NO   | PRI | NULL    |       |

| Member\_Name       | varchar(30)  | YES  |     | NULL    |       |

| Member\_address    | varchar(50)  | YES  |     | NULL    |       |

| Acc\_Open\_Date     | date         | YES  |     | NULL    |       |

| Membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int(11)      | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int(11)      | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+

8 rows in set (0.01 sec)



mysql> desc books;

+-------------+--------------+------+-----+---------+-------+

| Field       | Type         | Null | Key | Default | Extra |

+-------------+--------------+------+-----+---------+-------+

| Book\_no     | int(11)      | YES  |     | NULL    |       |

| Book\_Name   | varchar(30)  | YES  |     | NULL    |       |

| Author\_name | varchar(50)  | YES  |     | NULL    |       |

| cost        | decimal(7,2) | YES  |     | NULL    |       |

| Category    | char(10)     | YES  |     | NULL    |       |

+-------------+--------------+------+-----+---------+-------+

5 rows in set (0.00 sec)



mysql> desc Issue;

+--------------+---------+------+-----+---------+-------+

| Field        | Type    | Null | Key | Default | Extra |

+--------------+---------+------+-----+---------+-------+

| Lib\_Issue\_Id | int(11) | YES  |     | NULL    |       |

| Book\_No      | int(11) | YES  |     | NULL    |       |

| Member\_Id    | int(11) | YES  |     | NULL    |       |

| Issue\_Date   | date    | YES  |     | NULL    |       |

| Return\_date  | date    | YES  |     | NULL    |       |

+--------------+---------+------+-----+---------+-------+

5 rows in set (0.00 sec)



3\) Drop the Member table



mysql> drop table Member;

Query OK, 0 rows affected (0.03 sec)



4\) Create the table Member again as per the schema description with the

following constraints.

a. Member\_Id – Primary Key

b. Membership\_type - ‘Lifetime’,’ Annual’, ‘Half Yearly’,’ Quarterly’



mysql> create table Member(Member\_Id int primary key,Member\_Name varchar(30),Member\_address varchar(50) ,Acc\_Open\_Date date ,Membership\_type varchar(20),Fees\_paid int ,Max\_Books\_Allowed int ,Penalty\_Amount Decimal(7,2));

Query OK, 0 rows affected (0.03 sec)



5\) Modify the table Member increase the width of the member name to 30

characters.



mysql> alter table Member

    -> modify Member\_Name varchar(60);

Query OK, 0 rows affected (0.01 sec)

Records: 0  Duplicates: 0  Warnings: 0



6\) Add a column named as Reference of Char(30) to Issue table.



mysql> alter table Issue

    -> add column named char(30);

Query OK, 0 rows affected (0.05 sec)

Records: 0  Duplicates: 0  Warnings: 0



7\) Delete/Drop the column Reference from Issue.



mysql>  alter table Issue

    ->  add column Reference char(30);

Query OK, 0 rows affected (0.04 sec)

Records: 0  Duplicates: 0  Warnings: 0



8\) Rename the table Issue to Lib\_Issue.



mysql> RENAME TABLE Issue TO Lib\_Issue;

Query OK, 0 rows affected (0.02 sec)





9)Insert following data in table Member



mysql> INSERT INTO member

    -> VALUES (1, 'Richa Sharma', 'Pune', '2010-12-05', 'Lifetime', 25000, 5, 50);

Query OK, 1 row affected (0.03 sec)



mysql> INSERT INTO member(Member\_Id,Member\_Name,Member\_address,Acc\_Open\_Date,Membership\_type,Fees\_paid,Max\_Books\_Allowed)values(2,"Garima Sen","Pune",CURDATE(),"Annual",1000,3);

Query OK, 1 row affected (0.07 sec)



mysql> select \* from member;

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

| Member\_Id | Member\_Name  | Member\_address | Acc\_Open\_Date | Membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | Pune           | 2010-12-05    | Lifetime        |     25000 |                 5 |          50.00 |

|         2 | Garima Sen   | Pune           | 2025-08-07    | Annual          |      1000 |                 3 |           NULL |

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

6 rows in set (0.03 sec)





10\) Insert at least 5 records with suitable data.



mysql>  INSERT INTO member values(3,"Mrunmayee","UKD",'2025-07-07','Quarterly',25000,6,12000),

    -> (4,"Raju","Nanded",'2022-12-04','Half Yearly',35000,4,22000),(5,"Mansi","Nanded",'2013-01-06',"Annual",30000,4,32000),(6,"Rutika","UKD",'2021-08-06','Lifetime',34000,4,32000);

Query OK, 4 rows affected (0.02 sec)

Records: 4  Duplicates: 0  Warnings: 0



mysql> select \* from member;

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

| Member\_Id | Member\_Name  | Member\_address | Acc\_Open\_Date | Membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | Pune           | 2010-12-05    | Lifetime        |     25000 |                 5 |          50.00 |

|         2 | Garima Sen   | Pune           | 2025-08-07    | Annual          |      1000 |                 3 |           NULL |

|         3 | Mrunmayee    | UKD            | 2025-07-07    | Quarterly       |     25000 |                 6 |       12000.00 |

|         4 | Raju         | Nanded         | 2022-12-04    | Half Yearly     |     35000 |                 4 |       22000.00 |

|         5 | Mansi        | Nanded         | 2013-01-06    | Annual          |     30000 |                 4 |       32000.00 |

|         6 | Rutika       | UKD            | 2021-08-06    | Lifetime        |     34000 |                 4 |       32000.00 |

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

6 rows in set (0.03 sec)





11\) Modify the column Member\_name. Decrease the width of the member

name to 20 characters. (If it does not allow state the reason for that)



mysql> alter table member

    -> modify Member\_Name varchar(40);

Query OK, 6 rows affected (0.09 sec)

Records: 6  Duplicates: 0  Warnings: 0





12\) Try to insert a record with Max\_Books\_Allowed = 110, Observe the

error that comes.





mysql> INSERT INTO member (Max\_Books\_Allowed) VALUES (110);

**ERROR 1364 (HY000): Field 'Member\_Id' doesn't have a default value**

mysql> INSERT INTO member(Member\_Id, Max\_Books\_Allowed) VALUES (7,110);

Query OK, 1 row affected (0.00 sec)



mysql> select \* from member;

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

| Member\_Id | Member\_Name  | Member\_address | Acc\_Open\_Date | Membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | Pune           | 2010-12-05    | Lifetime        |     25000 |                 5 |          50.00 |

|         2 | Garima Sen   | Pune           | 2025-08-07    | Annual          |      1000 |                 3 |           NULL |

|         3 | Mrunmayee    | UKD            | 2025-07-07    | Quarterly       |     25000 |                 6 |       12000.00 |

|         4 | Raju         | Nanded         | 2022-12-04    | Half Yearly     |     35000 |                 4 |       22000.00 |

|         5 | Mansi        | Nanded         | 2013-01-06    | Annual          |     30000 |                 4 |       32000.00 |

|         6 | Rutika       | UKD            | 2021-08-06    | Lifetime        |     34000 |                 4 |       32000.00 |

|         7 | NULL         | NULL           | NULL          | NULL            |      NULL |               110 |           NULL |

+-----------+--------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

7 rows in set (0.00 sec)



the error said that enter first  Member\_Id then insert another values.





13\) Generate another table named Member101 using a Create command

along with a simple SQL query on member table.



mysql> CREATE TABLE Member101 AS

    -> SELECT \* FROM member;

Query OK, 7 rows affected (0.03 sec)

Records: 7  Duplicates: 0  Warnings: 0



mysql> desc Member101;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_Id         | int(11)      | NO   |     | NULL    |       |

| Member\_Name       | varchar(40)  | YES  |     | NULL    |       |

| Member\_address    | varchar(50)  | YES  |     | NULL    |       |

| Acc\_Open\_Date     | date         | YES  |     | NULL    |       |

| Membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int(11)      | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int(11)      | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+

8 rows in set (0.00 sec)





14\) Add the constraints on columns max\_books\_allowed and penalty\_amt

as follows

a. max\_books\_allowed < 100

b. penalty\_amt maximum 1000

Also give names to the constraints.



mysql> alter table member

    -> add constraint Max\_Books\_Allowed check(max\_books\_allowed < 100);

Query OK, 0 rows affected (0.02 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> alter table member

    -> add constraint check (Penalty\_Amount <= 1000);

Query OK, 0 rows affected (0.00 sec)

Records: 0  Duplicates: 0  Warnings: 0



15\) Drop the table books.



16\) Create table Books again as per the schema description with the

following constraints.

a. Book\_No – Primary Key

b. Book\_Name – Not Null

c. Category – System, Fiction, Database, RDBMS, Others.



mysql> create table Books(Book\_No int Primary key,Book\_Name varchar(40) Not Null,Author varchar(30), Cost int ,Category varchar(30));

Query OK, 0 rows affected (0.04 sec)



17\) Insert data in Book table as follows:



mysql> INSERT INTO Books values (101,"Let us C","Denis Ritchie",450,"System"), (102,"OracleComplete Ref","Loni",550,"Database"),(103,"Mastering SQL","Loni",250,"Database"),(104,"PL SQL-Ref","Scott Urman",750,"Database");

Query OK, 4 rows affected (0.00 sec)

Records: 4  Duplicates: 0  Warnings: 0





18\) Insert more records in Book table.



mysql> INSERT INTO Books

    -> VALUES

    -> (105, 'Data Structures in C', 'Reema Thareja', 500, 'System'),

    -> (106, 'Python Programming', 'Guido van Rossum', 600, 'Programming'),

    -> (107, 'Web Development with HTML/CSS', 'Jon Duckett', 400, 'Web Development'),

    -> (108, 'Java Complete Reference', 'Herbert Schildt', 650, 'Programming');

Query OK, 4 rows affected (0.01 sec)

Records: 4  Duplicates: 0  Warnings: 0





19\) View the data in the tables using simple SQL query.



mysql> select \* from Books;

+---------+-------------------------------+------------------+------+-----------------+

| Book\_No | Book\_Name                     | Author           | Cost | Category        |

+---------+-------------------------------+------------------+------+-----------------+

|     101 | Let us C                      | Denis Ritchie    |  450 | System          |

|     102 | OracleComplete Ref            | Loni             |  550 | Database        |

|     103 | Mastering SQL                 | Loni             |  250 | Database        |

|     104 | PL SQL-Ref                    | Scott Urman      |  750 | Database        |

|     105 | Data Structures in C          | Reema Thareja    |  500 | System          |

|     106 | Python Programming            | Guido van Rossum |  600 | Programming     |

|     107 | Web Development with HTML/CSS | Jon Duckett      |  400 | Web Development |

|     108 | Java Complete Reference       | Herbert Schildt  |  650 | Programming     |

+---------+-------------------------------+------------------+------+-----------------+

8 rows in set (0.00 sec)



20\) Insert into Book following data.



105, National Geographic, Adis Scott, 1000, Science





mysql> select \* from Books;

+---------+-------------------------------+------------------+------+-----------------+

| Book\_No | Book\_Name                     | Author           | Cost | Category        |

+---------+-------------------------------+------------------+------+-----------------+

|     101 | Let us C                      | Denis Ritchie    |  450 | System          |

|     102 | OracleComplete Ref            | Loni             |  550 | Database        |

|     103 | Mastering SQL                 | Loni             |  250 | Database        |

|     104 | PL SQL-Ref                    | Scott Urman      |  750 | Database        |

|     **105 |  National Geographic          | Adis Scott       | 1000 | Science**         |

|     106 | Python Programming            | Guido van Rossum |  600 | Programming     |

|     107 | Web Development with HTML/CSS | Jon Duckett      |  400 | Web Development |

|     108 | Java Complete Reference       | Herbert Schildt  |  650 | Programming     |

+---------+-------------------------------+------------------+------+-----------------+

8 rows in set (0.00 sec)





21\) Rename the table Lib\_Issue to Issue.



 RENAME TABLE Lib\_Issue TO Issue;





22\) Drop table Issue.



mysql> drop  table Issue;

Query OK, 0 rows affected (0.05 sec)





23\) As per the given structure Create table Issue again with following

constraints.



 Lib\_Issue\_Id-Primary key

 Book\_No- foreign key

 Member\_id - foreign key

 Issue\_date

 Return\_date



mysql> CREATE TABLE Issue (

    ->     Lib\_Issue\_Id INT PRIMARY KEY,

    ->     Book\_No INT,

    ->     Member\_Id INT,

    ->     Issue\_Date DATE,

    ->     Return\_Date DATE,

    ->     FOREIGN KEY (Member\_Id) REFERENCES member(Member\_Id),

    ->     FOREIGN KEY (Book\_No) REFERENCES books(Book\_No)

    -> );

Query OK, 0 rows affected (0.05 sec)





24\) Insert following data into Issue table.



Lib\_Issu e\_Id Book\_No Member\_ID Issue Date

7001 101 1 10-Dec-06

7002 102 2 25-Dec-06

7003 104 1 15-Jan-06

7004 101 1 04-Jul-06

7005 104 2 15-Nov-06

7006 101 3 18-Feb-06





mysql> INSERT INTO Issue (Lib\_Issue\_Id, Book\_No, Member\_Id, Issue\_Date)

    -> VALUES

    -> (7001, 101, 1, '2006-12-10'),

    -> (7002, 102, 2, '2006-12-25'),

    -> (7003, 104, 1, '2006-01-15'),

    -> (7004, 101, 1, '2006-07-04'),

    -> (7005, 104, 2, '2006-11-15'),

    -> (7006, 101, 3, '2006-02-18');

Query OK, 6 rows affected (0.03 sec)

Records: 6  Duplicates: 0  Warnings: 0



25\) Remove the constraints on Issue table



mysql> alter table Issue

    -> DROP FOREIGN KEY issue\_ibfk\_1;

Query OK, 0 rows affected (0.04 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> alter table Issue

    -> DROP FOREIGN KEY issue\_ibfk\_2;

Query OK, 0 rows affected (0.04 sec)

Records: 0  Duplicates: 0  Warnings: 0



26\) Insert a record in Issue table. The member\_id should not exist in

member table.



INSERT INTO member VALUES(8,"Akki","Mumbai",'2025-04-04',"Half Yearly",36000,7,30);

Query OK, 1 row affected (0.04 sec)





27\) Now enable the constraints of Issue table. Observe the error





29\) Try to delete the record of member id 1 from member table and

observe the error.



mysql> delete from member where member\_id=1;

ERROR 1451 (23000): Cannot delete or update a parent row: a foreign key constraint fails (`library\_system`.`issue`, CONSTRAINT `issue\_ibfk\_2` FOREIGN KEY (`member\_id`) REFERENCES `member` (`member\_id`))



30\) View the data and structure of all the three tables Member,

Issue, Book.



mysql> select \* from member;

+-----------+-------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

| Member\_Id | Member\_Name | Member\_address | Acc\_Open\_Date | Membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+-------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

|         2 | Garima Sen  | Pune           | 2025-08-07    | Annual          |      1000 |                 3 |           NULL |

|         3 | Mrunmayee   | UKD            | 2025-07-07    | Quarterly       |     25000 |                 6 |       12000.00 |

|         4 | Raju        | Nanded         | 2022-12-04    | Half Yearly     |     35000 |                 4 |       22000.00 |

|         5 | Mansi       | Nanded         | 2013-01-06    | Annual          |     30000 |                 4 |       32000.00 |

|         6 | Rutika      | UKD            | 2021-08-06    | Lifetime        |     34000 |                 4 |       32000.00 |

|         7 | NULL        | NULL           | NULL          | NULL            |      NULL |               110 |           NULL |

|         8 | Akki        | Mumbai         | 2025-04-04    | Half Yearly     |     36000 |                 7 |          30.00 |

+-----------+-------------+----------------+---------------+-----------------+-----------+-------------------+----------------+

7 rows in set (0.00 sec)



mysql> select \* from Issue;

+--------------+---------+-----------+------------+-------------+

| Lib\_Issue\_Id | Book\_No | Member\_Id | Issue\_Date | Return\_Date |

+--------------+---------+-----------+------------+-------------+

|         7001 |     101 |         1 | 2006-12-10 | NULL        |

|         7002 |     102 |         2 | 2006-12-25 | NULL        |

|         7003 |     104 |         1 | 2006-01-15 | NULL        |

|         7004 |     101 |         1 | 2006-07-04 | NULL        |

|         7005 |     104 |         2 | 2006-11-15 | NULL        |

|         7006 |     101 |         3 | 2006-02-18 | NULL        |

+--------------+---------+-----------+------------+-------------+

6 rows in set (0.03 sec)



mysql> select \* from books;

+---------+-------------------------------+------------------+------+-----------------+

| Book\_No | Book\_Name                     | Author           | Cost | Category        |

+---------+-------------------------------+------------------+------+-----------------+

|     101 | Let us C                      | Denis Ritchie    |  450 | System          |

|     102 | OracleComplete Ref            | Loni             |  550 | Database        |

|     103 | Mastering SQL                 | Loni             |  250 | Database        |

|     104 | PL SQL-Ref                    | Scott Urman      |  750 | Database        |

|     105 |  National Geographic          | Adis Scott       | 1000 | Science         |

|     106 | Python Programming            | Guido van Rossum |  600 | Programming     |

|     107 | Web Development with HTML/CSS | Jon Duckett      |  400 | Web Development |

|     108 | Java Complete Reference       | Herbert Schildt  |  650 | Programming     |

+---------+-------------------------------+------------------+------+-----------------+

8 rows in set (0.00 sec)





31\) Modify the Return\_Date of 7004,7005 to 15 days after the Issue\_ date.





select \* from Issue

where id = 7004 or id = 7005

select date\_add(Return\_Date,interval 15 day);



mysql> select \* from issue;

+--------------+---------+-----------+------------+-------------+

| Lib\_Issue\_Id | Book\_No | Member\_Id | Issue\_Date | Return\_Date |

+--------------+---------+-----------+------------+-------------+

|         7001 |     101 |         1 | 2006-12-10 | NULL        |

|         7002 |     102 |         2 | 2006-12-25 | NULL        |

|         7003 |     104 |         1 | 2006-01-15 | NULL        |

|         7004 |     101 |         1 | 2006-07-04 | 2007-07-22  |

|         7005 |     104 |         2 | 2006-11-15 | 2007-07-30  |

|         7006 |     101 |         3 | 2006-02-18 | NULL        |

+--------------+---------+-----------+------------+-------------+

6 rows in set (0.02 sec)





32\) Remove all the records from Issue table where member\_ID is 1

and Issue date in before 10-Dec-06.



mysql> select \* from issue;

+--------------+---------+-----------+------------+-------------+

| Lib\_Issue\_Id | Book\_No | Member\_Id | Issue\_Date | Return\_Date |

+--------------+---------+-----------+------------+-------------+

|         7001 |     101 |         1 | 2006-12-10 | NULL        |

|         7002 |     102 |         2 | 2006-12-25 | NULL        |

|         7005 |     104 |         2 | 2006-11-15 | 2007-07-30  |

|         7006 |     101 |         3 | 2006-02-18 | NULL        |

+--------------+---------+-----------+------------+-------------+

4 rows in set (0.00 sec)





33\) Remove all the records from Book table with category other

than RDBMS and Database.



mysql> delete from books

&nbsp;   -> where category Not in ('RDBMS','Database');

Query OK, 5 rows affected (0.04 sec)



mysql> select \* from books;

+---------+--------------------+-------------+------+----------+

| Book\_No | Book\_Name          | Author      | Cost | Category |

+---------+--------------------+-------------+------+----------+

|     102 | OracleComplete Ref | Loni        |  550 | Database |

|     103 | Mastering SQL      | Loni        |  250 | Database |

|     104 | PL SQL-Ref         | Scott Urman |  750 | Database |

+---------+--------------------+-------------+------+----------+

3 rows in set (0.00 sec)





34\) Remove the table Member



mysql> drop table member;

Query OK, 0 rows affected (0.05 sec)





35\) Remove the table Book.



mysql> drop table books;

Query OK, 0 rows affected (0.05 sec)



