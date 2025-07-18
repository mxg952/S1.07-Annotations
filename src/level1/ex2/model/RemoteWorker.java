package level1.ex2.model;


public class RemoteWorker extends Worker {
    private static final double INTERNET_PLAN = 30.0;

    public RemoteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    @Deprecated
    public double CalculateSalaryMarkedForDeprecation(int hoursWorked) {
        return super.CalculateSalaryMarkedForDeprecation(hoursWorked) + INTERNET_PLAN;
    }
}

