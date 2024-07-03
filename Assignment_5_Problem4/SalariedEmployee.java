package Assignment_5_Problem4;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
