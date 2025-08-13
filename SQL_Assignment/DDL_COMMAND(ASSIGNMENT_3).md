1\. Write a SQL statement to insert a record as follows:

Employees :



mysql> select \* from employee;

+-------------+------------+-----------+----------+--------------+------------+---------+--------+------------+------------+---------------+

| employee\_id | first\_name | last\_name | email    | phone\_number | hire\_date  | job\_id  | salary | commission | manager\_id | department\_id |

+-------------+------------+-----------+----------+--------------+------------+---------+--------+------------+------------+---------------+

|         100 | Steven     | King      | SKING    | 515.123.4567 | 1987-06-17 | AD\_PRES |  24000 |       NULL |        200 |            10 |

|         101 | Neena      | Kochhar   | NKOCHHAR | 515.123.4568 | 1987-06-18 | AD\_VP   |  17000 |       NULL |        200 |            10 |

|         102 | Lex        | De Haan   | LDEHAAN  | 515.123.4569 | 1987-06-19 | AD\_VP   |  17000 |       NULL |        200 |            10 |

|         103 | Alexander  | Hunold    | AHUNOLD  | 590.423.4567 | 1987-06-20 | IT\_PROG |   9000 |       NULL |        103 |            60 |

|         104 | Bruce      | Ernst     | BERNST   | 590.423.4568 | 1987-06-21 | IT\_PROG |   6000 |       NULL |        103 |            60 |

|         105 | David      | Austin    | DAUSTIN  | 590.423.4569 | 1987-06-22 | IT\_PROG |   4800 |       NULL |        103 |            60 |

|         106 | Valli      | Pataballa | VPATABAL | 590.423.4560 | 1987-06-23 | IT\_PROG |   4800 |       NULL |        103 |            60 |

|         107 | Diana      | Lorentz   | DLORENTZ | 590.423.5567 | 1987-06-24 | IT\_PROG |   4200 |       NULL |        114 |            30 |

|         108 | Nancy      | Greenberg | NGREENBE | 515.124.4569 | 1987-06-25 | SA\_MAN  |  12000 |       NULL |        145 |            80 |

|         109 | Daniel     | Faviet    | DFAVIET  | 515.124.4169 | 1987-06-26 | SA\_MAN  |   9000 |       NULL |        145 |            80 |

+-------------+------------+-----------+----------+--------------+------------+---------+--------+------------+------------+---------------+

10 rows in set (0.00 sec)





2\. Write a SQL statement to insert 3 rows by a single insert statement.



mysql> INSERT INTO employee (

&nbsp;   ->     employee\_id, first\_name, last\_name, email, phone\_number, hire\_date,

&nbsp;   ->     job\_id, salary, commission, manager\_id, department\_id

&nbsp;   -> ) VALUES

&nbsp;   -> (110, 'Raju', 'Nalbalwar', 'Raju@gmail.com', '2345987609', '2024-04-01', 'IT\_PROG', 27000, NULL, 103, 60),

&nbsp;   -> (111, 'Rutika', 'Vaidya', 'Rutika@gmail.com', '8723765423', '2023-08-08', 'SA\_MAN', 23000, NULL, 145, 80),

&nbsp;   -> (112, 'Akki', 'Swami', 'Akki@gmail.com', '6725715728', '2021-04-07', 'IT\_PROG', 25000, NULL, 103, 60);

Query OK, 3 rows affected (0.05 sec)

Records: 3  Duplicates: 0  Warnings: 0





3\. Write a SQL statement to insert one row in jobs table to ensure that no duplicate

value will be entered in the job\_id column.



mysql>

&nbsp;      alter table jobs

&nbsp;   -> add primary key(job\_id);



4\. Write SQL statement to increment salary of each emp by 10%.



mysql> update employee

&nbsp;   -> set salary =  (salary + salary \* 0.10);

Query OK, 13 rows affected (0.02 sec)

Rows matched: 13  Changed: 13  Warnings: 0



mysql> select \* from employee;

+-------------+------------+-----------+------------------+--------------+------------+---------+--------+------------+------------+---------------+

