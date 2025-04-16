# 🍕 Simply Pizza Ordering System
Welcome to the Simply Pizza Ordering System — a Java-based console application that simulates a pizza ordering process for a fictional pizzeria. This project captures user orders, calculates totals with tax, applies discounts when applicable, and prints out a well-formatted receipt.

## 🧾 Project Overview
This application allows the user to:

Take customer orders for:

Small and large pizzas

Pizza toppings

Soft drinks

Calculate the subtotal based on user selections

Automatically apply a 10% discount to orders over $50

Calculate a 6% sales tax

Handle tender and compute change

Display a detailed, multi-line receipt including:

Order summary

Pricing breakdown

Tax and discount details

Total amount due

Customer change

Keep track of:

Total customers served

Total revenue collected

## 📁 Project Structure
Main.java: The core of the application. Handles order input, pricing calculations, receipt formatting, and customer flow.

discount.java: A utility class that checks if the discount condition is met and applies a 10% reduction to qualifying subtotals.

## 🧠 Key Features
Interactive console interface using Scanner

Cleanly formatted receipt output

Dynamic discount application for large orders

Looping functionality for serving multiple customers

Input validation for payment (ensures tendered amount covers the total)

## 🛠️ Technologies
Java (Standard Edition)

Object-Oriented Programming (OOP)

Terminal/Console Input-Output

## 📌 How to Run
Clone this repository.

Compile the Java files:

bash
Copy
Edit
javac Main.java discount.java
Run the program:

bash
Copy
Edit
java Main
Follow the prompts to take orders and view receipts.
