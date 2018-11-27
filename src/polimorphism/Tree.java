package polimorphism;

public class Tree extends Plant {

    @Override
    protected void grow(){
        System.out.println("A tree is growing");
    }

    protected void shedLeaves(){
        System.out.println("Leaves are falling!");
    }
}
