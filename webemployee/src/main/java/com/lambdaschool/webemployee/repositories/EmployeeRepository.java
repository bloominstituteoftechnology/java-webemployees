package com.lambdaschool.webemployee.repositories;

import com.lambdaschool.webemployee.models.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Connects the Employee table to the rest of the application
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{
}
