# Java Web Employees

A student that completes this project shows that they can:

* Use IntelliJ in the following areas: application creation, code entry, and code execution
* Explain the uses of and differences between Maven, Spring, and Tomcat
* Build a REST service using Spring Boot
* Use and implement inversion of control and dependency injection with Spring
* Implement Beans throughout the Beans’ lifecycle controlling the Beans using annotations
* Produce a complete application following the Maven Phases

## Introduction

The purpose of this application is to show how to use Maven, Spring, and Tomcat together to produce a functioning Rest API Backend system. This system does NOT make use of a database, in favor of storing all of its data in an arraylist. The application initializes this arraylist and provides a few endpoints in order to read the data from that list.

## Data Layout

The arraylist contains Employee objects.

Fields of the employee objects include

* Employee id
* Employee first name
* Employee last name
* Employee Salary
* A flag saying whether or not the employee has a 401K Plan
* Id number of the employee's company
* Id number of the employee's health plan

No relationships exist between employee and other objects.

This application works with employee data that is stored inside an arraylist.

Using the provided seed data, the given endpoint will produce the stated output. Expand each endpoint to see its correct output.

<details>
<summary>http://localhost:2019/data/allemployees</summary>

```JSON
[
    {
        "id": 3,
        "fname": "John",
        "lname": "Jones ",
        "salary": 75000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "John Jones "
    },
    {
        "id": 2,
        "fname": "Sam",
        "lname": "Ford",
        "salary": 80000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "Sam Ford"
    },
    {
        "id": 1,
        "fname": "Steve",
        "lname": "Green",
        "salary": 45000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "Steve Green"
    }
]
```

</details>

<details>
<summary>http://localhost:2019/data/employee/2</summary>

```JSON
{
    "id": 2,
    "fname": "Sam",
    "lname": "Ford",
    "salary": 80000.0,
    "has401k": true,
    "companyID": 1,
    "healthPlanID": 1,
    "name": "Sam Ford"
}
```

</details>

<details>
<summary>http://localhost:2019/data/employees/s</summary>

```JSON
[
    {
        "id": 2,
        "fname": "Sam",
        "lname": "Ford",
        "salary": 80000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "Sam Ford"
    },
    {
        "id": 1,
        "fname": "Steve",
        "lname": "Green",
        "salary": 45000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "Steve Green"
    }
]
```

</details>

<details>
<summary>http://localhost:2019/data/sortedemployees/s</summary>

```JSON
[
    {
        "id": 1,
        "fname": "Steve",
        "lname": "Green",
        "salary": 45000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "Steve Green"
    },
    {
        "id": 2,
        "fname": "Sam",
        "lname": "Ford",
        "salary": 80000.0,
        "has401k": true,
        "companyID": 1,
        "healthPlanID": 1,
        "name": "Sam Ford"
    }
]
```

</details>

<details>
<summary>http://localhost:2019/calc/salary/1/0.05</summary>

```JSON
{
    "id": 1,
    "fname": "Steve",
    "lname": "Green",
    "salary": 47250.0,
    "has401k": true,
    "companyID": 1,
    "healthPlanID": 1,
    "name": "Steve Green"
}
```

</details>
