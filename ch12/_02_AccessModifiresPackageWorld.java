package Numbers.subPackage;
import Numbers.Adding.ImportClass;

public class _02_AccessModifiresPackageWorld{
    public static void main(String[] args){
        System.out.println("This is new file");
        ImportClass ic = new ImportClass();
        //ac.printVals();
        System.out.println(ic.a);
        //System.out.println(ic.b); --> error: protected
        //System.out.println(ic.c); --> error: default
        //System.out.println(ic.d); --> error: private

    }
}