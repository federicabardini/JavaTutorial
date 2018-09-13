import java.util.Scanner;

public class ApplicationSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please insert a command: ");
        String text = input.nextLine();

        switch (text) {
            case "Start":
                System.out.println("Started!");
            break;
            case "Stop":
                System.out.println("Stopped!");
            break;
            default:
                System.out.println("No recognized command inserted!");
        }

    }

}