| employee\_id | first\_name | last\_name | email            | phone\_number | hire\_date  | job\_id  | salary | commission | manager\_id | department\_id |

+-------------+------------+-----------+------------------+--------------+------------+---------+--------+------------+------------+---------------+

|         100 | Steven     | King      | SKING            | 515.123.4567 | 1987-06-17 | AD\_PRES |  26400 |       NULL |        200 |            10 |

|         101 | Neena      | Kochhar   | NKOCHHAR         | 515.123.4568 | 1987-06-18 | AD\_VP   |  18700 |       NULL |        200 |            10 |

|         102 | Lex        | De Haan   | LDEHAAN          | 515.123.4569 | 1987-06-19 | AD\_VP   |  18700 |       NULL |        200 |            10 |

|         103 | Alexander  | Hunold    | AHUNOLD          | 590.423.4567 | 1987-06-20 | IT\_PROG |   9900 |       NULL |        103 |            60 |

|         104 | Bruce      | Ernst     | BERNST           | 590.423.4568 | 1987-06-21 | IT\_PROG |   6600 |       NULL |        103 |            60 |

|         105 | David      | Austin    | DAUSTIN          | 590.423.4569 | 1987-06-22 | IT\_PROG |   5280 |       NULL |        103 |            60 |

|         106 | Valli      | Pataballa | VPATABAL         | 590.423.4560 | 1987-06-23 | IT\_PROG |   5280 |       NULL |        103 |            60 |

|         107 | Diana      | Lorentz   | DLORENTZ         | 590.423.5567 | 1987-06-24 | IT\_PROG |   4620 |       NULL |        114 |            30 |

|         108 | Nancy      | Greenberg | NGREENBE         | 515.124.4569 | 1987-06-25 | SA\_MAN  |  13200 |       NULL |        145 |            80 |

|         109 | Daniel     | Faviet    | DFAVIET          | 515.124.4169 | 1987-06-26 | SA\_MAN  |   9900 |       NULL |        145 |            80 |

|         110 | Raju       | Nalbalwar | Raju@gmail.com   | 2345987609   | 2024-04-01 | IT\_PROG |  29700 |       NULL |        103 |            60 |

|         111 | Rutika     | Vaidya    | Rutika@gmail.com | 8723765423   | 2023-08-08 | SA\_MAN  |  25300 |       NULL |        145 |            80 |

|         112 | Akki       | Swami     | Akki@gmail.com   | 6725715728   | 2021-04-07 | IT\_PROG |  27500 |       NULL |        103 |            60 |

+-------------+------------+-----------+------------------+--------------+------------+---------+--------+------------+------------+---------------+

13 rows in set (0.00 sec)







5\. Write a SQL statement to change the email column of employees table with 'not

available' for those employees whose department\_id is 80 and gets a

commission is less than .20%





mysql> update employee

&nbsp;   ->  set email = 'not available'

&nbsp;   -> where  commission  < salary \* 0.20;

Query OK, 9 rows affected (0.03 sec)

Rows matched: 9  Changed: 9  Warnings: 0



mysql> select \* from employee;

+-------------+------------+-----------+----------------+--------------+------------+---------+--------+------------+------------+---------------+

| employee\_id | first\_name | last\_name | email          | phone\_number | hire\_date  | job\_id  | salary | commission | manager\_id | department\_id |

+-------------+------------+-----------+----------------+--------------+------------+---------+--------+------------+------------+---------------+

|         100 | Steven     | King      | not available  | 515.123.4567 | 1987-06-17 | AD\_PRES |  26400 |    2500.00 |        200 |            10 |

|         101 | Neena      | Kochhar   | not available  | 515.123.4568 | 1987-06-18 | AD\_VP   |  18700 |    2500.00 |        200 |            10 |

|         102 | Lex        | De Haan   | not available  | 515.123.4569 | 1987-06-19 | AD\_VP   |  18700 |     100.00 |        200 |            10 |

|         103 | Alexander  | Hunold    | not available  | 590.423.4567 | 1987-06-20 | IT\_PROG |   9900 |     100.00 |        103 |            60 |

