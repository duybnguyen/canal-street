# Online Clothing Store
## Description of the Project
This project is a web-based clothing store API built using Java and Spring Boot. It provides RESTful endpoints for managing products, categories, users, and shopping carts in an online clothing store.

The API supports role-based access control, allowing administrators to create, update, and delete products, while regular users can browse products and manage their personal shopping cart. Authentication and authorization are handled using JWT (JSON Web Tokens).

This project demonstrates backend development concepts such as REST API design, database interaction with DAOs, authentication and authorization, and separation of concerns using layered architecture.


### Prerequisites

- IntelliJ IDEA
  Download from: https://www.jetbrains.com/idea/download/

- Java SDK 17 or higher

- MySQL, A local MySQL database is required to store users, products, categories, and shopping cart data.

- Insomnia (optional)
Useful for testing API endpoints.
### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Open the project directory.
3. Ensure your MySQL database is running and credentials are correctly set in application.properties.
4. Build the project using Maven.
5. Run the main Spring Boot application class.
6. The API will be available at: http://localhost:8080
## Technologies Used

- Java 17
- Spring Boot
- Spring Security with JWT authentication
- MySQL
- JDBC (DAO pattern)
- Maven

## Demo
[Demo Video](https://drive.google.com/file/d/1qmTZk-vrFyWZXMVlMUjUmUX0AR793XUi/view?usp=sharing)

## Interesting Piece of Code
An interesting design decision in this project was enforcing role-based access control directly at the controller level using Spring Security’s method annotations. Instead of manually checking user roles inside each endpoint, the API uses @PreAuthorize annotations to clearly define who is allowed to perform sensitive actions.
