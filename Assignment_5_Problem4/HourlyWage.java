package Assignment_5_Problem4;

public class HourlyWage extends Employee {
    private double wage;
    private double hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HourlyWage(String firstName,
                      String lastName, String socialSecurityNumber,
                      double wage, double hours)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage=wage;
        this.hours=hours;

    }

    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyWage{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
