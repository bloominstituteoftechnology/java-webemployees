#### Entry Ticket

Please take a moment to reflect on what you have previously learned and hope to learn by completing this Google Survey. Remember your responses will be read by your instructor to help guide future lessons.

* [Guided Project Entry Ticket](https://forms.gle/KSJYvG1LYd9k4EHv5)

#### Daily Resources

* No Guided Project Starter - built from scratch
* [Slido](https://app.sli.do/event/XXXXXXXX)
* [Zoom like](https://lambdaschool.zoom.us/j/#########)

#### Slack Message

@channel
Let's do this! The Java Class will be starting in 3 minutes at (https://lambdaschool.zoom.us/j/#########)
Please post questions to the Slido link at (https://app.sli.do/event/XXXXXXXX)

### Introduction and Hook

Great, we have been studying Java but how does this apply to REST API backend systems. We have a framework for that. Actually we have a couple of frameworks for that.

These frameworks take care of the foundations, the plumbing, of the web letting us concentrate on our Java code and what makes our systems unique. For example, all API systems need a way to interact with a web browser, format data, connect to a database, among many, many other tasks. The frameworks handle those tasks allowing us to concentrate on which database they connect to how we want that data manipulated and made available to others.

### Purpose

Develop a REST API application using Java Spring.

### Learning Activities

* Inside of IntelliJ, run the final version of the application.
* Inside of Postman, Surf to each endpoint and show the output.
  * [Predicted Output](https://github.com/BloomInstituteOfTechnology/java-webemployees)
  * http://localhost:2019/data/allemployees
  * http://localhost:2019/data/employee/2
  * http://localhost:2019/data/employees/s
  * http://localhost:2019/data/sortedemployees/s
  * http://localhost:2019/calc/salary/1/0.05
* Close the application in IntelliJ.
* Create a new application in IntelliJ.

#### Working with Objective: Use IntelliJ in the following areas: application creation, code entry, and code execution

![Click on Create a Project](https://lambdaschool.github.io/java-curriculum-assets/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%204%20-%20JX%20Java%20-%20Intro%20to%20Maven%2C%20Spring%2C%20and%20Tomcat%20Using%20REST%20API/assets/JX-10-M4-01.png)

* Follow the wizard to create the application.
  * Create a project with the Spring Framework explaining what the Spring Framework is
    * Note if the students do not Spring Initializr as an option, most likely they are not running the Ultimate Edition
  * Make sure that the correct JDK, called Project SDK here, is selected
    * May have to show how to create a new SDK

![Select Spring Framework](https://lambdaschool.github.io/java-curriculum-assets/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%204%20-%20JX%20Java%20-%20Intro%20to%20Maven%2C%20Spring%2C%20and%20Tomcat%20Using%20REST%20API/assets/JX-10-M4-02.png)

  * Name the project, picking the correct version of the JDK

![Select Name with Version 11](https://lambdaschool.github.io/java-curriculum-assets/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%204%20-%20JX%20Java%20-%20Intro%20to%20Maven%2C%20Spring%2C%20and%20Tomcat%20Using%20REST%20API/assets/JX-10-M4-03.png)

  * Add the appropriate dependencies: Spring Boot DevTools, Spring Web

![Add dependencies](https://lambdaschool.github.io/java-curriculum-assets/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%204%20-%20JX%20Java%20-%20Intro%20to%20Maven%2C%20Spring%2C%20and%20Tomcat%20Using%20REST%20API/assets/JX-10-M4-04.gif)

  * Name the project file
  * Note: jxwork is the folder where all guided project is stored for this cohort.

![Name the project file](https://lambdaschool.github.io/java-curriculum-assets/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%204%20-%20JX%20Java%20-%20Intro%20to%20Maven%2C%20Spring%2C%20and%20Tomcat%20Using%20REST%20API/assets/JX-10-M4-05.png)

* If a popup appears asking, select to make this a Maven Project.

* If a popup appears asking, select to autoimport Maven dependencies.

* Add the line for the port to the `application.properties`. Add the comments as well.

* [Check for Understanding CFU - Google Form](https://forms.gle/hFYvVALpxzJK5JCe9)

#### Working with Objective: Explain the uses of and differences between Maven, Spring, and Tomcat

* Look at the POM.XML file

* [Check for Understanding CFU - Google Form](https://forms.gle/8GrvaUrEQqjXAc536)

#### Working with Objective: Build a REST service using Spring Boot

* Under the package webemployees
  * Explore the WebemployeesApplication class
    * Just the Spring Boot Annotation. The EmpList code will be added later

  * Create the Employee class to hold an employee's data
    * Point out AtomicLong
      * Class variable
      * Handles concurrency
    * After creating the fields, generate the getters and setters
      * Remove the setter for id as it is autogenerated
      * Add the method to create name
    * Generate the constructor with all the fields except id
      * Add code to make id
    * Copy the generated constructor.
      * Modify it to make the cloning Constructor

  * Create the EmpList class to hold our list of employees
    * In the process create the interface CheckEmployee

  * Add the EmpList files to the WebemployeesApplication class

  * Create the EmployeeController
    * Add just the first endpoint!

* [Check for Understanding CFU - Google Form](https://forms.gle/cRPRmVh32K4cdAoH6)

#### Use Postman to manually test Web APIs

* [Check for Understanding CFU - Google Form](https://forms.gle/rRbxueD5UXnNijk19)

#### Working with Objective: Use and implement inversion of control and dependency injection with Spring

* Inside the EmployeeController
  * Create the rest of the endpoints
  * Stress `@PathVariable` as this is the main place they learn this!!!

* [Check for Understanding CFU - Google Form](https://forms.gle/YiYxf7NRc4ejqKTa6)

#### Working with Objective: Implement Beans throughout the Beans’ lifecycle controlling the Beans using annotations

* Create the CalculationController
  * You do not need to create the "wrong" line. Just explain how we need a true copy of the employee object and not just a pointer to the object. Time permitting, show this issue!
    * Note to show the issue, also sout the pointers to the console. This is helpful

* [Check for Understanding CFU - Google Form](https://forms.gle/tQKACgHEjJj317PV7)

#### Objectives If Time Allows

##### Working with Objective: Download, commit and branch source control repositories

* [Check for Understanding CFU - Google Form](https://forms.gle/KyJhwrQmYmA5UzP8A)

##### Working with Objective: Produce a complete application following the Maven Phases

* [Check for Understanding CFU - Google Form](https://forms.gle/E26DXT3H93EDa9dR9)

#### Conclusion

##### Review what we just learned

* How to create a Java Spring Application.
* How to use annotations to create REST API components.
* Specifically how to create read endpoints for a REST API.

##### How is this related to tomorrow's topic

* Next topic will be Databases. Thus we have learned about REST APIs in Java and then Databases
* The topic following Databases, we put the two together to create a full CRUD REST API application!

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/AzE3M9w13GnXceNLA)
