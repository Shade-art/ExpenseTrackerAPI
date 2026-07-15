# Expense Tracker API

A lightweight Spring Boot REST API for managing users and tracking expenses.

## Tech Stack
- **Language:** Java 21
- **Framework:** Spring Boot (Starter Web, Validation, Data JPA)
- **Database:** PostgreSQL
- **Utilities:** Lombok

## Project Structure
- `entity/`: JPA entities (`User`, `Expenses`)
- `repository/`: Spring Data JPA repositories (`UserRepository`, `ExpenseRepository`)
- `Services/`: Business logic (`UserService`)
- `controller/`: REST endpoints (`UserController`, `Health`)
- `DTO/`: Data Transfer Objects for request validation

## Configuration
Update your database configuration in [application.properties](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/resources/application.properties):
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/expensedb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Running the Application
Ensure PostgreSQL is running and the database `expensedb` exists. Then start the application using Maven:
```bash
./mvnw spring-boot:run
```

## API Endpoints

### Health Check
- **Endpoint:** `GET /health`
- **Response:** `Everything connected`

### Users
- **Endpoint:** `POST /users`
- **Request Body:**
  ```json
  {
    "name": "John Doe",
    "email": "john.doe@example.com"
  }
  ```
- **Response:** `User Saved Successfully`
