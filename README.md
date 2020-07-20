# Java Web Employees

## Introduction

The purpose of this application is to show how to use Maven, Spring, and Tomcat together to produce a functioning Rest API Backend system. This system makes use of an H2 database.

## Data Layout

The ArrayList contains Employee objects.

Fields of the employee objects include

* Employee id
* Employee first name
* Employee last name
* Employee Salary

No relationships exist between employee and other objects.

Using the provided seed data, the given endpoint will produce the stated output. Expand each endpoint to see its correct output.

<details>
<summary>http://localhost:2019/employees/all</summary>

```JSON
[
    {
        "empid": 2,
        "fname": "Sam",
        "lname": "Ford",
        "salary": 80000.0
    },
    {
        "empid": 1,
        "fname": "Steve",
        "lname": "Green",
        "salary": 45000.0
    },
    {
        "empid": 3,
        "fname": "May",
        "lname": "Jones",
        "salary": 75000.0
    }
]
```

</details>

<details>
<summary>http://localhost:2019/employees/name/S</summary>

In the Console:

```TEXT
Employee{empid=1, fname='Steve', lname='Green', salary=45000.0}
Employee{empid=2, fname='Sam', lname='Ford', salary=80000.0}
```

In Postman

```JSON
[
    {
        "empid": 1,
        "fname": "Steve",
        "lname": "Green",
        "salary": 45000.0
    },
    {
        "empid": 2,
        "fname": "Sam",
        "lname": "Ford",
        "salary": 80000.0
    }
]
```

</details>

<details>
<summary>http://localhost:2019/employees/total</summary>

In the Console:

```TEXT
Total Salary 200000.0
```

In Postman

```JSON
Status OK
```

</details>

<details>
<summary>http://localhost:2019/employees/raise/0.05</summary>

```JSON
[
    {
        "empid": 1,
        "fname": "Steve",
        "lname": "Green",
        "salary": 47250.0
    },
    {
        "empid": 2,
        "fname": "Sam",
        "lname": "Ford",
        "salary": 84000.0
    },
    {
        "empid": 3,
        "fname": "May",
        "lname": "Jones",
        "salary": 78750.0
    }
]
```

</details>
