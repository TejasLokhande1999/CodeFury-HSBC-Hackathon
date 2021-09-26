# CodeFury-Runtime_tError
Team Runtime tError's Git repository for HSBC CodeFury 2021
# Prerequisites

=> [Jdk 1.8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
=> [Apache Tomcat v9.0](https://tomcat.apache.org/download-90.cgi)
=>  [Spring tool Suite](https://spring.io/tools/)  
=>  MySql 


# How to import this project into your System:
	
1. Clone project from git.

2. Import in Spring Tool Suite as an existing Dynamic web project.

3. Create tables on your system with the queries given in Createtables.sql file in SQL Queries table.
	Runtime_tError\application\AMRApp\WebContent\sqlQueries\CreateTables.sql

4.Update sql connection details under application\AMRApp\src\com\AMRApp\utility\ConnectionManager.java

5. Run application on Tomcat Server
