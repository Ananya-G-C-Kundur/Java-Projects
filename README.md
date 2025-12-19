# Java-Projects

# 🔐 Password Validation Program (Java)

A simple **Java console-based project** that validates a user-entered password based on commonly used security rules.  
This project helps beginners understand **String handling, regular expressions, conditions, and user input** in Java.

---

## 📌 Project Objective

To create a Java program that checks whether a password is **strong and valid** based on predefined rules such as:
- Minimum length
- Presence of uppercase letters
- Presence of digits
- Presence of special characters
- No spaces allowed

---

## 🛠️ Technologies Used

- **Java**
- **JDK (Java Development Kit)**
- **Scanner class**
- **Regular Expressions (Regex)**

---

## ✅ Password Validation Rules

A password is considered **valid** only if it satisfies **all** the following conditions:

- 🔹 Minimum **8 characters** long  
- 🔹 Contains **at least one uppercase letter (A–Z)**  
- 🔹 Contains **at least one digit (0–9)**  
- 🔹 Contains **at least one special character**  
  (`@ ! # $ % ^ & *`)
- 🔹 **No spaces** allowed  

---

## ⚙️ How the Program Works

1. The user is prompted to enter a password.
2. The program checks:
   - Password length
   - Uppercase letters using regex
   - Digits using regex
   - Special characters using regex
   - Presence of spaces
3. If any rule fails, an appropriate error message is displayed.
4. If all rules pass, the password is declared **valid and strong**.

---
