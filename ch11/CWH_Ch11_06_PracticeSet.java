// Question no: 1 and 2
abstract class Pen{
    void write(){ System.out.println("Writing.."); }
    void refill(){ System.out.println("Is's time to refill...."); }
}

class FountainPen extends Pen{
    void changNib(){ System.out.println("Oh! it's time to change the nib...."); }
}

// Question no: 3 and 5
interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){ System.out.println("Jumping.."); }
    void bite(){ System.out.println("Biting.."); }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){ System.out.println("Eating...."); }
    public void sleep(){ System.out.println("Sleeping...."); }
}


public class CWH_Ch11_06_PracticeSet {
    public static void main(String[] args) {

        // Question no: 1 and 2
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changNib();

        System.out.println();

        // Question no: 3
        Human hu = new Human();
        hu.eat();
        hu.sleep();
        hu.jump();
        hu.bite();

        System.out.println();

        // Question no:5
        BasicAnimal ba = new Human();
//        ba.jump(); --> error as jump() is not in the BasicAnimal Interface
        Monkey m = new Human();
//        m.eat(); --> error as eat() is not in the Monkey class
    }
}