|         104 | Bruce      | Ernst     | BERNST         | 590.423.4568 | 1987-06-21 | IT\_PROG |   6600 |    4500.00 |        103 |            60 |

|         105 | David      | Austin    | not available  | 590.423.4569 | 1987-06-22 | IT\_PROG |   5280 |     100.00 |        103 |            60 |

|         106 | Valli      | Pataballa | VPATABAL       | 590.423.4560 | 1987-06-23 | IT\_PROG |   5280 |    4500.00 |        103 |            60 |

|         107 | Diana      | Lorentz   | not available  | 590.423.5567 | 1987-06-24 | IT\_PROG |   4620 |     100.00 |        114 |            30 |

|         108 | Nancy      | Greenberg | not available  | 515.124.4569 | 1987-06-25 | SA\_MAN  |  13200 |     100.00 |        145 |            80 |

|         109 | Daniel     | Faviet    | DFAVIET        | 515.124.4169 | 1987-06-26 | SA\_MAN  |   9900 |    2500.00 |        145 |            80 |

|         110 | Raju       | Nalbalwar | not available  | 2345987609   | 2024-04-01 | IT\_PROG |  29700 |    4500.00 |        103 |            60 |

|         111 | Rutika     | Vaidya    | not available  | 8723765423   | 2023-08-08 | SA\_MAN  |  25300 |    2500.00 |        145 |            80 |

|         112 | Akki       | Swami     | Akki@gmail.com | 6725715728   | 2021-04-07 | IT\_PROG |  27500 |       NULL |        103 |            60 |

+-------------+------------+-----------+----------------+--------------+------------+---------+--------+------------+------------+---------------+

13 rows in set (0.00 sec)





6.Write a SQL statement to change the email column of employees table with 'not

available' for those employees who belongs to the 'Purchasing' department.



mysql> update employee

&nbsp;   ->  set email = 'NOT AVAIABLE'

&nbsp;   ->  where  department\_id = (SELECT department\_id FROM department where department\_name = 'Purchasing');

Query OK, 1 row affected (0.01 sec)

Rows matched: 1  Changed: 1  Warnings: 0



mysql> select \* from employee;

+-------------+------------+-----------+----------------+--------------+------------+---------+--------+------------+------------+---------------+

| employee\_id | first\_name | last\_name | email          | phone\_number | hire\_date  | job\_id  | salary | commission | manager\_id | department\_id |

+-------------+------------+-----------+----------------+--------------+------------+---------+--------+------------+------------+---------------+

|         100 | Steven     | King      | not available  | 515.123.4567 | 1987-06-17 | AD\_PRES |  26400 |    2500.00 |        200 |            10 |

|         101 | Neena      | Kochhar   | not available  | 515.123.4568 | 1987-06-18 | AD\_VP   |  18700 |    2500.00 |        200 |            10 |

|         102 | Lex        | De Haan   | not available  | 515.123.4569 | 1987-06-19 | AD\_VP   |  18700 |     100.00 |        200 |            10 |

|         103 | Alexander  | Hunold    | not available  | 590.423.4567 | 1987-06-20 | IT\_PROG |   9900 |     100.00 |        103 |            60 |

|         104 | Bruce      | Ernst     | not available  | 590.423.4568 | 1987-06-21 | IT\_PROG |   6600 |    4500.00 |        103 |            60 |

|         105 | David      | Austin    | not available  | 590.423.4569 | 1987-06-22 | IT\_PROG |   5280 |     100.00 |        103 |            60 |

|         106 | Valli      | Pataballa | DFAVIET        | 590.423.4560 | 1987-06-23 | IT\_PROG |   5280 |    4500.00 |        103 |            60 |

**|         107 | Diana      | Lorentz   | NOT AVAIABLE   | 590.423.5567 | 1987-06-24 | IT\_PROG |   4620 |     100.00 |        114 |            30 |**

|         108 | Nancy      | Greenberg | not available  | 515.124.4569 | 1987-06-25 | SA\_MAN  |  13200 |     100.00 |        145 |            80 |

