package com.lambdaschool.webemployees;

import java.util.ArrayList;

/**
 * This class serves as our data storage object. It contains the data in an arraylist and methods that operate on that data.
 */
public class EmpList
{
    /**
     * The arraylist that contains our data
     */
    public ArrayList<Employee> empList = new ArrayList<Employee>();

    /**
     * The constructor for this class that seeds our list of employees. In other words, this adds employee objects
     * to our list so we have some data on which to operate.
     */
    public EmpList()
    {
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("Sam", "Ford", 80000, true, 1, 1));
        empList.add(new Employee("John", "Jones ", 75000, true, 1, 1));
    }

    /**
     * Given a Lambda Expression with the criteria for which we wish to filter our list, return the first object
     * in our list matching that criteria.
     *
     * @param tester a Lambda Expression giving the criteria for which object we seek
     * @return The first object in our list that matches the given criteria. Return NULL if no object matches our criteria
     */
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

    /**
     * Given a Lambda Expression with the criteria for which we wish to filter our list, return the objects
     * in our list matching that criteria.
     *
     * @param tester a Lambda Expression giving the criteria for which object we seek
     * @return The objects in our list that matches the given criteria. Return an empty list if no object matches our criteria
     */
    public ArrayList<Employee> findEmployees(CheckEmployee tester)
    {
        ArrayList<Employee> tempEmpList = new ArrayList<>();

        for (Employee e: empList)
        {
            if (tester.test(e))
            {
                tempEmpList.add(e);
            }
        }

        return tempEmpList;
    }
}
