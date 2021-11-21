package serialization;

import java.io.*;

public class MainApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Barsik","red",5);

        File file = new File("person.anything");

        writeObjectToFile(cat, file);

        Cat p = readObjectFromFile(file);

        System.out.println(p);

    }

    // Serialization
    // Save object into a file.
    public static void writeObjectToFile(Cat obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }

    // Deserialization
    // Get object from a file.
    public static Cat readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Cat result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Cat) ois.readObject();
        }
        return result;
    }
    }

