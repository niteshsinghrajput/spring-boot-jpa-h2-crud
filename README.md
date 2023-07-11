
# Spring Boot JPA H2 CRUD Example

This is a simple Spring Boot project that demonstrates CRUD (Create, Read, Update, Delete) operations using JPA (Java Persistence API) and H2 Database and also many-to-many relation in database.

## Prerequisites

Before running this project, make sure you have the following prerequisites:

- Java 11 or higher installed

## Setup

1. Clone the repository:

   ```bash
   git clone git@github.com:niteshsinghrajput/spring-boot-jpa-h2-crud.git

2. Navigate to the project directory:

    ```bash
    cd spring-boot-jpa-h2-crud

3. Build the project

    ```bash
    ./gradlew clean build

4. Run the application

   ```bash
    java -jar .\build\libs\spring-boot-jpa-h2-crud-0.0.1-SNAPSHOT.jar

## Usage
Once the application is running, you can access the API endpoints using a tool like Postman or cURL.

#### The API supports the following endpoints:

* GET `/courses`: Get all courses
    * Sample URL: `http://localhost:8080/courses`
* GET `/courses/{id}`: Get a course by ID
    * Sample URL: `http://localhost:8080/courses/1`
* POST `/courses`: Create a new course
    * Sample URL: `http://localhost:8080/courses`
    * Sample Request Payload:
      ```json
        {
            "course_name": "MEAN Stack CRUD Operation",
            "duration": "2 Months"
        }
      ```
* PUT `/courses/{id}`: Update an existing course
    * Sample URL: `http://localhost:8080/courses/1`
    * Sample Request Payload:
      ```json
        {
            "course_name": "MEAN Stack CRUD Operation",
            "duration": "2 Months"
        }
      ```
* DELETE `/courses/{id}`: Delete a course
    * Sample URL: `http://localhost:8080/courses/1`

* GET `/students`: Get all students
    * Sample URL: `http://localhost:8080/students`
* GET `/students/{id}`: Get a student by ID
    * Sample URL: `http://localhost:8080/students/1`
* POST `/students`: Create a new student
    * Sample URL: `http://localhost:8080/students`
    * Sample Request Payload:
      ```json
        {
           "student_name": "Nitesh Rajput",
           "email_address": "rajput.nitesh012@gmail.com",
           "contact_number": "12345678888",
           "courses": [
               {
                  "course_id": 1
               }
           ]
        }
      ```
* PUT `/students/{id}`: Update an existing student
    * Sample URL: `http://localhost:8080/students/1`
    * Sample Request Payload:
      ```json
        {
           "student_name": "Nitesh Rajput",
           "email_address": "rajput.nitesh012@gmail.com",
           "contact_number": "12345679999",
           "courses": [
               {
                  "course_id": 1
               }
           ]
        }
      ```
* DELETE `/students/{id}`: Delete a student
    * Sample URL: `http://localhost:8080/students/1`

Make sure to replace {id} with the actual ID of the course when using the specific endpoints.

## Configuration
The application configuration can be found in the application.properties file. You can modify the H2 connection details, such as the host, port, and database name, in this file.
   