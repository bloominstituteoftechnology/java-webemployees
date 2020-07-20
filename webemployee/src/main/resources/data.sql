DELETE
FROM employees;

INSERT INTO employees(empid, fname, lname, salary)
     VALUES (1, 'Steve', 'Green', 45000),
            (2, 'Sam', 'Ford', 80000),
            (3, 'May', 'Jones', 75000);

/*
We must tell hibernate the ids that have already been used.
The number must be larger than the last used id.
5 > 3 so we are good!
 */

alter sequence hibernate_sequence restart with 5;

