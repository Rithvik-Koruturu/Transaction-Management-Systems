# Transaction Management System

## Overview
The **Transaction Management System (TMS)** is a standalone application designed to automate receipt generation for transactions. Using **JavaFX** for the frontend and **MySQL** for the backend, TMS allows businesses to create, view, and manage receipts efficiently. This system is particularly useful for retail stores that need to manage transactions, track sales, and generate receipts for customers. It supports multiple payment methods, user authentication, and report generation.

## Features
- **User Authentication**: Secure login with different access levels for administrators and general users.
- **Receipt Generation**: Generate, print, and manage digital receipts for transactions.
- **Customer Management**: Add, update, and delete customer information.
- **Product Management**: Manage product details including addition, update, and deletion.
- **Search Functionality**: Search for specific receipts or transactions.
- **Report Generation**: Generate daily, weekly, or monthly sales and transaction reports.
- **Multi-Payment Support**: Supports multiple payment methods for transactions.
- **Email/SMS Notifications**: Send transaction details to customers via email or SMS.
- **Data Backup and Recovery**: Regular backups to prevent data loss and ensure recovery in case of failures.

## Tech Stack
### Frontend
- **JavaFX**: Used for building the graphical user interface (GUI) to interact with the system.

### Backend
- **Java**: Core programming language for the application’s logic.
- **MySQL**: Relational database management system to store customer data, product details, and transaction records.
- **SQL**: Used for querying the database for data management operations (CRUD - Create, Read, Update, Delete).

### APIs and Integrations
- **Java Swing**: Additional UI components are implemented using Java Swing alongside JavaFX.
- **Java JDK (Java Development Kit)**: Provides the tools required for building and running the Java applications.
- **Email and SMS API**: Integrated for sending notifications to users regarding their transactions and registrations.

### Development Tools
- **Java SE 8 or Later**: Application must be compatible with Java SE 8 or later.
- **Eclipse IDE**: Recommended for developing the project.
- **MySQL Workbench**: Used for managing the MySQL database.

## Usage
1. **Admin Users** can:
   - Manage users, system settings, and sales reports.
   - Add, update, and delete customer and product details.
   - Generate detailed sales and transaction reports.
2. **General Users** can:
   - Generate and print receipts.
   - View and search for transaction history.
   - Manage their own customer information.

## Running the Application
1. **Login** using the credentials set up during system installation.
2. **Generate Receipts**: Navigate through the intuitive GUI to create and view receipts.
3. **Manage Customers and Products**: Easily add, edit, and delete records of customers and products.
4. **Generate Reports**: Go to the reports section to create detailed sales summaries for specific time periods (daily, weekly, or monthly).

## System Features
- **Product Information Management**: Manage product details and maintain transaction records.
- **Billing and Transaction Management**: Facilitate multiple payment methods and generate accurate receipts.
- **User Management and Security**: Secure login with role-based access (admin and general users) and CAPTCHA for additional security.
- **Reporting and Analytics**: Generate reports for sales and transactions to help businesses monitor performance.
- **Data Backup and Recovery**: Regular backups ensure data protection and quick recovery in case of failures.

## Acknowledgements
- **JavaFX Documentation**: [JavaFX Tutorial](https://www.javatpoint.com/javafx-tutorial)
- **MySQL Documentation**: [MySQL Documentation](https://dev.mysql.com/doc/)
