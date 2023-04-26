/**
 * The HourlyEmployee class represents an employee who is paid on an hourly rate.
 */
public class HourlyEmployee extends Employee {
    private double hourlySalary;
    private int hoursWorked;
    /**
     * Constructs a new HourlyEmployee object with the given name, national insurance number, hourly salary, and hours worked.
     *
     * @param lastName          The last name of the hourly employee.
     * @param firstName         The first name of the hourly employee.
     * @param nationalInsurance The national insurance number of the hourly employee.
     * @param hourlySalary      The hourly salary of the hourly employee.
     * @param hoursWorked       The number of hours worked by the hourly employee.
     */
    public HourlyEmployee(String lastName, String firstName, String nationalInsurance, double hourlySalary, int hoursWorked) {
        super(lastName, firstName, nationalInsurance);
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    /**
     * Gets the payment amount for this hourly employee, which is equal to the hourly salary multiplied by the number of hours worked.
     *
     * @return The payment amount.
     */
    @Override
    public double getPaymentAmount() {
        return hourlySalary * hoursWorked;
    }
    /**
     * Increases the hourly salary of this employee by the given rate.
     *
     * @param rate The rate by which to increase the hourly salary.
     */
    @Override
    public void increaseSalary(double rate) {
        hourlySalary *= (1 + rate);
    }
    /**
     * Returns a string representation of this hourly employee, including their name, national insurance number, hourly salary, hours worked, and total payment.
     *
     * @return The string representation of this hourly employee.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", hourly salary: "
                + String.format("%.2f", hourlySalary)
                + ", worked hours: " + hoursWorked
                + ", total salary: "
                + String.format("%.2f", getPaymentAmount());
    }
}
