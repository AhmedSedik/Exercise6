import java.util.ArrayList;

/**
 * The Company class represents a company that employs employees.
 */
public class Company {
    private ArrayList<Employee> employees;

    /**
     * Constructs a new Company object.
     */
    public Company() {
        employees = new ArrayList<>();
    }

    /**
     * Gets the list of employees for this company.
     *
     * @return The list of employees.
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Sets the list of employees for this company.
     *
     * @param employees The list of employees to set.
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    /**
     * Increases the salaries of all employees in this company by the given rate.
     *
     * @param rate The rate by which to increase the salaries.
     */
    public void increaseSalaries(double rate) {
        for (Employee employee : employees) {
            employee.increaseSalary(rate);
        }
        System.out.println("Salary increase by " + String.format("%.2f", rate * 100) + " percent done");
    }
}
