class Base{
    int x;
    void setx(int x){
        System.out.println("Setting the value of x in base class....");
        this.x = x;
    }
    int getx(){ return x; }
}

class Derived extends Base{
    int y;
    void sety(int y){
        System.out.println("Setting the value of y in derived class....");
        this.y = y;
    }
    int gety(){ return y; }
}

public class CWH_Ch10_01_Inheritance {
    public static void main(String[] args) {

        // Creating an object of Base class
        Base b = new Base();
        b.setx(6);
        System.out.println("The value of x via base object: "+ b.getx());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setx(4);
        System.out.println("The value of x via derived object is: "+ d.getx());
        d.sety(5);
        System.out.println("The value of y via derived object is: "+ d.gety());
    }
}
