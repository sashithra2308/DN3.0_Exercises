package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add employees
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 80000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        ems.addEmployee(new Employee("E003", "Charlie", "Analyst", 55000));

        // Traverse employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for employee with ID E002:");
        Employee found = ems.searchEmployee("E002");
        if (found != null) {
            System.out.println("Employee found: " + found);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting employee with ID E003:");
        boolean deleted = ems.deleteEmployee("E003");
        if (deleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traverse employees again
        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}

