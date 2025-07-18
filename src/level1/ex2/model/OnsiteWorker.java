package level1.ex2.model;

public class OnsiteWorker extends Worker {
    public static double gasAllowance = 50.0;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    @Deprecated
    public double CalculateSalaryMarkedForDeprecation(int hoursWorked) {
        return super.CalculateSalaryMarkedForDeprecation(hoursWorked) + gasAllowance;
    }


}

