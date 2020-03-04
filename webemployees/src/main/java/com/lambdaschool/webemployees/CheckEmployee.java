package com.lambdaschool.webemployees;

/**
 * Used to check if an employee objects matches a certain criteria.
 * Used for filtering employees from a list.
 */
public interface CheckEmployee
{
    /**
     * Returns true or false based on the implementation of the method
     *
     * @param e The employee object on which the method is to operate
     * @return true or false based on the implementation of the method
     */
    boolean test(Employee e);
}
