public class ApplicationArrays {



    public static void main(String[] args) {

        int[] array;


        array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int arrayflow : array) {
            System.out.println(arrayflow);
        }

        String[] arraystring = {"java", "is", "nice", "and", "smart"};

        for (String stringflow : arraystring) {
            System.out.println(stringflow);
        }

        //array multidimensionale

        int[][] grid = new int[2][2];

        grid[0][0] = 15;
        grid[0][1] = 12;
        grid[1][1] = 10;
        grid[1][0] = 7;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");

            }
            System.out.println();
        }


        String[][] arraymultistringa = {
                {"ciao", "come", "va"},
                {"interessante", "prova", "di", "array"},
                {"si"}
        };


        for (int i = 0; i <arraymultistringa.length ; i++) {
            for (int j = 0; j < arraymultistringa[i].length; j++) {

                System.out.print(arraymultistringa[i][j] + "\t");

            }
            System.out.println();
        }
        for (String [] rigaarray: arraymultistringa) {
            for (String colonnaarray: rigaarray) {
                System.out.print(colonnaarray + "\t");
            }
            System.out.println();
        }
    }


}
