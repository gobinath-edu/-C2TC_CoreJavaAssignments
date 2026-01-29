
import com.gobinath.assignment.employees.Manager;
import com.gobinath.assignment.employees.Developer;
import com.gobinath.assignment.utilities.EmployeeUtilities;

/**
 * Main class to test the assignment.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Gobinath");
        manager.setEmployeeId(101);
        manager.setSalary(80000);
        manager.setDepartment("IT");

        Developer developer = new Developer();
        developer.setName("Rahul");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities.displayEmployee(manager);
        EmployeeUtilities.displayEmployee(developer);
    }
}
