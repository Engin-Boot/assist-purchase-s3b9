# Assist a Purchase API


The purchase system is used to select Philips monitoring products for patients.
It serves both the customer as well as Philips personnel.

## Index
1. [Prerequisites](#Prerequisites)
2. [Compiling](#Compiling)
3. [Executing](#Executing)
4. [APIs Created](#ApiCreated)
5. [Goal Set and Achieved](#Goalset)


## Prerequisites
Firstly, the project makes use of Spring Boot in order to build the source files and hence, the target system must have a Spring tool suite (recommmended: Spring 3.0) .
Then, the target system must have Java (>=8) installed and available in the system path. We have used Java version 11
The project makes use of Gradle as the build tool and hence, Gradle must also be in the system path.
We have used in memory Json file for Database, hence no database is required to be installed in the system.

## Execution
Once the main spring application (com.example.Monitor) has been run,Tomcat apache server would set up.

## APIs Created
Http Method----------------|-------API------------|-----------Function of the API---------------------------------------|

GET -----------------------|---"/products/all"----|---------Displays all the products present in the repository---------|

GET -----------------------|---"/products/{pid}"---|-------Displays the details of the product whose product id(pid) is mentioned as pathvariable---|

GET -----------------------|----"/products?touchscreen={touchscreen}&size={size}&category={category}&transportMonitor={transportMonitor}"---|----This API returns the products according to user specifications---|

POST-----------------------|------"/products/add"------|-----This API adds a product into the repository according to Philips personnel use----|

PUT------------------------|-----"/products/update/{pid}-----|-----This API is used to update any details of a particular product in the repository----|

DELETE----------------------|------"/products/delete/{pid}-----|-------This API is used to delete the product whose pid is mentioned in the API from the repository---|






