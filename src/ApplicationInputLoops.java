import java.util.Scanner;

public class ApplicationInputLoops {

    public static void main(String[] args) {

        Scanner inputObject = new Scanner(System.in);

        int numberValue;
        do {
            System.out.println("Please enter a number: ");
            numberValue = inputObject.nextInt();
        }
        while (numberValue != 5);
        System.out.println("Value inserted 5: end of the program!");

    }

}
