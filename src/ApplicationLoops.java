public class ApplicationLoops {

    public static void main(String[] args) {
        //booleans examples
        boolean newBoolean = 6 > 5;
        boolean aBoolean = 6 != 5;

        System.out.println("Questo e' il risultato del booleano: " + aBoolean);

        //while loop example
        int loopInt = 0;

        while  (loopInt <5) {

            System.out.println("Si prosegue nel while per " + loopInt + " volte.");
            loopInt++;
        }

        while (true) {
            System.out.println("Prova di while per " + loopInt + " volte.");

            if (loopInt == 6) {
                break;
            }
            loopInt++;
        }

        //for loop example
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Questo for viene eseguito " + i);
        }

        //if conditions example
        int a = 2;
        if (a == 0) {
            System.out.println("Prova di if");
        }
        else if (a > 0) {
            System.out.println("Prova di else if");
        }
        else {
            System.out.println("Prova di else");
        }


    }




}
