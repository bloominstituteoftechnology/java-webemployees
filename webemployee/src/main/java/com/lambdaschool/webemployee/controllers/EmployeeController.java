package com.lambdaschool.webemployee.controllers;

import com.lambdaschool.webemployee.models.Employee;
import com.lambdaschool.webemployee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * The entry point for clients to access employee data.
 */
@RestController
public class EmployeeController
{
    /**
     * Connects this controller to the Employee Repository
     */
    @Autowired
    EmployeeRepository emprepos;

    /**
     * Connects this controller to helper functions
     */
    @Autowired
    HelperFunctions helperFunctions;

    /**
     * Returns a list of all employees
     * <br>Example: <a href="http://localhost:2019/employees/all">http://localhost:2019/employees.all</a>
     *
     * @return JSON list of all employees order alphabetically by last name with a status of OK.
     */
    @GetMapping(value = "/employees/all",
    produces = {"application/json"})
    public ResponseEntity<?> listAllEmployees()
    {
        List<Employee> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);

        myList.sort((e1, e2) -> e1.getLname().compareToIgnoreCase(e2.getLname()));
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    /**
     * Returns a list of employees whose first name starts with the given letter
     * <br>Example: <a href="http://localhost:2019/employees/name/s">http://localhost:2019/employees/name/s</a>
     *
     * @param letter The first letter of the first name of the employees you seek. Case Sensitive.
     * @return JSON list of the employees you seek with a status of OK
     */
    @GetMapping(value = "/employees/name/{letter}",
    produces = "application/json")
    public ResponseEntity<?> listAllByFirstName(@PathVariable char letter)
    {
        List<Employee> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);
        List<Employee> rtnList = helperFunctions.findEmployees(myList, e-> e.getFname().charAt(0) == letter);

        // print to the console
        for (Employee e : rtnList)
        {
            System.out.println(e);
        }

        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    /**
     * Prints to the console the total of all employees' salaries.
     * <br>Example: <a href="http://localhost:2019/employees/total">http://localhost:2019/employees/total</a>
     *
     * @return Status of OK
     */
    @GetMapping(value = "/employees/total",
    produces = {"application/json"})
    public ResponseEntity<?> totalSalary()
    {
        List<Employee> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);

        double total = 0;
        for (Employee e : myList)
        {
            total = total + e.getSalary();
        }

        System.out.println("Total Salary " + total);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    // http://localhost:2019/employees/raise/{raise:.+}

    /**
     * Estimates how much each employee's salary would be if all were given the raise sent in the parameter
     * <br>Example: <a href="http://localhost:2019/employees/raise/0.05">http://localhost:2019/employees/raise/0.05</a>
     *
     * @param raise the percentage amount of raise to estimate. Will be a real number.
     *              Special code must in place for a route to work with a real number.
     *              The parameter must be able to read in a decimal. By default it cannot.
     *              So :.+ is added to the end of the parameter in the GetMapping annotation!
     *
     * @return A JSON list of all employees with their estimate salaries based on the given raise percentage.
     */
    @GetMapping(value = "/employees/raise/{raise:.+}",
            produces = {"application/json"})
    public ResponseEntity<?> estimateRaise(@PathVariable double raise)
    {
        List<Employee> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);

        for (Employee e : myList)
        {
            e.setSalary(e.getSalary() + (e.getSalary() * raise));
        }

        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
