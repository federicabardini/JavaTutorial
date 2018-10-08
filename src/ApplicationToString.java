class Birds {

    private int id;
    private String name;


    public Birds(int id, String name) {
        this.id = id;
        this.name = name;

    }


    public String toString() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("Object id is ").append(id).append(" and object name is ").append(name);
        return sb.toString();
        */
        return String.format("Object id %d, Object name %s", id, name);
    }

}


public class ApplicationToString {

    public static void main(String[] args) {
        Birds bird1 = new Birds(4, "Tweet");

        System.out.println(bird1);

    }
}
