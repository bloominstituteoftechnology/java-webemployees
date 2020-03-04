package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The entry point for clients to access calculations that could be on the data.
 */
@RestController
@RequestMapping("/calc")
public class CalculationController
{
    /**
     * Takes the current salary of the employee and returns the salary amount if the given raise was applied.
     * This does NOT affect the actual salary, just returns a calculate of what the new salary would be with the raise applied
     * <br>Example <a href="http://localhost:8080/calc/salary/1/0.05">http://localhost:8080/calc/salary/1/0.05</a>
     *
     * @param id The id of the employee to whom you are wanting to estimate the raise amount.
     * @param raise A double that represents the amount of raise you are thinking of giving the employee.
     *              The percent is in its decimal form so 5% is 0.05.
     * @return the full employee object including the salary plus raise
     */
    @RequestMapping(value = "/salary/{id}/{raise}",
                    produces = {"application/json"})
    public ResponseEntity<?> checkRaise(
            @PathVariable
                    long id,
            @PathVariable
                    double raise)
    {
        System.out.println("Pointer to original employee object: " + WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id)));

        /**
         * the following line is wrong. This returns a pointer to the actual object.
         * This would actually change the salary! We need to work with a copy instead!
         *
         * Employee tempEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
         */



        /**
         * The following line is correct
         *
         * We first make a full copy of the object, not just the pointer!, and then do our calculations on that copy!
         *
         */
        Employee tempEmp = new Employee(WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id)));

        System.out.println("Pointer to copy of employee object:  " + tempEmp);

        tempEmp.setSalary(tempEmp.getSalary() * (1.0 + raise));
        return new ResponseEntity<>(tempEmp, HttpStatus.OK);
    }
}
