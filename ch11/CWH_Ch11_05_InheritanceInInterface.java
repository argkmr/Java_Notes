import com.sun.security.jgss.GSSUtil;

interface one{
    void meth1();
    void meth2();
}


// Just like in classes:
interface two extends one{
//    But remember not use extends using classes with interface, there you use implements.
    void meth3();
    void meth4();
}

class sampleAgain implements two{
    public void meth1(){ System.out.println("Meth1"); }
    public void meth2(){ System.out.println("Meth2"); }
    public void meth3(){ System.out.println("Meth3"); }
    public void meth4(){ System.out.println("Meth4"); }
}

public class CWH_Ch11_05_InheritanceInInterface {
    public static void main(String[] args) {

        sampleAgain sa = new sampleAgain();
        sa.meth1();
        sa.meth2();
        sa.meth3();
        sa.meth4();

    }
}
