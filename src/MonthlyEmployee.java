/**
 * The MonthlyEmployee class represents an employee who is paid a fixed monthly salary.
 */
public class MonthlyEmployee extends Employee {
    private double monthlySalary;

    /**
     * Constructs a new MonthlyEmployee object with the given name, national insurance number, and monthly salary.
     *
     * @param lastName          The last name of the monthly employee.
     * @param firstName         The first name of the monthly employee.
     * @param nationalInsurance The national insurance number of the monthly employee.
     * @param monthlySalary     The monthly salary of the monthly employee.
     */
    public MonthlyEmployee(String lastName, String firstName, String nationalInsurance, double monthlySalary) {
        super(lastName, firstName, nationalInsurance);
        this.monthlySalary = monthlySalary;
    }

    /**
     * Gets the payment amount for this monthly employee.
     *
     * @return The payment amount.
     */
    @Override
    public double getPaymentAmount() {
        return monthlySalary;
    }

    /**
     * Increases the monthly salary of this employee by the given rate.
     *
     * @param rate The rate by which to increase the monthly salary.
     */
    @Override
    public void increaseSalary(double rate) {
        monthlySalary *= (1 + rate);
    }

    /**
     * Gets the monthly salary of this employee.
     *
     * @return The monthly salary.
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }
    /**
     Sets the monthly salary of this employee.
     @param monthlySalary The monthly salary to set.
     */
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    /**
     Returns a string representation of this monthly employee, including their name, national insurance number, and monthly salary.
     @return The string representation of this monthly employee.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Monthly salary: "
                + String.format("%.2f", getMonthlySalary());
    }
}
