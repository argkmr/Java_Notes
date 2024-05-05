import Numbers.Adding.ImportClass;

class Sub extends ImportClass{
    public void showVals(){
        System.out.println(a);
        System.out.println(b);
        //System.out.println(c); //--> error: default
        //System.out.println(d); //--> error: private
    }
} 

public class _03_AccessModifiresIndependentSubclass{
    public static void main(String[] args){
        System.out.println("This is new file");

        Sub s = new Sub();
        s.showVals();

    }
}