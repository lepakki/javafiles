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

        System.out.println("Text files found : \n");
        for (File f : allFiles) {
            if (f.isFile() && f.getName().contains(".txt")) {
                System.out.println(f.getName());
            }
        }
    }

    public Action() {

        for (File f : allFiles) {
            int rowCount = 0;
            try {
                if (f.isFile() && f.getName().contains(".txt")) {
                    Scanner scanner = new Scanner(new FileReader(folder.getName() + "\\" + f.getName()));
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                        rowCount++;
                    }
                    System.out.println("Row count : " + rowCount + "\n");
                }

            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        }
    }
}
