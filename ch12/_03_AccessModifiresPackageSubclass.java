package Numbers.subPackage;
import Numbers.Adding.ImportClass;

class Child extends ImportClass{
    public void showVals(){
        System.out.println(a);
        System.out.println(b);
        //System.out.println(c); --> error: default
        //System.out.println(d); --> error: private
    }
} 

public class _03_AccessModifiresPackageSubclass{
    public static void main(String[] args){
        System.out.println("This is new file");

        Child ch = new Child();
        ch.showVals();

    }
}