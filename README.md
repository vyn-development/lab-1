# Lab 1

## 1. What is the differece between `Spring Framework` and `Spring Boot`?

> `Spring Framework` helps to create a loosely coupled application. `Spring Boot` helps to create a stand-alone application. In the `Spring Framework` to test the `Spring` project, we need to set up the servers explicitly. `Spring Boot` offers built-in or embedded servers such as `Tomcat` and `jetty`. [[Link]](https://www.interviewbit.com/blog/spring-vs-spring-boot/)

## 2. Why do we need `pom.xml`?

> It is an XML file that contains information about the project and configuration details used by `Maven` to build the project. [[Link]](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)

## 3. Why do we need `@SpringBootApplication` annotation? What will happen if we remove it?

>We use this annotation to mark the main class of a Spring Boot application, to enable a host of features, e.g. Java-based Spring configuration, component scanning, and in particular for enabling Spring Boot's auto-configuration feature. 
> If we remove this annotation, then the Spring Boot auto-configuration mechanism will not turn on and scanning @Component for the package in which the application is located and will not be able to register additional beans in the context or import additional configuration classes

## 4. What is the purpose of the interface `CommandLineRunner`?

> Interface used to indicate that a bean should _run_ when it is contained within a `Spring` application. Multiple `CommandLineRunner` beans can be defined within the same application context and can be ordered using the `Ordered` interface or `@Order` annotation. [JAVADOC of `Spring`]

## 5. What is the difference between the interface `CommandLineRunner` and `ApplicationRunner`?

The difference between these two interfaces is in their `run` method arguments type:

```java
public interface CommandLineRunner {
  void run(String... args) throws Exception;
}
```

vs

```java
public interface ApplicationRunner {
  void run(ApplicationArguments args) throws Exception;
}
```

So that, these interfaces must be used in different situations depends on your need in getting values.
