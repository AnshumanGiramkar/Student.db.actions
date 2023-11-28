---

# Student Management System

This Spring Boot application serves as a Student Management System, allowing administrators to manage student data.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- MySQL Driver
- JPA (Java Persistence API)
- Devtools
- Web

## Features

- CRUD (Create, Read, Update, Delete) operations for student records.
- User-friendly interface with Thymeleaf templates.
- Data persistence using JPA with MySQL database.
- Devtools enabled for faster development.

## Installation and Setup

### Prerequisites

- Java Development Kit (JDK) installed
- MySQL database installed and running

### Steps to Run

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/student-management-system.git
    ```

2. Open the project in your preferred Java IDE.

3. Set up the MySQL database:
    - Create a MySQL database named `student_db`.
    - Configure the database connection in the `application.properties` file:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=root_password

    #Hibernate
      spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect

    #Hibernate auto ddl
    spring.jpa.hibernate.ddl-auto=update
    
    logging.level.org.hibernate.SQL=DEBUG
    ```

4. Run the application:
    - Locate the main class (`StudentManagementSystemApplication.java`).
    - Right-click on the main class and select "Run" to start the Spring Boot application.

5. Access the application:
    - Open a web browser and go to `http://localhost:8080/students` to access the Student Management System.

## Usage

- Upon accessing the application, you'll land on the home page displaying options for managing students (e.g., View Students, Add Student, Update Student, Delete Student).
- Click on the respective options to perform CRUD operations on student records.

## Contributions

Contributions are welcome! Feel free to submit issues or pull requests.

## License

This project is licensed under the [MIT License](LICENSE).

---
