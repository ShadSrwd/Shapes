import java.util.Scanner;

public class MainShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mainChoice;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("|                                                |");
            System.out.println("|Press 1     Press 2     Press 3     Press 0     |");
            System.out.println("|************************************************|");
            System.out.println("|Circle      Cylinder    Exit        Exit Program|");
            System.out.println("|                                                |");
            System.out.println("--------------------------------------------------");
            
            

            mainChoice = input.nextInt();

            if (mainChoice == 1) {
                do {
                    Circle circle = new Circle();
                    circle.input();
                    circle.display();

                    System.out.println("Press 1 to select another circle, Press 0 to go back to the main menu:");
                    int innerChoice = input.nextInt();

                    if (innerChoice != 1) {
                        break; // Break inner loop and go back to main menu
                    }
                } while (true);
            } else if (mainChoice == 2) {
                do {
                    Cylinder cylinder = new Cylinder();
                    cylinder.input();
                    cylinder.display();

                    System.out.println("Press 2 to select another cylinder, Press 0 to go back to the main menu:");
                    int innerChoice = input.nextInt();

                    if (innerChoice != 2) {
                        break; // Break inner loop and go back to main menu
                    }
                } while (true);
            } else if (mainChoice == 3) {
                System.out.println("Exit");
            } else if (mainChoice != 0) {
                System.out.println("Invalid choice. Please choose again.");
            }

        } while (mainChoice != 0);

        System.out.println("Program Exited.");
    }
}

/*---------------------------------------------------------------------------------------------------------------------------------------------------*/