# 📝 TodoWeb - Spring Boot Todo App

A simple Todo List web application built with Spring Boot, Thymeleaf, and basic HTML/CSS.

## 🔧 Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- HTML / CSS

## 📁 Project Structure

```
com.app.todoapp
├── Controller
│   └── TaskController.java       // Handles HTTP requests for tasks
├── models
│   └── Task.java                 // Task entity
├── repository
│   └── TaskRepo.java            // Interface for database operations
├── services
│   └── TodoService.java         // Business logic for task operations
└── templates
    └── tasks.html               // Frontend rendered using Thymeleaf
```

## 🚀 Features

- View all tasks
- Add a new task with a title and optional description
- Delete tasks
- Toggle task completion status
- Basic UI with responsive layout using pure HTML/CSS

## 🛠️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/EslamMetawie20/TodoWeb.git
cd TodoWeb
```

2. Open the project in your IDE (e.g., IntelliJ).
3. Make sure you have Java 17 installed.
4. Run the application (`TodoWebApplication.java`).
5. Open your browser and go to: `http://localhost:8080/`

