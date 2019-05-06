package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class EmployeeController
{
    //localhost:8080/data/allemployees
    @RequestMapping(value = "/allemployees",
                    produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees()
    {
        WebemployeesApplication.ourEmpList.empList.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        return new ResponseEntity<>(WebemployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }


    // the web way
    // localhost:8080/data/employee?id=2
    @RequestMapping(value = "/employee",
                    method = RequestMethod.GET,
                    produces = {"application/json"})
    public ResponseEntity<?> getEmployeeDetail(
            @RequestParam("id")
                    long id)
    {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }


    // the restful way
    // localhost:8080/data/employee/2
    @GetMapping(value = "/employee/{id}",
                produces = {"application/json"})
    public ResponseEntity<?> getEmpDetail(
            @PathVariable
                    long id)
    {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }

    // localhost:8080/data/employees/s
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


}
