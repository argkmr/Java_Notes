import Numbers.Adding.ImportClass;

public class _02_AccessModifiresIndependentWorld{
    public static void main(String[] args){

        ImportClass imc = new ImportClass();
        System.out.println(imc.a);
        //System.out.println(imc.b); //--> error: protected
        //System.out.println(imc.c); //--> error: default
        //System.out.println(imc.d); //--> error: private
    }
}