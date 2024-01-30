package be.vdab;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Tik getallen. tik 0 om te stoppen");

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Path.of("/Users/joann/data/getallen.txt")))) {
            for (int getal; (getal = scanner.nextInt()) != 0;) {
                writer.println(getal);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        /*try (Scanner scanner = new Scanner(Files.newBufferedReader(Path.of("/Users/joann/data/getallen.txt")))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextInt());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        /*try (InputStream input = Files.newInputStream(Path.of("/Users/joann/data/images/duimop.jpg"));
            OutputStream output = Files.newOutputStream(Path.of("/Users/joann/data/images/thumbup.jpg"))) {

            for (int eenByte; (eenByte = input.read()) != -1; ) {
                output.write(eenByte);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        try (var stream = Files.newDirectoryStream(Path.of("/Users/joann/data"))) {
            for (Path path : stream) {
                System.out.print(path.getFileName());
                System.out.println(Files.isDirectory(path) ? ": directory" : ": bestand");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
