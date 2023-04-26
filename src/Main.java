public class Main {
    public static void main(String[] args) {
        HourlyEmployee mary = new HourlyEmployee("Smith", "Mary", "AB 12346 C", 15.21, 150);
        MonthlyEmployee john = new MonthlyEmployee("Smith", "John", "AA112312", 1800.21);

        Company company = new Company();
        company.getEmployees().add(mary);
        company.getEmployees().add(john);

        System.out.println(mary);
        System.out.println(john);

        double rate = 0.01; // 1.0 percent increase
        for (Employee employee : company.getEmployees()) {
            if (employee instanceof HourlyEmployee) {
                HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
                double hourlySalary = hourlyEmployee.getHourlySalary();
                hourlyEmployee.setHourlySalary(hourlySalary * (1 + rate));
            } else if (employee instanceof MonthlyEmployee) {
                MonthlyEmployee monthlyEmployee = (MonthlyEmployee) employee;
                double monthlySalary = monthlyEmployee.getMonthlySalary();
                monthlyEmployee.setMonthlySalary(monthlySalary * (1 + rate));
            }
        }
        System.out.println("Salary increases by " + rate * 100 + " percent done.");

        System.out.println(mary);
        System.out.println(john);
    }
}
