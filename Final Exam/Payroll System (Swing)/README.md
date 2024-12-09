# Payroll System

A simple payroll management system built using Java Swing. 
This application allows users to manage employee records, calculate and save payroll data, and display existing records from a file. 
The system is designed with a GUI for easy interaction and supports basic operations such as adding an employee, calculating pay, saving records, and displaying payroll information in a table format.

## Features

 *Add Employee: Allows the user to input employee details such as ID, name, hourly rate, and hours worked.
 *Calculate Pay: Calculates the gross and net pay of an employee based on their hourly rate and hours worked.
 *Save Records: Saves all employee payroll records to a file (`payroll.txt`).
 *Display Records: Displays all saved payroll records in a table.
 *Load Existing Records: When the application is started, it loads existing payroll records from the `payroll.txt` file (if available).

How It Works

Add Employee
- The user can input details such as `Employee ID`, `Name`, `Hourly Rate`, and `Hours Worked`.
- The system will calculate the gross and net pay (with a 20% tax deduction) and display it in the table.

Calculate Pay
- The user can enter an employee ID, and the system will calculate and display the gross and net pay for that employee.

Save Records
- The user can save all payroll records to a file named `payroll.txt`. This file will be created if it doesn't already exist.

Display Records
- The application can display all the saved payroll records in a table, showing `Employee ID`, `Name`, `Hourly Rate`, `Hours Worked`, `Gross Pay`, and `Net Pay`.

Load Records
- The application automatically loads any existing records from `payroll.txt` into the table when the application starts.

File Structure

- `PayrollSystem.java`: Main Java class containing the logic for the payroll system.
- `payroll.txt`: A text file used to store payroll records.
- `README.md`: This file.

Example Usage

1. Adding an Employee:
   - Enter employee details, such as `Employee ID`, `Name`, `Hourly Rate`, and `Hours Worked`, and click the "Add Employee" button.
   - The system calculates the pay and updates the table with the new employee record.

2. Calculating Pay:
   - Enter an existing `Employee ID` and click "Calculate Pay" to view the gross and net pay.

3. Saving Records:
   - Click "Save Record" to save all payroll records to the `payroll.txt` file.

4. Displaying Records:
   - Click "Display Records" to view all existing payroll records in the table.

