package com.lambdaschool.webemployee.controllers;

import com.lambdaschool.webemployee.models.Employee;

import java.util.List;

/**
 * Interface for HelperFunctions that can be used through the application
 */
public interface HelperFunctions
{
    /**
     * Given a Lambda Expression with the criteria for which we wish to filter our list, return the objects
     * in our list matching that criteria.
     *
     * @param myList the original list to be filtered
     * @param tester a Lambda Expression giving the criteria for which objects we seek
     * @return the filtered list!
     */
    List<Employee> findEmployees (List<Employee> myList, CheckEmployee tester);
}
