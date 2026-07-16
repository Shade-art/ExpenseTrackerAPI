# 💸 Expense Tracker API

A lightweight Spring Boot REST API for managing users and tracking their expenses.

## 🚀 Quick Start

1. **Configure Database** in [application.properties](file:///Users/hamza/JAVA/JPA/ExpenseTrackerApi/src/main/resources/application.properties):
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/expensedb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
2. **Run the App**:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🛠 Tech Stack
- **Backend:** Java 21, Spring Boot (Web, JPA, Validation)
- **Database:** PostgreSQL
- **Utilities:** Lombok

## 🔌 API Endpoints

### Health
- `GET /health` -> Checks service status.

### Users & Expenses
- `POST /users` -> Register a user.
- `POST /users/{id}/expenses` -> Add an expense for a user.
- `GET /users/{id}/expenses` -> Get all expenses of a user.
