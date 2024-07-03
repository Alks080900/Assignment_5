package Assignment_5_Problem4;

public class ComissionEmployee extends Employee {
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String firstName,
                             String lastName, String socialSecurityNumber,
                             double grossSales, double comissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales=grossSales;
        this.comissionRate=comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * comissionRate;
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" +
                "grossSales=" + grossSales +
                ", comissionRate=" + comissionRate +
                '}';
    }
}
