class Parent{
    int max = 34;
    public void display(){
        System.out.println("The max speed is " + max);
    }

    int roll;
    String name;

    Parent(int roll, String name){
        this.roll = roll;
        this.name = name;
        System.out.println("Roll no: "+roll);
        System.out.println("Name: "+name);
    }

    public void show(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    int max = 45;
    @Override
    public void display(){
        System.out.println("The max speed is " + super.max); // Using with the variable of the parent class
    }

    int grade;
    Child(int roll, String name, int grade){
        super(roll, name); // Using super with the constructor for the parent class
        this.grade = grade;
        System.out.println("Grade: "+grade);
    }

    @Override
    public void show(){
        System.out.println("This is child class");
    }
    
    public void getshow(){
        super.show(); // Using super with the method of the parent class
    }
}

public class CWH_Ch10_05_SuperKeyword{
    public static void main(String[] args){

        Child ch = new Child(135, "Anurag", 16);
        ch.display();
        ch.getshow();
        
    }
}