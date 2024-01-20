package ObjectClasses;

import java.io.*;

public class Serializer {
    public static void serializeObject(Object object, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(object);
            System.out.println("Obiekt zserializowany i zapisany do pliku: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T deserializeObject(String filename) {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            T object = (T) objectIn.readObject();
            System.out.println("Obiekt zdeserializowany z pliku: " + filename);
            return object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Serializer(){};
}
