package level1.ex2.model;

import level1.ex1.model.Worker;

public class DeprecatedOnsiteWorker extends Worker {
    public static double gasAllowance = 50.0;

    public DeprecatedOnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Deprecated
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + gasAllowance;
    }
}

