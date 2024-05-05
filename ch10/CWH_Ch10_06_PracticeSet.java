// Question no: 1 and 3
class Circle{
    int radius;
    Circle(int radius){ this.radius = radius; }
    public float Area(){
        return (float)(Math.PI *radius*radius);
    }
}

class Cylinder extends Circle{
    int height;
    Cylinder(int radius, int height){
        super(radius);
        this.height = height;
    }
    public float Volume(){
        return (float)(Math.PI*radius*radius*height);
    }
}

public class CWH_Ch10_06_PracticeSet {
    public static void main(String[] args) {

        // Question no: 1 and 3
        Circle cir = new Circle(4);
        System.out.println("The area of the circle is "+String.format("%.2f", cir.Area()));

        Cylinder cyl = new Cylinder(3,5);
        System.out.println("The area of the circular section of the cylinder is "+ String.format("%.2f", cyl.Area()));
        System.out.println("The volume of the cylinder is "+String.format("%.2f", cyl.Volume()));
    }
}
