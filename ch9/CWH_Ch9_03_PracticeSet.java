// Question no: 1 and 2
class cylinderQuesNo1n2{
    private int radius;
    private int height;

    // Setters
    public void setRadius(int radius) { this.radius = radius; }
    public void setHeight(int height) { this.height = height; }

    // Getters
    public int getRadius() { return radius; }
    public int getHeight() { return height; }

    // Volume
    public float volumecyc(){ return (float)(3.14*radius*radius*height); }

    // Surface Area
    public float surfaceArea(){ return (float)(2*3.14*radius*height); }


}

// Question no: 3
class cylinderQuesNo3{
    private int radius;
    private int height;

    // Constructor
    cylinderQuesNo3(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    // Getters
    public int getRadius() { return radius; }
    public int getHeight() { return height; }

    // Volume
    public float volumecyc(){ return (float)(3.14*radius*radius*height); }

    // Surface Area
    public float surfaceArea(){ return (float)(2*3.14*radius*height); }


}

// Question no: 4
class RectangelOverloaded{
    private int length;
    private int breadth;

    RectangelOverloaded(){
        length = 4;
        breadth = 8;
    }

    RectangelOverloaded(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return length*breadth;
    }

}

public class CWH_Ch9_03_PracticeSet {
    public static void main(String[] args) {

        // Questin no: 1 and 2
        cylinderQuesNo1n2 cy = new cylinderQuesNo1n2();
        cy.setRadius(4);
        cy.setHeight(6);
        System.out.println("Radius of cylinder using getter: "+cy.getRadius());
        System.out.println("Height of cylinder using getter: "+cy.getHeight());
        System.out.println("Volume of cylindre: "+ cy.volumecyc());
        System.out.println("Surface area of cylindre: "+ cy.surfaceArea());

        // Questin no: 3
        cylinderQuesNo3 cyl = new cylinderQuesNo3(3, 6);
        System.out.println("Radius of cylinder using getter: "+cyl.getRadius());
        System.out.println("Height of cylinder using getter: "+cyl.getHeight());
        System.out.println("Volume of cylindre: "+ cyl.volumecyc());
        System.out.println("Surface area of cylindre: "+ cyl.surfaceArea());

        // Question no: 4
        RectangelOverloaded rec = new RectangelOverloaded();
        System.out.println("Area of the reactagle with no parameter constructor: "+rec.area());
//        generic
        RectangelOverloaded rect = new RectangelOverloaded(4,6);
        System.out.println("Area of the rectangle with two parameters constructor: "+rect.area());

    }
}
