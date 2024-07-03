package Assignment_5_Problem2;

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Alexander Oblego", 55000, LocalDate.of(2023, 07, 29), 4);
        Professor p2 = new Professor("Smith Johnson", 38000, LocalDate.of(2024, 01, 26), 2);
        Professor p3 = new Professor("John Smith", 19000, LocalDate.of(2024, 03, 23), 5);
        Secretary s1 = new Secretary("Prince Mike", 21000, LocalDate.of(2017, 04, 07), 12.5);
        Secretary s2 = new Secretary("William Spring", 27000, LocalDate.of(2017, 01, 07), 24.5);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner input = new Scanner(System.in);
        System.out.println("Do you wanna see the sum of salaries in all department?. Type 'Y' for YES and 'N' for NO");
        String decision = input.next();
        decision=decision.toUpperCase();
        switch(decision) {
            case "Y":
                double totalSalary=0.0;
                for (DeptEmployee col : department){
                    totalSalary+=col.computeSalary();
                }
                System.out.println("The total salary of all is: " + totalSalary);
                System.exit(0);
            case "N":
                System.out.println("Thank you, Have a nice day!");
                System.exit(0);
            default:
                System.out.println("Invalid input!");
                System.exit(0);
        }

    }
}
