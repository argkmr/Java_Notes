class Google{
    private int id;
    private String name;

    // Setters for id and name
    public void setId(int id){ this.id = id; }
    public void setName(String name){ this.name = name; }

    // Getters for id and name
    public void getId(){ System.out.println("The id of the employee is "+id); }
    public void getName(){ System.out.println("The name of the employee is "+name); }
}


public class CWH_Ch9_01_AccessModifires {
    public static void main(String[] args) {
        Google go = new Google();
//        go.id = 1001;         Error as the arttributes are private
//        go.name = "Harry";

        // For setters
        go.setName("Harry");
        go.setId(1001);

        // For getters
        go.getName();
        go.getId();

    }
}
