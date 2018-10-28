package interfaces;

public class Appexec {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        machine1.start();

        Person person1 = new Person("Bob");
        person1.sayHello();

        System.out.println("");

        /*Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();*/

        outputInfo(machine1);
        outputInfo(person1);


    }


    private static void outputInfo(Info info){
        info.showInfo();
    }

}
