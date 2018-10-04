class Dogs {

    //instance variables
    private String name;
    private int age;
    private int objectId;
    //class variables (static)
    public static String description;
    private static int count = 0;
    //final = constant value
    private static final int PERFECT_NUMBER = 3;

    public Dogs() {
        objectId = count;
        count++;
    }

    public void showObjectId() {
        System.out.println("The object id is " + objectId + " and its generic description is " + description);
    }

    public static void showDescription() {
        System.out.println("Dogs are really " + description);
        System.out.println("Dogs perfect number is " + PERFECT_NUMBER);
    }

}


public class ApplicationStaticExercise {


    public static void main(String[] args) {

        Dogs.description = "Good boy!";

        Dogs dog1 = new Dogs();
        Dogs dog2 = new Dogs();

        dog1.showObjectId();
        dog2.showObjectId();

        Dogs.showDescription();

    }

}