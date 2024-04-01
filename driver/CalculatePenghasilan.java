package driver;

import java.util.*;

import model.*;

public class CalculatePenghasilan {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        Manager manager = new Manager(1000000, 500000);
        Staff staff = new Staff(500000, 200000, 100000);    

        System.out.println("Choose employee (0: Manager, 1: Staff): ");
        int choose = scanner.nextInt();
        EmployeeType EmployeeType = null;

        switch (choose) {
            case 0:
                EmployeeType = EmployeeType.MANAGER;
                break;
            case 1:
                EmployeeType = EmployeeType.STAFF;
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        if (EmployeeType == EmployeeType.MANAGER){
            System.out.println("Penghasilan: " + income(manager));
        } else if (EmployeeType == EmployeeType.STAFF){
            System.out.println("Penghasilan: " + income(staff));
        } else {
            System.out.println("Pilihan tidak valid");
        }

        scanner.close();

    }

    private static double income(Employee employee) {
        return employee.income();
    }
    
}
