package publicprivateprotected;

public class Plant {

    //BAD PRACTICE: everybody from everywhere can access this variable and change it! you need to SEGREGATE IT!
    public String name;

    //ACCEPTABLE PRACTICE: this variable is associated to a public class and it's constant and nobody can change it!
    public final static int ID = 9;

    //GOOD PRACTICE: accessible only within the class
    private String type;

    //GOOD PRACTICE: accessible only within the package or child classes
    protected String size;

    //this means you have package-level visibility - no child classes!!
    String height;


    public Plant(){
        this.name = "Gigi";
        this.type = "nice plant";
        this.size = "medium";
        this.height = "tall";
    }

}
