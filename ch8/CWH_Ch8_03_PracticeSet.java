// Question no: 1

class EmployeeQuesNo1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String str){
        name  = str;
    }
}

// Question no: 2
class CellPhoneQuesNo2{

    public void ringtone(){
        System.out.println("Ringing.....");
    }

    public void vibrate(){
        System.out.println("Vibrating....");
    }
}

// Question no: 3
class SquareQuesNo3{
    int side;

    public void setdata(int a){
        side  = a;
    }

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

// Question no: 4
class RectangleQuesNo4{
    int lenght;
    int breadth;

    public void setdata(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public int area(){
        return lenght*breadth;
    }

    public int perimeter(){
        return 2*(lenght + breadth);
    }
}

// Question no: 5
class RockStarGames{
    String name;

    public void setName(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name+" is running....");
    }

    public void fire(){
        System.out.println(name+" is firing....");
    }
}

// Question no: 6
class CircleQuesNo6{
    int radius;

    public void setdata(int radius){
        this.radius = radius;
    }

    public float area(){
        return (float)(3.14*radius*radius); // Typecasting
    }

    public float perimeter(){
        return (float) (2*3.14*radius);
    }
}

public class CWH_Ch8_03_PracticeSet {
    public static void main(String[] args) {

        // Question no:1
        EmployeeQuesNo1 emp1 = new EmployeeQuesNo1();
        emp1.salary = 1250000;
        emp1.name = "Harry";

        System.out.println("Name: "+emp1.getName());
        System.out.println("Salary: "+emp1.getSalary());
        emp1.setName("Manoj");
        System.out.println("New name: "+emp1.getName());

        // Question no:2
        CellPhoneQuesNo2 cell = new CellPhoneQuesNo2();
        cell.ringtone();
        cell.vibrate();

        // Question no:3
        SquareQuesNo3 sq = new SquareQuesNo3();
        sq.setdata(8);
        System.out.println("The area of square is "+sq.area());
        System.out.println("The perimeter square is "+sq.perimeter());

        // Question no:4
        RectangleQuesNo4 rec = new RectangleQuesNo4();
        rec.setdata(8, 7);
        System.out.println("The area rectangle is "+rec.area());
        System.out.println("The perimeter rectangle is "+rec.perimeter());

        // Questin no:5
        RockStarGames rg = new RockStarGames();
        rg.setName("Tommy Vecetti");
        rg.run();
        rg.fire();

        // Question no:6
        CircleQuesNo6 cir = new CircleQuesNo6();
        cir.setdata(8);
        System.out.println("The area of circle is "+cir.area());
        System.out.println("The perimeter circle is "+cir.perimeter());



    }
}
