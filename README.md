# Electricity-Billing-System
**Project Overview**
Introduce what the Electricity Billing System does.

Desktop-based Java application

Helps electricity department manage billing

Customers can view, pay, and update their records

02
Features
List the main modules available for Admin and Customer.

Admin: Add new customer, view details, deposit info, calculate bills, utilities (Notepad, Calculator)

Customer: Pay bills, view bill details, generate bill slip, update/view information, utilities

03
Tech Stack
Mention the technologies used.

Java (Swing for UI)

MySQL (Database)

JDBC (Database connectivity)

GitHub for version control

04
Database Schema
Summarize the key tables.

signup: meter_no, username, name, password, usertype

new_customer: name, meter_no, address, city

meter_info: meter_number, location, type, phase, bill type

tax: cost_per_unit, meter_rent, service_charge

bill: stores monthly billing details

05
Setup Instructions
Explain how to run the project locally.

Clone the repository: git clone <repo-url>

Import project into IDE (IntelliJ/Eclipse)

Configure MySQL database and run provided SQL scripts

Update DataBase.java with your DB credentials

Run Login.java to start

06
Usage
Show how Admin and Customer interact.

Admin logs in → manages customers, calculates bills

Customer logs in → pays bills, views details, updates info

Both can access utilities (Notepad, Calculator)

07
Conclusion
Wrap up with project benefits.

Reduces manual work

Provides user-friendly interface

Saves time for both customers and electricity department
