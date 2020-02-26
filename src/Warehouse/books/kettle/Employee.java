package Warehouse.books.kettle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//стр. 158
//в текстовом документе EmployeeInfo.txt сделать числа через запятаю!!!иначе работать не будет
public class Employee {

    private String name;
    private String jobTitle;

    public void setName(String nameIn) {
        name = nameIn;
    }

    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitleIn) {
        jobTitle = jobTitleIn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void cutCheck(double amountPaid) {
        System.out.printf("Выплатить служащему %s ", name);
        System.out.printf("(%s) ***$", jobTitle);
        System.out.printf("%,.2f\n", amountPaid);

        /*System.out.println(name);
        System.out.println(jobTitle);
        System.out.println(amountPaid);*/
    }
}

class DoPayroll {

    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\books\\kettle\\EmployeeInfo.txt"));
        for (int empNum = 1; empNum <= 3; empNum++) {
            payOneEmployee(diskScanner);
        }
    }

    static void payOneEmployee(Scanner aScanner) {
        Employee anEmployee = new Employee();
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
