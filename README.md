# API-Automation-Framework
API Automation framework using Rest Assured

API documentation link: http://64.227.160.186:8080/swagger-ui/index.html

Application link: https://swift.techwithjatin.com/login

**Project Setup**
-----------------------------
Create a Maven Based Project
and Add the dependency in your pom.xml
<!-- pom.xml --><dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.3.0</version>
    </dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng --><dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
</dependency>

</dependencies>



**Project Structure for the API Automation Framework**
-------------------------------------------------------
This is will be project Structure for our API Automation Framework
```
├── main/java/com/api
│   ├── config
│   ├── services
│   └── utils
└── test/java/com/api
    └── tests
```

**Code Structure**
```
com.api
├── services
│   ├── BaseService.java
│   └── AuthService.java
├── models
│   ├── request
│   │   └── LoginRequest.java
│   └── response
│       └── LoginResponse.java
└── tests
    └── AuthTest.java
```


## Design Pattern:

Service Objects are a design pattern commonly used in software development, particularly in web applications, to encapsulate business logic and keep it separate from other layers of the application.

Key Benefits:

1. Business logic is separate from model classes(POJO)
2. Reusability 
3. Testability
4. Maintainability

**NOTE: Model Classes are classes that represent the core data structure or entities in your application**

In the API Automation Framework the Request and response payload will be have their respective model classes.


