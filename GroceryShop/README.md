Introduction:

Grocery Store Billing System

This is a simple Java console application for a grocery store billing system. It allows users to select products such as Vegetables, Fruits, and Groceries, enter quantities, and automatically generates a detailed bill including the total price in both numeric and word formats.

Features

This system allows:
Category selection of items like Vegetables, Fruits, and Groceries
Price calculation based on quantity (in kilograms)
Dynamic bill generation after each purchase
Display of item name, quantity purchased, and price
Total bill displayed in both numbers and words (for example, Rs. 175 becomes One Hundred and Seventy Five)
Display of the date and time using Java's LocalDateTime class

Project Structure

The project includes the following Java classes:
Store.java - Main class that controls user interaction, displays menu, and prints the final bill
vegetables.java - Contains logic for vegetable selection and pricing
fruits.java - Contains logic for fruit selection and pricing
groceries.java - Contains logic for grocery item selection and pricing
NumberToWords.java - Converts the final numeric bill amount into English words

How to Run

To run the project:
Step 1: Clone or download the repository
Step 2: Open terminal or command prompt
Step 3: Compile all Java files using the command: javac Store.java
Step 4: Run the program using the command: java Store

Sample Output

System Generated Bill:
2025-07-07T16:30:00

Item purchased : Tomato
Quantity (in Kgs) : 2
Price : Rs.100

Item purchased : Apple
Quantity (in Kgs) : 1
Price : Rs.150

Total Price : Rs.250 (Two Hundred and Fifty)

Thank you! Visit again!

Additional Notes

This project is intended for learning and practice purposes.
It can be extended by:
Adding more product categories or subcategories
Introducing discounts, item codes, or taxes
Saving bills to a text file or database

Author

Ashiq Rahman A
