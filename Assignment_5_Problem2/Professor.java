package Assignment_5_Problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    int numberOfPublications;

    public Professor(String name, double salary, LocalDate hireday, int numberOfPublications){
        super(name, salary, hireday);
        this.numberOfPublications=numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public double computeSalary() {
        return salary;
    }
}
