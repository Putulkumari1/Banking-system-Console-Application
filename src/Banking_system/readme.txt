#Banking System using Java JDBC & MySQL

A simple Banking System Console Application developed using - Java, JDBC, and MySQL**.
This project allows users to **register, login, check existing accounts, and store data in a database**.

Features

*👤 User Registration
* 🔐 Login Authentication
* ✔️ Check Existing User
* 💾 Store Data in MySQL
* ❌ Prevent Duplicate Email Registration


##Tech Stack

* Java (Core Java)
* JDBC (Java Database Connectivity)
* MySQL
* IntelliJ IDEA / Eclipse

---
## 📂 Project Structure
Banking-System/
│── src/
│   ├── BankingApp.java
│   ├── AccountManager.java
│   ├── User.java
│   ├── Account.java
│── lib/ (MySQL Connector JAR)
│── README.md

##  Working Flow

1. User selects option:
   * Register
   * Login
2. Registration:

   * Enter Name, Email, Password
   * Data saved in MySQL database
3. Login:
   * Enter Email & Password
   * System checks database
   * If matched → Login Successful 
   * Else → Invalid Credentials 

##  Database Setup
```sql id="db1"
CREATE DATABASE bank_db;

USE bank_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);


## Future Improvements
* 💸 Deposit & Withdraw Money
* 🧾 Transaction History
* 🔐 Password Encryption
* 🎨 GUI using Java switching

## Author
**Putul Kumari**
B.Tech IT (2024) | Aspiring Software Engineer

##Show Your Support
If you like this project, give it a ⭐ on GitHub!
