# StudentManager 🎓

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-4EAA25?style=for-the-badge&logo=gnu-bash&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-FF6B6B?style=for-the-badge)

A console-based Java application to manage student records with comprehensive CRUD operations using LinkedHashMap for efficient data storage and retrieval.

---

## ✨ Features

- 📚 **Add Student Records** - Register new students with automatic grade calculation
- 👀 **View All Students** - Display complete student list with marks and grades
- 🔍 **Search Student** - Find specific student records by roll number
- ✏️ **Update Records** - Modify student name and marks with grade recalculation
- 🗑️ **Delete Records** - Remove student records from the system
- 🏆 **Topper Display** - Identify and display the highest-scoring student
- 🥇 **Top 3 Students** - Show the top 3 performing students
- 📊 **Class Statistics** - Generate comprehensive class performance reports

---

## 🛠️ Tech Stack

- **Java** - Core programming language
- **LinkedHashMap** - Efficient data storage and retrieval
- **Object-Oriented Programming** - Clean, modular code structure
- **Scanner Class** - User input handling
- **Console Interface** - Command-line user interaction

---

## 📂 Project Structure

```
StudentManager/
├── Student.java           # Student entity class
├── studentDatabase.java   # CRUD operations and statistics
├── Main.java             # Menu-driven interface and entry point
└── README.md             # Project documentation
```

### File Overview

- **`Student.java`** - Student entity class with properties and methods
- **`studentDatabase.java`** - Core database operations and statistical analysis
- **`Main.java`** - User interface and application entry point

---

## ⚙️ Installation & Setup

### Prerequisites
- **Java JDK** (version 8 or higher)
- **Command Line Interface** (Terminal/Command Prompt)

### Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/heetnandu01/StudentManager.git
   cd StudentManager
   ```

2. **Compile the Java files**
   ```bash
   javac *.java
   ```

3. **Run the application**
   ```bash
   java Main
   ```

---

## 📖 Usage

### Menu Options

Upon running the application, you'll see a menu with the following options:

```
========== STUDENT MANAGEMENT SYSTEM ==========
1. Add Student Record
2. View All Students
3. Search Student by Roll Number
4. Update Student Record
5. Delete Student Record
6. Display Topper
7. Display Top 3 Students
8. Class Statistics
9. Exit
```

### Operations Guide

1. **Add Student** - Enter roll number, name, and marks for automatic grade calculation
2. **View All** - See complete list of all registered students
3. **Search** - Find student by entering their roll number
4. **Update** - Modify existing student information
5. **Delete** - Remove student record from the system
6. **View Topper** - Display the highest scoring student
7. **Top 3** - Show top 3 performing students
8. **Statistics** - View class performance analytics
9. **Exit** - Close the application

---

## 🎯 Key Features Explained

### Automatic Grade Calculation
The system automatically calculates letter grades based on marks:
- **A+**: 90-100
- **A**: 80-89
- **B+**: 70-79
- **B**: 60-69
- **C**: 50-59
- **F**: Below 50

### Data Storage
- Uses **LinkedHashMap** for maintaining insertion order
- Roll numbers serve as unique keys
- Efficient O(1) lookup time for student records

### Statistical Analysis
- Class average calculation
- Performance distribution
- Top performer identification
- Comprehensive reporting

---

## 🔧 Core Components

### Student Class
```java
// Student entity with properties:
- Roll Number (Key identifier)
- Student Name
- Marks
- Grade (Auto-calculated)
```

### StudentDatabase Class
```java
// Core functionalities:
- CRUD Operations
- Search and Filter
- Statistical Analysis
- Data Validation
```

### Main Class
```java
// User interface:
- Menu-driven system
- Input validation
- Error handling
- User experience optimization
```

---

## 🚀 Example Usage

```bash
# Compile all Java files
javac *.java

# Run the application
java Main

# Follow the menu prompts:
# 1. Choose option 1 to add a student
# 2. Enter roll number: 101
# 3. Enter name: John Doe
# 4. Enter marks: 85
# 5. System automatically assigns grade 'A'
```

---

## 📋 Requirements

- **Java JDK 8+**
- **Terminal/Command Prompt**
- **Basic understanding of Java compilation**

---
