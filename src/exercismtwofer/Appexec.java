package exercismtwofer;

public class Appexec {

    public static void main(String[] args) {

        TwoFer ex1 = new TwoFer();

        String nullString = null;

        ex1.printName("Matteo");
        ex1.printName(nullString);

    }
}
