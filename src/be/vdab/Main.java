package be.vdab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Path afbeeldingen = Path.of("/Users/joann/data/afbeeldingen");
        System.out.println(afbeeldingen.getParent());
        System.out.println(afbeeldingen.toAbsolutePath());
        Path huidigeDirectory = Path.of("plaatselijk");
        System.out.println(huidigeDirectory.toAbsolutePath());
        System.out.println();

        System.out.println(Files.exists(Path.of("C:/Users/joann/data")));

        System.out.println();

        Path data = Path.of("/Users/joann/data");
        System.out.println(Files.isDirectory(data));
        System.out.println(Files.isRegularFile(data));

        try {
            Files.createDirectories(Path.of("/Users/joann/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Files.move(Path.of("/Users/joann/data/afbeeldingen"), Path.of("/Users/joann/data/images"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Files.delete(Path.of("/Users/joann/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();

        try {
            System.out.println(Files.size(Path.of("/Users/joann/data/images/duimop.jpg")));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();

        try {
            Files.copy(Path.of("/Users/joann/data/images/duimop.jpg"), Path.of("/Users/joann/data/images/thumbup.jpg"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Files.move(Path.of("/Users/joann/data/images/thumbup.jpg"), Path.of("/Users/joann/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Files.delete(Path.of("/Users/joann/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        /*try {
            List<String> regels = Files.readAllLines(Path.of("/Users/joann/data/insecten1.csv"));
            for (String regel : regels) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

            /*try (BufferedReader reader = Files.newBufferedReader(Path.of("/Users/joann/data/insecten1.csv"))) {
                for (String regel; (regel = reader.readLine()) != null;) {
                    System.out.println(regel);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }*/

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("/Users/joann/data/naam.txt"))) {
            writer.write("Adam");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
