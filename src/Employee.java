public abstract class Employee implements Payable {
    private String lastName;
    private String firstName;
    private String nationalInsurance;

    public Employee(String lastName, String firstName, String nationalInsurance) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationalInsurance = nationalInsurance;
    }

    public abstract void increaseSalary(double rate);

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    @Override
    public String toString() {
        return "Name: " + getLastName() + ", First Name: " + getFirstName() + ", NI: " + getNationalInsurance();
    }
}
