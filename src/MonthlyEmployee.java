public class MonthlyEmployee extends Employee {
    private double monthlySalary;

    public MonthlyEmployee(String lastName, String firstName, String nationalInsurance, double monthlySalary) {
        super(lastName, firstName, nationalInsurance);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getPaymentAmount() {
        return monthlySalary;
    }

    @Override
    public void increaseSalary(double rate) {
        monthlySalary *= (1 + rate);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Monthly salary: "
                + String.format("%.2f", getMonthlySalary());
    }
}
