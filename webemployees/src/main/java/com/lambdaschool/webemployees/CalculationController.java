package com.lambdaschool.webemployees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// localhost:8080/calc/salary?id=1&raise=0.5
@RestController
@RequestMapping("/calc")
public class CalculationController
{
    @RequestMapping("/salary")
    public Employee checkRaise(@RequestParam(value = "id") long id,
                               @RequestParam(value = "raise") double raise)
    {
        Employee tempEmp = new Employee(WebemployeesApplication.ourEmpList.findEmployee(e-> (e.getId() == id)));
        tempEmp.setSalary(tempEmp.getSalary() * (1.0 + raise));
        return tempEmp;
    }
}