|         109 | Daniel     | Faviet    | VPATABAL       | 515.124.4169 | 1987-06-26 | SA\_MAN  |   9900 |    2500.00 |        145 |            80 |

|         110 | Raju       | Nalbalwar | not available  | 2345987609   | 2024-04-01 | IT\_PROG |  29700 |    4500.00 |        103 |            60 |

|         111 | Rutika     | Vaidya    | not available  | 8723765423   | 2023-08-08 | SA\_MAN  |  25300 |    2500.00 |        145 |            80 |

|         112 | Akki       | Swami     | akii@gmail.com | 6725715728   | 2021-04-07 | IT\_PROG |  27500 |       NULL |        103 |            60 |

+-------------+------------+-----------+----------------+--------------+------------+---------+--------+------------+------------+---------------+

13 rows in set (0.00 sec)





7\. Write a SQL statement to change the email and commission\_pct column of

employees table with 'not available' and 0.10 for all employees.



mysql> UPDATE employee

&nbsp;   -> SET email = 'NOT AVAILABLE',

&nbsp;   ->     commission = commission + (salary \* 0.10);

Query OK, 13 rows affected (0.04 sec)

Rows matched: 13  Changed: 13  Warnings: 0



mysql> select \* from employee;

+-------------+------------+-----------+---------------+--------------+------------+---------+--------+------------+------------+---------------+

| employee\_id | first\_name | last\_name | email         | phone\_number | hire\_date  | job\_id  | salary | commission | manager\_id | department\_id |

+-------------+------------+-----------+---------------+--------------+------------+---------+--------+------------+------------+---------------+

|         100 | Steven     | King      | NOT AVAILABLE | 515.123.4567 | 1987-06-17 | AD\_PRES |  26400 |    5140.00 |        200 |            10 |

|         101 | Neena      | Kochhar   | NOT AVAILABLE | 515.123.4568 | 1987-06-18 | AD\_VP   |  18700 |    4370.00 |        200 |            10 |

|         102 | Lex        | De Haan   | NOT AVAILABLE | 515.123.4569 | 1987-06-19 | AD\_VP   |  18700 |    1970.00 |        200 |            10 |

|         103 | Alexander  | Hunold    | NOT AVAILABLE | 590.423.4567 | 1987-06-20 | IT\_PROG |   9900 |    1090.00 |        103 |            60 |

|         104 | Bruce      | Ernst     | NOT AVAILABLE | 590.423.4568 | 1987-06-21 | IT\_PROG |   6600 |    5160.00 |        103 |            60 |

|         105 | David      | Austin    | NOT AVAILABLE | 590.423.4569 | 1987-06-22 | IT\_PROG |   5280 |     628.00 |        103 |            60 |

|         106 | Valli      | Pataballa | NOT AVAILABLE | 590.423.4560 | 1987-06-23 | IT\_PROG |   5280 |    5028.00 |        103 |            60 |

|         107 | Diana      | Lorentz   | NOT AVAILABLE | 590.423.5567 | 1987-06-24 | IT\_PROG |   4620 |     562.00 |        114 |            30 |

|         108 | Nancy      | Greenberg | NOT AVAILABLE | 515.124.4569 | 1987-06-25 | SA\_MAN  |  13200 |    1420.00 |        145 |            80 |

|         109 | Daniel     | Faviet    | NOT AVAILABLE | 515.124.4169 | 1987-06-26 | SA\_MAN  |   9900 |    3490.00 |        145 |            80 |

|         110 | Raju       | Nalbalwar | NOT AVAILABLE | 2345987609   | 2024-04-01 | IT\_PROG |  29700 |    7470.00 |        103 |            60 |

|         111 | Rutika     | Vaidya    | NOT AVAILABLE | 8723765423   | 2023-08-08 | SA\_MAN  |  25300 |    5030.00 |        145 |            80 |

|         112 | Akki       | Swami     | NOT AVAILABLE | 6725715728   | 2021-04-07 | IT\_PROG |  27500 |       NULL |        103 |            60 |

+-------------+------------+-----------+---------------+--------------+------------+---------+--------+------------+------------+---------------+

13 rows in set (0.00 sec)



