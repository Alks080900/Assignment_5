package Assignment_5_Problem4;

public class Main {
    public static void main(String[] args) {
        double totalSalary=0.0;
        Employee[] employees = new Employee[5];
        employees[0] = new ComissionEmployee("John", "Smith", "123-456-789", 2000, 10);
        employees[1] = new HourlyWage("Alexander", "John", "678-678-213", 120, 45.6);
        employees[2] = new SalariedEmployee("Jennifer", "Lopez", "123-456-789", 1230);
        employees[3] = new BasePlusCommisionEmployee("Bruce", "Lee", "5678-321-456", 4560, 7, 789);
        employees[4] = new BasePlusCommisionEmployee("Bruce", "Laa", "5678-321-456", 4560, 7, 789);

        for (Employee col: employees) {
            totalSalary+=col.getPayment();
        }
        System.out.println("The total salary of each employees is: " + totalSalary);
    }
}
