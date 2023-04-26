public class HourlyEmployee extends Employee {
    private double hourlySalary;
    private int hoursWorked;

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

    @Override
    public double getPaymentAmount() {
        return hourlySalary * hoursWorked;
    }

    @Override
    public void increaseSalary(double rate) {
        hourlySalary *= (1 + rate);
    }

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
