import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Janek", 2500.00, 1, "2020-25-05", "Senior Developer");
        Worker worker2 = new Worker("Ania", 3000.00, 2, "2023-23-02", "Junior Developer");
        Worker worker3 = new Worker("Piotrek", 2200.00, 3, "2016-11-11", "Senior Developer");
        Worker worker4 = new Worker("Ryszard", 2000.00, 4, "2016-11-11", "Senior Developer");
        Worker worker5 = new Worker("Wiktor", 2300.00, 5, "2017-10-11", "Senior Developer");
        Manager manager1 = new Manager("Krzysztof", 5000.00, 6, "2018-01-01", "Head");
        Manager manager2 = new Manager("Adam", 5000.00, 7, "2018-01-01", "Head");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        Worker worker6 = new Worker("Katarzyna", 3500.00, 5, "2022-02-01", "DevOps Engineer");
        Worker worker7 = new Worker("Borys", 2800.00, 1, "2021-09-01", "Full Stack Developer");
        Manager manager3 = new Manager("Beata", 6000.00, 6, "2020-04-01", "Project Manager");
        employees.add(worker6);
        employees.add(worker7);
        employees.add(manager3);

        double totalSalary = 0.0;
        double totalManagerSalary = 0.0;
        double totalWorkerSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("\nCalkowita suma pensji: " + totalSalary);
        System.out.println("Calkowita suma pensji managerow: " + totalManagerSalary);
        System.out.println("Calkowita suma pensji pracownikow: " + totalWorkerSalary);

        System.out.println("\nDuplikaty ID:");
        for (Employee employee : employees) {
            for (Employee otherEmployee : employees) {
                if (employee != otherEmployee && employee.getId() == otherEmployee.getId()) {
                    System.out.println("- " + employee.getName() + " (ID: " + employee.getId() + ")");
                }
            }
        }
    }
}