package level1.ex2.model;

public class RemoteWorker extends Worker {
    private static final double INTERNET_PLAN = 30.0;

    public RemoteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + INTERNET_PLAN;
    }

    @Deprecated
    public String CalculateSalaryMarkedForDeprecation(int hoursWorked) {
        String message = "Mètode antic per calcular el sou";
        return message;
    }

}

