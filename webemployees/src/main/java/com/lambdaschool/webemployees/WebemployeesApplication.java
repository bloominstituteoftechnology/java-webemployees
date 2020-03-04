package com.lambdaschool.webemployees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the application.
 */
@SpringBootApplication
public class WebemployeesApplication
{

    /**
     * EmpList is the class that will hold our data. In our case it serving as our "database".
     */
    static EmpList ourEmpList;

    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        ourEmpList = new EmpList();
        SpringApplication.run(WebemployeesApplication.class, args);
    }

}

