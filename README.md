# 🍕 Simply Pizza Ordering System

Welcome to the **Simply Pizza Ordering System** — a Java-based console application that simulates a pizza ordering process for a fictional pizzeria. This project captures user orders, calculates totals with tax, applies discounts when applicable, and prints out a well-formatted receipt.

---

## 🧾 Project Overview

This application allows the user to:

- Take customer orders for:
  - Small and large pizzas
  - Pizza toppings
  - Soft drinks
- Calculate the subtotal based on user selections
- Automatically apply a **10% discount** to orders over $50
- Calculate a **6% sales tax**
- Handle tender and compute change
- Display a detailed, multi-line **receipt** including:
  - Order summary
  - Pricing breakdown
  - Tax and discount details
  - Total amount due
  - Customer change
- Keep track of:
  - Total customers served
  - Total revenue collected

---

## 📁 Project Structure

# Main.java        # Main logic and user interaction
# discount.java    # Handles discount logic
---

## 🧠 Key Features

- Interactive console interface using `Scanner`
- Cleanly formatted receipt output
- Dynamic discount application for large orders
- Looping functionality for serving multiple customers
- Input validation for payment (ensures tendered amount covers the total)

---

## 🛠️ Technologies Used

- Java (Standard Edition)
- Object-Oriented Programming (OOP)
- Terminal/Console Input-Output

---

## 🚀 How to Run

1. Make sure both `resto.java` and `discount.java` are in the same directory.

2. Compile the files:

   ``` bash
    javac resto.java
    ```

3. Run the program:

    ```bash
    java resto
    ```

## 📌 Author

- Created by Eugene Junior
- Project for INT2200-LD01 - Introduction to Programming
- Bowie State University


## 💡 Future Improvements


- Add a graphical user interface (GUI) using JavaFX or Swing
- Save order history to a file or database
- Add menu customization and more food options

