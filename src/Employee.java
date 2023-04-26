/**
 * The Employee abstract class represents an employee who can receive payments.
 */
public abstract class Employee implements Payable {
    private String lastName;
    private String firstName;
    private String nationalInsurance;
    /**
     * Constructs a new Employee object with the given name and national insurance number.
     *
     * @param lastName          The last name of the employee.
     * @param firstName         The first name of the employee.
     * @param nationalInsurance The national insurance number of the employee.
     */
    public Employee(String lastName, String firstName, String nationalInsurance) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationalInsurance = nationalInsurance;
    }
    /**
     * Increases the salary of this employee by the given rate.
     *
     * @param rate The rate by which to increase the salary.
     */
    public abstract void increaseSalary(double rate);
    /**
     * Gets the last name of this employee.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Sets the last name of this employee.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Gets the first name of this employee.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Sets the first name of this employee.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Gets the national insurance number of this employee.
     *
     * @return The national insurance number.
     */
    public String getNationalInsurance() {
        return nationalInsurance;
    }
    /**
     * Sets the national insurance number of this employee.
     *
     * @param nationalInsurance The national insurance number to set.
     */
    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }
    /**
     * Returns a string representation of this employee, including their name and national insurance number.
     *
     * @return The string representation of this employee.
     */
    @Override
    public String toString() {
        return "Name: " + getLastName() + ", First Name: " + getFirstName() + ", NI: " + getNationalInsurance();
    }
}
