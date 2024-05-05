class Employee{
    int id;
    String name;

}

public class CWH_Ch8_01_CreatingCustomJavaClass {
    public static void main(String[] args) {
        System.out.println("This is our first custom class");

        Employee emp = new Employee(); // Instantiating a new class object emp
        // Setting the attributes
        emp.id = 1234;
        emp.name = "Code with harry";

        System.out.println(emp.id);
        System.out.println(emp.name);

    }
}
