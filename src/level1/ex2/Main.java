package level1.ex2;

import level1.ex2.model.DeprecatedOnsiteWorker;
import level1.ex2.model.DeprecatedRemoteWorker;

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        DeprecatedOnsiteWorker onsite = new DeprecatedOnsiteWorker("Marc", "Guillem", 16.0);
        DeprecatedRemoteWorker remote = new DeprecatedRemoteWorker("Anna", "Muñoz", 12.0);

            System.out.println("Onsite worker salary: " + onsite.calculateSalary(160));
            System.out.println("Remote worker salary: " + remote.calculateSalary(160));
    }
}
