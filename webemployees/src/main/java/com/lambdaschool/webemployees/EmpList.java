package com.lambdaschool.webemployees;

import java.util.ArrayList;

public class EmpList
{
    public ArrayList<Employee> empList = new ArrayList<Employee>();

    public EmpList()
    {
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("May", "Ford", 80000, true, 1, 1));
        empList.add(new Employee("John", "Jones ", 75000, true, 1, 1));
    }

    public Employee findEmployee(CheckEmployee tester)
    {
        for (Employee e : empList)
        {
            if (tester.test(e))
            {
                return e;
            }
        }
        return null;
    }
}
