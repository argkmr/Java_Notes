class GoogleNew{
    private int id;
    private String name;

    // Constructors has no return type

    GoogleNew(int id, String name){  // Constructor, executes at the time of object instantiation
        this.id = id;
        this.name = name;
    }

    GoogleNew(){ // Overloaded constructor, so yes method overloading can be done with constructors as well
        id = 1004;
        name = "Rohit";
    }

    // Getters for id and name
    public void getId(){ System.out.println("The id of the employee is "+id); }
    public void getName(){ System.out.println("The name of the employee is "+name); }
}

public class CWH_Ch9_02_Constructors {
    public static void main(String[] args) {
        GoogleNew gog = new GoogleNew(1001, "Harry"); // Constructor initialization
        gog.getName();
        gog.getId();

        GoogleNew gog2 = new GoogleNew(); // Overloaded constructor
        gog2.getName();
        gog2.getId();

    }
}
