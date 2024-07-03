package Assignment_5_Problem4;

public class BasePlusCommisionEmployee extends ComissionEmployee {
    double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public double getPayment(){
        return baseSalary + (baseSalary * super.getComissionRate());
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
