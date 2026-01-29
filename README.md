📝 ToDo List Application (Spring Boot)
Description

A simple ToDo List web application built using Spring Boot, Thymeleaf, and MySQL.
Users can create, view, update, and delete tasks, with each task having a name, description, and status (pending, in-progress, completed).

This project was built as a learning and portfolio project to demonstrate backend development using Spring Boot and database integration with MySQL.

Features

Add new tasks with name and description.

Mark tasks as completed, pending, or in-progress.

Update task details.

Delete tasks with a confirmation prompt.

Clean and intuitive UI using Thymeleaf and CSS.

Simple task list management.

Technologies Used

Backend: Spring Boot, Spring MVC, Spring Data JPA

Database: MySQL

Frontend: Thymeleaf, HTML, CSS

Build Tool: Maven

Java Version: 21

Installation

Clone the repository:

git clone https://github.com/yourusername/todolist-springboot.git


Open the project in your IDE (IntelliJ IDEA/Eclipse).

Configure your MySQL database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Run the Spring Boot application.

Open your browser and go to: http://localhost:8080/tasks

Usage

Click "Create Task" to add a new task.

Click "Update" to modify an existing task.

Click "Delete" to remove a task.

Tasks are displayed in a list with status badges (pending, in-progress, completed).

Screenshots

Add screenshots of your app here for better visualization.

Task list page

Create task form

Update task form

Future Improvements

Add user authentication using Spring Security to allow personal task lists.

Add categories or tags for tasks.

Add deadline and reminder notifications.

Improve UI responsiveness using Bootstrap or Tailwind CSS.

Author

Mustafa Gomaa Mahmoud

LinkedIn: www.linkedin.com/in/mustafa-gomaa-a9a579338

Phone: 01121305584
