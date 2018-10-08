import java.sql.SQLOutput;

public class ApplicationStringBuilderAndFormatting {


    public static void main(String[] args) {

        StringBuilder myString = new StringBuilder();

        myString.append("Hi everyone");
        myString.append(" It's nice to see you here");
        myString.append("!!");

        System.out.println(myString.toString());

        StringBuilder aString = new StringBuilder();

        aString.append("Hello this is Federica")
                .append(" and I'm an happy girl")
                .append(" so please be nice with me!");


        System.out.println(aString);

        //Just some nice tricks for formatting strings

        System.out.println("Just a try\tThis is a tab\nThis is a newline");
        System.out.print("Just a try\tThis is a tab\nThis is a newline");
        System.out.print("Bye!\n");

        //Formatting integers
        System.out.printf("I have %-5d apples; and %d pears", 5,10);

        //Formatting integers and strings
        for(int i=0; i<15;i++){
            System.out.printf("%-2d: %s %d\n", i, "option number", i);
        }

        //Formatting floating point values
        System.out.printf("The value is %f\n", 5.89);
        System.out.printf("The value is %.2f\n", 5.89);
        System.out.printf("The value is %6.1f\n", 776.84939202);

    }




}
