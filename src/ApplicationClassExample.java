import java.util.Scanner;

class Cats {

    //Definition of instance variables (data or state)
    private String name;
    private String color;
    private int age;

    //adding constructor methods
    public Cats() {
        /*name = "Bellatrix";
        color = "black";
        age = 5;*/
        this("Bellatrix", "black", 5);
        System.out.println("Calling constructor n 1!");

    }


    public Cats(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        System.out.println("Calling constructor n 2!");
    }

    //define a new method
    void meow() {
        System.out.println("This cat's name is " + name + " and it is " + color + " and it is " + age + " years old.");
    }

    //define a method with a return value
    int getMyHumanAge() {
        int humanAge = age*2;
        return humanAge;
    }

    //define getters
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    //define a method with input parameters
    void catSpeak(String someText) {
        System.out.println(someText);
    }

    //define setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


class People {

    private String name;
    private int age;
    private String occupation;
    private String haircolor;

    void tellMeSomethingAboutYou() {
        System.out.println("My name is " + name + " and my hair are " + haircolor + ". \nI'm " + age + " years old and I'm a " + occupation);
    }

    void move(String direction, int km){
        System.out.println("I'm able to move " + direction + " for " + km + " km a day");
    }

    //define setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}



public class ApplicationClassExample {

    public static void main(String[] args) {

        //new object kitty
        Cats kitty = new Cats();
        Cats kitty2 = new Cats("JJ","white",1);

        //kitty.setAge(3);
       // kitty.setColor("grey");
        //kitty.setName("Narcissa");

        String meowing = "Lots of meow for you";

        People misterX = new People();

        misterX.setAge(54);
        misterX.setHaircolor("blonde");
        misterX.setName("No one");
        misterX.setOccupation("Misterious man - maybe a thief");

        String manDirection = "North";
        int kmnum = 35;

        Scanner inputObject = new Scanner(System.in);

        System.out.println("Please insert the object you want to check");
        String newLine = inputObject.nextLine();
        System.out.println("You have choosen: "+ newLine);

        switch (newLine) {
            case "Cats":
                kitty.meow();
                kitty2.meow();
                int humAge = kitty.getMyHumanAge();
                int catAge = kitty.getAge();
                System.out.println("My human age is " + humAge + " but my real age is " + catAge);
                kitty.catSpeak(meowing);
            break;

            case "People":
                misterX.tellMeSomethingAboutYou();
                misterX.move(manDirection, kmnum);
            break;
            default:
                System.out.println("You have inserted an unknown option: please choose between 'Cats' or 'People'");

        }




    }
}