import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Janek", 2500.00, 1, "2020-25-05", "Senior Developer");
        Worker worker2 = new Worker("Ania", 3000.00, 1, "2023-23-02", "Junior Developer");
        Worker worker3 = new Worker("Piotrek", 2200.00, 3, "2016-11-11", "Senior Developer");

        Manager manager = new Manager("Krzysztof", 5000.00, 5, "2015-01-01", "Head");

        System.out.println("Pracownik: " + worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println("Pracownik: " + worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println("Pracownik: " + worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println("Kierownik: " + manager.getName() + " has code: " + manager.hashCode());

        System.out.println("\nPorownanie " + worker2.getName() + " z:");
        System.out.println("- Pracownikiem " + worker1.getName() + ": " + worker2.equals(worker1));
        System.out.println("- Pracownikiem " + worker3.getName() + ": " + worker2.equals(worker3));
        System.out.println("- Kierownikiem " + manager.getName() + ": " + worker2.equals(manager));
    }
}