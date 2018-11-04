package publicprivateprotected;

public class App {

    public static void main(String[] args) {

        Plant plant  = new Plant();
        Oak oak = new Oak();

        System.out.println(plant.name);

        System.out.println(Plant.ID);

        //not working 'cause type is private!
        //System.out.println(plant.type);

        //size is protected and can be accessed everywhere in the same package!
        System.out.println(plant.size);
        System.out.println(oak.size);
        System.out.println(plant.height);
        System.out.println(oak.height);
    }

}
