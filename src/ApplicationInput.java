import java.util.Scanner;

public class ApplicationInput {

    public static void main(String[] args) {

        Scanner inputObject = new Scanner(System.in);

        System.out.println("Please enter a line: ");

        String line = inputObject.nextLine();

        System.out.println("You have entered: " + line);

        System.out.println("Please enter a number: ");

        int number = inputObject.nextInt();

        if (inputObject.hasNextInt()) {
            System.out.println("You have entered: " + number + " and there is another number after");
        }
        else {
            System.out.println("You have entered: " + number + " and there are no more numbers to display");
        }



    }



}
