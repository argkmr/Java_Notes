package Numbers.Adding;

// There can only be one public class inside the java file

public class ImportClass{
    public int a=45;
    protected int b=65;
    int c=60;                               
    private int d=12;

    public void printVals(){ 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args){
        System.out.println("Creating different new package");
    }
}