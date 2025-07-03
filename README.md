# Employee Management System (Java JDBC Project)

This is a console-based *Employee Management System* built using *Java, JDBC, and MySQL*.  
The project allows users to *Insert, **View, **Update, and **Delete* employee records from a MySQL database.

> ✅ *Project submitted under: Elevate Labs Java Developer Internship*  
> 👨‍💻 *Developer:* Ritik Kumar  
> 📧 *Email:* [ritikrajput302@gmail.com](mailto:ritikrajput302@gmail.com)

---

## 🔧 Technologies Used

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse IDE
- MySQL Workbench

---

## 📁 Project Files

- DBConnection.java — Establishes connection with MySQL
- InsertEmployee.java — Adds new employee
- ViewEmployee.java — Displays all employees
- UpdateEmployee.java — Updates existing employee details
- DeleteEmployee.java — Deletes employee by ID

---

## 🗃️ MySQL Table Setup

sql
CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    salary DOUBLE
);


---

## 🛠️ How to Run

1. Open the project in *Eclipse*
2. Add MySQL JDBC Connector JAR to the project
3. Start MySQL server and create database + table using above SQL
4. Run any file like InsertEmployee.java using:
   
   Right Click → Run As → Java Application
   

---

## 📌 Example Output


Enter Employee Name: Ritik
Enter Employee Email: ritik@gmail.com
Enter Employee Salary: 50000
Employee inserted successfully.


---

## 📬 Contact

📧 [ritikrajput302@gmail.com](mailto:ritikrajput302@gmail.com)  
🔗 LinkedIn: Add your profile link here

---

## 📄 License

This project was developed as part of the *Elevate Labs Java Developer Internship*  
For educational/demo use only.
