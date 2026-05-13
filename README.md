# Banking System Project 💳

This is a simple Banking System project developed using Java, JDBC, and MySQL.  
The project allows users to register and login securely using database authentication.  
User information is stored in a MySQL database, and duplicate accounts are prevented using validation.

This project is useful for beginners to understand:
- Java Database Connectivity (JDBC)
- MySQL database operations
- User authentication system
- CRUD operations
- Exception handling
- Real-world Java project structure

---

## 🚀 Features

- User Registration
- Secure Login System
- Database Connectivity using JDBC
- Prevent Duplicate User Accounts
- Store User Details in MySQL Database
- Input Validation
- Simple Console-Based Application

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse / VS Code
- JDK 21

---

## 📂 Project Structure

```bash
Banking-System/
│
├── src/
│   ├── ConnectionProvider.java
│   ├── Register.java
│   ├── Login.java
│   ├── Main.java
│
├── database.sql
│
└── README.md

🗄️ Database Setup
Create Database

CREATE DATABASE banking_system;
Create Table
CREATE TABLE users (    id INT PRIMARY KEY AUTO_INCREMENT,    name VARCHAR(100),    email VARCHAR(100) UNIQUE,    password VARCHAR(100));

▶️ How to Run the Project
Step 1:
Install:
Java JDK 21
MySQL
Eclipse or VS Code
Step 2:
Create the database and table in MySQL.
Step 3:
Add MySQL JDBC Driver to the project.
Step 4:
Update database username and password in the connection file.
Step 5:
Run the Main.java file.

📚 Learning Outcomes
Through this project, I learned:
How JDBC works
How to connect Java with MySQL
How to execute SQL queries in Java
Login and Registration logic
Basic backend development concepts

🎯 Future Improvements
Add Deposit & Withdraw Features
Transaction History
Balance Check
GUI using Java Swing
Password Encryption



⭐ Author
Putul Kumari
