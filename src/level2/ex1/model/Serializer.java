package level2.ex1.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;

public class Serializer {
    public static void serialize(Object obj) throws IOException, IllegalAccessException {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(SerializableFileJson.class)) {
            throw new IllegalArgumentException("La classe no està anotada amb @SerializableFileJson");
        }

        SerializableFileJson annotation = clazz.getAnnotation(SerializableFileJson.class);
        String directory = annotation.directory();
        String filename = directory + "/" + clazz.getSimpleName() + ".json";

        StringBuilder json = new StringBuilder();
        json.append("{\n");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("  \"").append(fields[i].getName()).append("\": ");
            Object value = fields[i].get(obj);

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(",");
            }
            json.append("\n");
        }

        json.append("}");

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(json.toString());
        }

        System.out.println("Fitxer JSON creat a: " + filename);
    }
}

