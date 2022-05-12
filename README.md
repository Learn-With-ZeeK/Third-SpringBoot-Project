# Third-SpringBoot-Project
Our third Java SpringBoot project thymeleaf-springboot-tutorial using Spring Web and Thymeleaf  dependencies 

Explaining Each component of project structure



src/main/java

This is the main method to launch project.
Java source code for the artifact.
The main folder contains your application code and resources.

-------------------------

src/main/resources

Resources used in the project.
Static resources like css,js,images inside static folder  
jsp or html files under templates folder
Configuring all application level configuration in application.properties


In this project we are using  main.css file inside css folder inside static folder
        { static ---->   css  ----->  main.css  }

In this project we are using  action.js file inside js folder inside static folder
       {  static ---->   js  ----->    action.js }  

In this project we are using  html files inside template folder


      {  template ---->      add-bootstrap.html   }  
       { template ---->     add-css-js-demo.html }
        { template ---->       helloworld.html  }        
          {template ---->       itteration.html}            

-------------------------

pom.xml

 It is an XML file that contains information about the project and configuration details used by Maven to build the project.

-------------------------------------------------

JRE System Library

Basically the  library of project(managed by IDE)

-------------------------

src/test/java

 The test folder contains  test code and resources.
 Places your test use case code, like junit test.
 These codes would be executed when doing maven package things. These codes won't be packaged to your war or jar file.

-------------------------

src  

The src directory contains all of the source material for building the project, its site and so on. 
It contains a subdirectory for each type: main for the main build artifact, test for the unit test code and resources, site and so on.

-------------------------

 target 

 The target directory is used to house all output of the build.

-------------------------

mvnw 

The mvnw file is for Linux (bash) environment


-------------------------

mvnw.cmd

   The mvnw.cmd is for the Windows environment.
