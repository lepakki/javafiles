package filereader;

import java.util.Scanner;

/**
 *
 * @author Capitano
 */
public class Menu {

    Action ac = new Action();
    static Scanner scanner = new Scanner(System.in);
    private final String[] menuItem = {"List text files", "Print all files","Print selected file" ,"Placeholder" , "Exit"};

    public void runMenu() {

        int selection = 1, i = 1;
        
        while (selection != 5) {

            for(String s : menuItem){
                System.out.println("# " + i + " " + s);
                i++;
            }
            
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    ac.getFiles();
                    break;
                case 2:
                    ac.readFiles();
                    break;
                case 3:
                    //ac.getFiles();
                    printSelected();
                    //ac.readSelected(selection);
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
            i = 1;
        }

    }
    
    public void printSelected(){
        ac.getFiles();
        int i = scanner.nextInt();
        ac.readSelected(i);
    }

}
