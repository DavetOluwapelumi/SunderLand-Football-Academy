### Table of Contents

A simple **Java console-based application** for managing footballers in an academy. This project demonstrates strong use of **Object-Oriented Programming (OOP)** principles, data validation, and Java Collections.

---

## 📖 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Project Structure](#-project-structure)
- [Technologies Used](#-technologies-used)
- [How to Run](#-how-to-run)
- [Example Output](#-example-output)
- [Validation Rules](#-validation-rules)
- [Design Concepts Applied](#-design-concepts-applied)
- [Future Improvements](#-future-improvements)
- [Author](#-author)

---

## 📌 Overview

The **Football Academy Management System** allows users to:

- Register footballers
- Prevent duplicate registrations
- View all registered footballers
- Check footballer's existence
- Remove footballers from the academy

The system uses a `HashMap<Integer, Footballer>` for efficient data storage and retrieval using unique player IDs.

---

## ✨ Features

✔ Register a footballer  
✔ Prevent duplicate player IDs  
✔ View all registered footballers  
✔ Check if a footballer exists by ID  
✔ Remove a footballer  
✔ Input validation with exception handling  

---

## 📂 Project Structure

```
Football-Academy-Management/
│
├── Main.java
├── Footballer.java
└── AcademyManager.java
```

### 🔹 Footballer.java
Represents a football player with:

- id
- name
- age
- position

Includes:
- Constructor validation
- Getters and setters
- toString() method 

---

### 🔹 AcademyManager.java
Handles academy operations using a HashMap.

Methods:
- registerFootballer(Footballer f)
- removeFootballer(int id)
- viewFootballers()
- footballerExists(int id)

---

### 🔹 Main.java
Contains the main() method and demonstrates:

- Object creation
- Registration
- Duplicate prevention
- Viewing records
- Existence check
- Deletion

---

## 🛠 Technologies Used

- Java (JDK 8+)
- Java Collections Framework (HashMap)
- Object-Oriented Programming Principles

---

## 🚀 How to Run

### 1️⃣ Compile the project

```bash
javac Main.java Footballer.java AcademyManager.java
```

### 2️⃣ Run the application

```bash
java Main
```

---

## 🖥 Example Output

```
Footballer registered successfully: David
Footballer registered successfully: Bayo
Footballer registered successfully: Sayo
Registration failed: Footballer with ID 1 already exists.
Registered Footballers:
ID: 1, Name: David, Age: 20, Position: Midfielder
ID: 2, Name: Bayo, Age: 19, Position: Forward
ID: 3, Name: Sayo, Age: 21, Position: Defender
Does ID 2 exist? true
Does ID 4 exist? false
Footballer removed successfully: Bayo
Cannot remove: No footballer found with ID 4
Registered Footballers:
ID: 1, Name: David, Age: 20, Position: Midfielder
ID: 3, Name: Sayo, Age: 21, Position: Defender
```

---

## 🔐 Validation Rules

The system enforces the following constraints:

- ID must be greater than 0
- Age must be greater than 0
- Name cannot be null or empty
- Position cannot be null or empty
- Duplicate IDs are not allowed

Invalid inputs throw IllegalArgumentException.

---

## 🧠 Design Concepts Applied

This project demonstrates:

- Encapsulation
- Constructor validation
- Defensive programming
- CRUD operations
- Use of HashMap for O(1) lookup
- Clean separation of concerns

---


## 👨‍💻 Author

David Titilayo  
Software Engineering | Java Developer
