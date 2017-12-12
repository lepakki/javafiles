package filereader;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Capitano
 */
public class Action {

    File folder = new File(".\\txtfiles");
    File[] allFiles = folder.listFiles();

    public void getFiles() {
        int i = 0;
        System.out.println("Text files found : \n");
        for (File f : allFiles) {
            if (f.isFile() && f.getName().contains(".txt")) {
                System.out.println(i + " - " + f.getName());
                i++;
            }
        }
        System.out.println();
    }

    public void readFiles() {

        for (File f : allFiles) {
            int rowCount = 0;
            try {
                if (f.isFile() && f.getName().contains(".txt")) {
                    Scanner scanner = new Scanner(new FileReader(folder.getName() + "\\" + f.getName()));
                    System.out.println("File : " + f.getName());
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine().trim());
                        rowCount++;
                    }
                    System.out.println("Row count : " + rowCount + "\n");
                }

            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        }
    }

    public void readSelected(int i) {
        
        try {
            File f = allFiles[i];
            if (f.isFile() && f.getName().contains(".txt")) {
                Scanner scanner = new Scanner(new FileReader(folder.getName() + "\\" + f.getName()));
                System.out.println("File : " + f.getName());
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine().trim());
                }
                System.out.println();
            }
        } catch (FileNotFoundException | IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "\n");
        }
    }
}
