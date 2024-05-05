class Employee2{
    int id;
    String name;

    public void setData(int identification, String nameOfThePerson){
        this.id = id; // this operator is to distinguish from the parameters of the method
        this.name = name;
    }

    public void printDetails(){
        System.out.println("My name is "+name);
        System.out.println("My id is: "+id);
    }

}

public class CWH_Ch8_02_ClassMethods {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
//        emp.name = "Harry";
//        emp.id = 1001;
        emp.setData(1001, "Harry");
        emp.printDetails();
    }
}
