package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class EmployeeController
{

    // localhost:8080/data/employee?id=2
    @RequestMapping(value = "/employee", method = RequestMethod.GET, produces={"application/json"})
    public ResponseEntity<?> getEmployeeDetail(@RequestParam("id") long id)
    {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e-> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }

    // localhost:8080/data/employee?id=2
    @GetMapping(value = "/employee", produces={"application/json"})
    public ResponseEntity<?> getEmployeeDetail2(@RequestParam("id") long id)
    {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e-> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }


    // localhost:8080/data/employee/2
    @GetMapping(value = "/employee/{id}", produces = {"application/json"})
    public ResponseEntity<?> getEmpDetail(@PathVariable long id)
    {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e-> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }


    //localhost:8080/data/allemployees
    @RequestMapping(value = "/allemployees", produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees()
    {
        WebemployeesApplication.ourEmpList.empList.sort((e1, e2) ->
                e1.getName().compareToIgnoreCase(e2.getName()));
        return new ResponseEntity<>(WebemployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }
}
