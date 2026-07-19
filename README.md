# 💸 Expense Tracker API

A lightweight Spring Boot REST API for managing users and tracking their expenses.

## 🛠 Tech Stack
- **Backend:** Java 21, Spring Boot 3
- **Database:** PostgreSQL
- **ORM & Validation:** Spring Data JPA, Hibernate, Jakarta Validation
- **Boilerplate Reduction:** Lombok

## 🚀 Getting Started

### 1. Database Setup
Ensure you have a running PostgreSQL instance and a database named `expensedb`.
Update the datasource configurations in [application.properties](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/resources/application.properties):

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/expensedb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 2. Run the Application
Run the following command in the root directory:

```bash
./mvnw spring-boot:run
```
The API server starts on `http://localhost:8080`.

## 🔌 API Endpoints

### Health Check
- `GET /health` - Checks the service status.

### Users
- `POST /users` - Register a new user.
  - **Body (`application/json`)**:
    ```json
    {
      "name": "John Doe",
      "email": "john.doe@example.com"
    }
    ```
- `GET /users` - List all registered users.

### Expenses
- `POST /users/{userId}/expenses` - Log a new expense for a user.
  - **Body (`application/json`)**:
    ```json
    {
      "amount": 29.99,
      "remarks": "Lunch with client",
      "category": "Food",
      "expenseDate": "2026-07-19"
    }
    ```
- `GET /users/{userId}/expenses` - Retrieve all expenses for a user.
- `GET /users/{userId}/total` - Get aggregated expense totals grouped by category.
- `DELETE /users/expense/{expenseId}` - Delete an expense entry by its ID.

---
For implementation details, view:
- [UserController](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/java/org/example/expensetrackerapi/controller/UserController.java)
- [ExpenseController](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/java/org/example/expensetrackerapi/controller/ExpenseController.java)
- [User](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/java/org/example/expensetrackerapi/entity/User.java)
- [Expense](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/java/org/example/expensetrackerapi/entity/Expense.java)

