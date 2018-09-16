import java.util.Scanner;

class Cats {

    //Definition of instance variables (data or state)
    String name;
    String color;
    int age;

    //define a new method
    void meow() {
        System.out.println("This cat's name is " + name + " and it is " + color + " and it is " + age + " years old.");
    }
}


class People {

    String name;
    int age;
    String occupation;
    String haircolor;

    void tellMeSomethingAboutYou() {
        System.out.println("My name is " + name + " and my hair are " + haircolor + ". \nI'm " + age + " years old and I'm a " + occupation);
    }
}



public class ApplicationClassExample {

    public static void main(String[] args) {

        //new object kitty
        Cats kitty = new Cats();

        kitty.age = 3;
        kitty.color = "grey";
        kitty.name = "Narcissa";

        People misterX = new People();

        misterX.haircolor = "blonde";
        misterX.age = 54;
        misterX.name = "No one";
        misterX.occupation = "Misterious man - maybe a thief";

        Scanner inputObject = new Scanner(System.in);

        System.out.println("Please insert the object you want to check");
        String newLine = inputObject.nextLine();
        System.out.println("You have choosen: "+ newLine);

        /*if (newLine.equals("Cats")) {
            System.out.println(kitty.name);
            System.out.println(kitty.age);
            System.out.println(kitty.color);
        }
        else if (newLine.equals("People")) {
            System.out.println(misterX.name);
            System.out.println(misterX.age);
            System.out.println(misterX.haircolor);
            System.out.println(misterX.occupation);
        }

        else {
            System.out.println("You have inserted an unknown option: please choose between 'Cats' or 'People'");
        }*/

        switch (newLine) {
            case "Cats":
                //System.out.println(kitty.name);
                //System.out.println(kitty.age);
                //System.out.println(kitty.color);
                kitty.meow();
            break;

            case "People":
                //System.out.println(misterX.name);
                //System.out.println(misterX.age);
                //System.out.println(misterX.haircolor);
                //System.out.println(misterX.occupation);
                misterX.tellMeSomethingAboutYou();
            break;
            default:
                System.out.println("You have inserted an unknown option: please choose between 'Cats' or 'People'");

        }




    }
}