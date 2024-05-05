import java.util.ArrayList;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Janek", 2500.00, 1, "2020-25-05", "Senior Developer");
        Worker worker2 = new Worker("Ania", 3000.00, 2, "2023-23-02", "Junior Developer");
        Worker worker3 = new Worker("Piotrek", 2200.00, 3, "2016-11-11", "Senior Developer");
        Worker worker4 = new Worker("Marta", 2800.00, 4, "2022-10-30", "Project Manager");

        Manager manager = new Manager("Krzysztof", 5000.00, 5, "2015-01-01", "Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() + ", " +
                    "Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: "
                    + employee.getSalary() + ")");
            employee.work();
        }
    }
}