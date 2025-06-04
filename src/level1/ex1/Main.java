package level1.ex1;

import level1.ex1.model.OnsiteWorker;
import level1.ex1.model.RemoteWorker;

public class Main {
    public static void main(String[] args) {
            OnsiteWorker onsite = new OnsiteWorker("Marc", "Guillem", 16.0);
            RemoteWorker remote = new RemoteWorker("Anna", "Muñoz", 12.0);

            System.out.println("Onsite worker salary: " + onsite.calculateSalary(160));
            System.out.println("Remote worker salary: " + remote.calculateSalary(160));
    }
}
