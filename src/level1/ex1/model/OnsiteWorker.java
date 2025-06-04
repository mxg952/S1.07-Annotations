package level1.ex1.model;

public class OnsiteWorker extends Worker {
    public static double gasAllowance = 50.0;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + gasAllowance;
    }
}

