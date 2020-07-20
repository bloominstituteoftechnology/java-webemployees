package com.lambdaschool.webemployee.controllers;

import com.lambdaschool.webemployee.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "helperFunctions")
public class HelperFunctionsImpl implements HelperFunctions
{
    @Override
    public List<Employee> findEmployees (List<Employee> myList, CheckEmployee tester)
    {
        List<Employee> tempList = new ArrayList<>();

        for (Employee e : myList)
        {
            if (tester.test(e))
            {
                tempList.add(e);
            }
        }

        return tempList;
    }

}
