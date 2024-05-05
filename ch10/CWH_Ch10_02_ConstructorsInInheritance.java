class oneD{
    int x;
    oneD(){
        System.out.println("This is one dimensional class constructor with no arguments");
    }
    oneD(int x){
        System.out.println("This is one dimensional class overloaded constructor with one argument");
        this.x = x;
        System.out.println("The dimension of x axis from oneD class is: "+ x);
    }
}

class twoD extends oneD{
    int y;
    twoD(){
        System.out.println("This is two dimensional class constructor with no arguments");
    }
    twoD(int x, int y){
        super (x);
        System.out.println("This is two dimensional class overloaded constructor with two arguments");
        this.y = y;
        System.out.println("The dimension of x and y axis form twoD class are "+x+" and "+y);

    }
}

class threeD extends twoD{
    int z;
    threeD(){
        System.out.println("This is three dimensional class constructor with no arguments");
    }
    threeD(int x, int y, int z){
        super(x,y);
        System.out.println("This is three dimensional class overloaded constructor with three arguments");
        this.z = z;
        System.out.println("The dimensions of x, y and z are from threeD class are "+x+", "+y+" and "+z);
    }
}



public class CWH_Ch10_02_ConstructorsInInheritance {
    public static void main(String[] args) {

        twoD two = new twoD(); // constructors with no arguments will be executed with oneD class first then twoD class
        System.out.println();
        twoD two2 = new twoD(4,5); // Constructor with two arguments of twoD class will be executed
        // and form there constructor with one argument of class oneD will be executed
        System.out.println();


        // All the commented instructions for twoD class objects can be extended to the threeD class objects as well
        threeD three = new threeD();
        System.out.println();
        threeD three2 = new threeD(3,4,6);
    }
}
