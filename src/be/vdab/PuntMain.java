package be.vdab;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PuntMain {
    public static void main(String[] args) {

        /*try (var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("/Users/joann/data/punt.ser")))) {
            stream.writeObject(new Punt(10, 20));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        try (var stream = new ObjectInputStream(Files.newInputStream(Path.of("/Users/joann/data/punt.ser")))) {
            Punt punt = (Punt) stream.readObject();
            System.out.println(punt);
        } catch (IOException  | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
