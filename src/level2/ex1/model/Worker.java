package level2.ex1.model;

@SerializableFileJson(directory = "src/level2/ex1/resources")
public class Worker {
    protected String name;
    protected String surname;
    protected double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

}

