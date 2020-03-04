package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * The entry point for clients to access employee data.
 */
@RestController
@RequestMapping("/data")
public class EmployeeController
{


    /**
     * Returns a list of all employees
     * <br>Example: <a href="http://localhost:8080/data/allemployees">http://localhost:8080/data/allemployees</a>
     *
     * @return JSON list of all employees order alphabetically by first name with a status of OK.
     */
    @GetMapping(value = "/allemployees",
                produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees()
    {
        WebemployeesApplication.ourEmpList.empList.sort((e1, e2) -> e1.getFname().compareToIgnoreCase(e2.getFname()));
        return new ResponseEntity<>(WebemployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }


    /**
     * Returns the information for a given employee
     * <br>Example: <a href="http://localhost:8080/data/employee/2">http://localhost:8080/data/employee/2</a>
     *
     * @param id The employee's id whose information you are seeking
     * @return JSON object of the employee you seek with a status of OK
     */
    @GetMapping(value = "/employee/{id}",
                produces = {"application/json"})
    public ResponseEntity<?> getEmpDetail(
            @PathVariable
                    long id)
    {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }

    /**
     * Returns a list of employees whose first name starts with the given letter
     * <br>Example: <a href="http://localhost:8080/data/employees/s">http://localhost:8080/data/employees/s</a>
     *
     * @param letter The first letter of the first name of the employees you seek. Case insensitive.
     * @return JSON list of the employees you seek with a status of OK
     */
    @GetMapping(value = "/employees/{letter}",
                produces = {"application/json"})
    public ResponseEntity<?> getEmployees(
            @PathVariable
                    char letter)
    {
        ArrayList<Employee> rtnEmps = WebemployeesApplication.ourEmpList.
                findEmployees(e -> e.getFname().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        return new ResponseEntity<>(rtnEmps, HttpStatus.OK);
    }

    /**
     * Returns a list of employees whose first name starts with the given letter sorted by salary from smallest to largest
     * <br>Example: <a href="http://localhost:8080/data/sortedemployees/s">http://localhost:8080/data/sortedemployees/s</a>
     *
     * @param letter The first letter of the first name of the employees you seek. Case insensitive.
     * @return JSON list of the employees you seek sorted by salary from smallest to largest with a status of OK
     */
    // localhost:8080/data/employees/s
    @GetMapping(value = "/sortedemployees/{letter}",
                produces = {"application/json"})
    public ResponseEntity<?> getSortedEmployees(
            @PathVariable
                    char letter)
    {
        ArrayList<Employee> rtnEmps = WebemployeesApplication.ourEmpList.
                findEmployees(e -> e.getFname().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        rtnEmps.sort((e1, e2) -> ((int) (e1.getSalary() - e2.getSalary())));
        return new ResponseEntity<>(rtnEmps, HttpStatus.OK);
    }
}
