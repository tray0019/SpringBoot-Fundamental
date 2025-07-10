# SpringBoot-RESTful-API

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.5-brightgreen)
![Derby](https://img.shields.io/badge/Database-Derby-lightgrey)
![Eclipse](https://img.shields.io/badge/IDE-Eclipse-purple)
![GitHub](https://img.shields.io/badge/Version_Control-GitHub-black)

This Spring Boot project demonstrates the fundamentals of Spring Boot, RESTful API development, and Spring Data JPA.
- The Topic class represents programming topics (Java, Spring, Pythong etc.)
- The Course class represents courses associated with a specific topic

The project exposes RESTful endpoints for full CRUD operations on both entities and uses JPA for data persistence.

## How to run
1. Clone the repository
2. Open in Java IDE
3. Compile and run

## Step Took 
**Step 1 - RESTful API**
1. Created Spring Boot Maven project
2. Created POJO class called Topic.  
3. Added my TopicController class for handling RESTFul API
4. Added my TopicService class for business logic
5. Add business logic methods for TopicService class (CRUD)
6. Added my TopicService and use Spring MVC annotations for HTTP request

Result: RESTful API tested on browser and Postman and both succesfully worked! 

**Step 2 - JPA & Derby**

7. In POM.xml add the new Dependency for JPA and Derby
8. Added JPA annotation for my Topic class
9. Added TopicRepository interface that extends JpaRepository
10. In my TopicService I have added my TopicRepository instance field with @Autowired annotations
11. Updated TopicService method using topicRepository method. 
12. Added an empty Topic constructor(for Jackson deserialization)
13. In TopicController I Modified getTopic to generic Optional

Result: JPA and RESTful api tested on browser and Postman both successfully worked! 

**Step 3 - Course Class**

14. Added Course classes; such as Course, CourseController, CourseRepository and CourseService. Courses class is a part of Topic.
15. Added Topic field in Course class
16. Set appropriate path variable or request mapping value in CourseController
17. Added cardinalty annotation in Course Topic field
18. In CourseController I use RequestMapping for better map path.

Result: Finally finish and all are working.

## Learned
**@RestController** is a combination of:
- @Controller (makes it a Spring MVC)
- @ResponseBody (returns JSON or text directly in response body)  
	
**Spring Bean:**
- A Java object that Spring manages for you. Instead of manually creating objects using new, Spring creates them, configures them, and injects them when needed. 
	
**@Service annotation:**
- Registers the class as Spring bean(automatically managed)
- Mark as part of service layer/business logic layer

**@Autowired** 
- Inject a spring bean into another class automatically

**@PathVariable**
- Binds a value from the URL path to a method parameter.

**@RequestsBody**
- Binds the entire HTTP request body (usually JSON) to a java object.

**JPA**
- Map Java class and easier coding 

**Derby**
- Test or fake database

**JpaRepository<Topic, String>**
- Extending JpaRepository for automatic JPA methods
- Topic here is the Class and the set to String because that's what the primary key data is set to

Automatic main Application.java created

## Get Request for Topic

![image](https://github.com/user-attachments/assets/2f46b1f6-06a9-408a-a437-95701ffa98d4)

## Get Request for Topic and Course
![image](https://github.com/user-attachments/assets/e76f18e5-7741-4630-98c3-f3b8218cb683)


##All Request work##


