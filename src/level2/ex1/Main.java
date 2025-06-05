package level2.ex1;

import level2.ex1.model.Serializer;
import level2.ex1.model.Worker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marc", "Guillem", 20.0);
        try {
            Serializer.serialize(worker1);
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
