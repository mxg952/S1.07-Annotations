package level1.ex2.model;

public class Worker {
    protected String name;
    protected String surname;
    protected double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double CalculateSalaryMarkedForDeprecation(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}
