package filereader;

import java.util.Scanner;

/**
 *
 * @author Capitano
 */
public class Menu {

    Action ac = new Action();

    private final Scanner scanner = new Scanner(System.in);
    private final String[] menuItem = {"List text files", "Print all files", "Print selected file", "Placeholder", "Exit"};

    public void runMenu() {

        Integer selection = 0, i = 1;

        while ((selection) instanceof Integer) {

            for (String s : menuItem) {
                System.out.println("# " + i + " - " + s);
                i++;
            }

            try {
                do {
                    String s = scanner.next();
                    selection = Integer.parseInt(s);

                } while (!((selection) instanceof Integer));

                switch (selection) {
                    case 1:
                        ac.getFiles();
                        break;
                    case 2:
                        ac.readFiles();
                        break;
                    case 3:
                        printSelected();
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        break;
                }

            } catch (java.util.InputMismatchException | NumberFormatException e) {
                System.out.println("Error caught, use only integers to navigate.\n");
            }
            i = 1;
        }

    }

    public void printSelected() {
        ac.getFiles();
        Integer i = -1;
        try {
            do {
                String s = scanner.next();
                i = Integer.parseInt(s);
            } while (!((i) instanceof Integer));
        } catch (java.util.InputMismatchException | NumberFormatException e) {
            System.out.println("Error caught, use only integers to navigate.\n");
        }
        ac.readSelected(i);

    }

}
