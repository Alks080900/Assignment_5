package Assignment_5_Problem2;

import java.time.LocalDate;

public class DeptEmployee {
    String name;
    double salary;
    LocalDate hireday;

    public DeptEmployee(String name, double salary, LocalDate hireday){
      this.name=name;
      this.salary=salary;
      this.hireday=hireday;
    }

    public double computeSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getHireday() {
        return hireday;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }
}
