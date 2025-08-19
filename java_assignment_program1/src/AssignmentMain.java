

import com.madanraj.assignment.employees.Developer;
import com.madanraj.assignment.employees.Manager;
import com.madanraj.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer
        Manager m = new Manager("Alice", 101, 75000, "HR");
        Developer d = new Developer("Bob", 102, 60000, "Java");

        // Display details
        System.out.println("--- Employee Details Before Salary Update ---");
        EmployeeUtilities.showEmployeeDetails(m);
        EmployeeUtilities.showEmployeeDetails(d);

        // Update salaries
        EmployeeUtilities.increaseSalary(m, 10);
        EmployeeUtilities.increaseSalary(d, 15);

        System.out.println("\n--- Employee Details After Salary Update ---");
        EmployeeUtilities.showEmployeeDetails(m);
        EmployeeUtilities.showEmployeeDetails(d);
    }
}