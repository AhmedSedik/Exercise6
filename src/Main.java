public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Add some employees to the company
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Smith", "Mary", "AB 12346 C", 15.21, 150);
        MonthlyEmployee monthlyEmployee = new MonthlyEmployee("Smith", "John", "AA112312", 1800.21);
        company.getEmployees().add(hourlyEmployee);
        company.getEmployees().add(monthlyEmployee);

        // Print out the initial employee information
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee);
        }

        // Increase the salaries of all employees by 1%
        company.increaseSalaries(0.01);

        // Print out the updated employee information
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee);
        }
    }

}
