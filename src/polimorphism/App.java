package polimorphism;

public class App {

    public static void main(String[] args) {

        Plant plant1 = new Plant();

        Tree tree1 = new Tree();

        Plant plant2 = tree1;

        plant2.grow();

        ((Tree) plant2).shedLeaves();

        //I can do that because of polimorphism: it guarantees me that wherever a parent class is expected I can use a child class too
         doGrow(tree1);

    }



    protected static void doGrow(Plant plant){
        plant.grow();
    }
}
