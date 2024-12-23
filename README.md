# CRUD App with Theamleaf

A simple CRUD application built with Spring Boot and Theamleaf. This app allows users to create, read, update, and delete records seamlessly.

## Features
- **Create, Read, Update, Delete:** Full CRUD functionality.
- **Theamleaf:** Dynamic and customizable front-end templates.

## Technologies Used
- **Spring Boot:** Backend framework for Java.
- **Theamleaf:** Template engine for dynamic web pages.
- **MySQL:** Relational database for production use.

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- MySQL database

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    ```
2. Navigate to the project directory:
    ```bash
    cd your-repo-name
    ```
3. Configure MySQL database:
    - Create a database named `your_database_name`.
    - Update `src/main/resources/application.properties` with your MySQL database configurations:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_mysql_username
      spring.datasource.password=your_mysql_password
      spring.jpa.hibernate.ddl-auto=update
      ```

4. Build the project:
    ```bash
    ./mvnw clean install
    ```
5. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

### Usage
- Access the application at `http://localhost:8080`.
- Use the provided UI to create, read, update, and delete records.

## Contribution
Feel free to submit issues and pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License.
