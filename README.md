# Lab 1

## 1.What is the differece between Spring Framework and Spring Boot?

## 2. Why do we need `pom.xml`?

> It is an XML file that contains information about the project and configuration details used by [`Maven`](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html) to build the project.

## 3. Why do we need `@SpringBootApplication` annotation? What will happen if we remove it?

## 4. What is the purpose of the interface `CommandLineRunner`?

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
