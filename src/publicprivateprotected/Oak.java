package publicprivateprotected;

public class Oak extends Plant {

    public Oak() {
        this.name = "Oak";

        //not working 'cause type is private!
        //this.type = "not so nice plant";

        //size is protected and be accessed by children classes!
        this.size = "large";

        this.height = "low";
    }
}
