class WithinAClass{
    public int a=45;
    protected int b=65;
    int c=60;                               // Default
    private int d=12;

    public void getvals(){ // Allowed everything as we are inside a class
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class _01_AccessModifiresClassAndPackageIndependent{
    public static void main(String[] args){

        WithinAClass wc = new WithinAClass();
        System.out.println(wc.a);
        System.out.println(wc.b);
        System.out.println(wc.c);
        //System.out.println(wc.d); --> error, and also true if we are in the same package as well.
        // In order to access the private attributes we take help of 
        // Methods. Cuz within class it is allowed.

        System.out.println();

        wc.getvals();

    }
}