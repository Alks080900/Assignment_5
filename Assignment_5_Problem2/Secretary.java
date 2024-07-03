package Assignment_5_Problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    double overtimeHours;

    public Secretary(String name, double salary, LocalDate hireday, double overtimeHours){
        super(name, salary, hireday);
        this.overtimeHours=overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary(){
        double totalOT = 12 * overtimeHours;
        return salary + totalOT;
    }
}
