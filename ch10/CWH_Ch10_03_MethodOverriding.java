class A{
    public int x;

    public int  method1(){
        return 8;
    }

    public void method2(){
        System.out.println("This is method2 of class A....");
    }
}

class B extends A{
    public int y;

    public int method3(){
        return 5;
    }

    @Override // This keyword is not necessary but it's a good practice to use it to avoid future confusions
    public void method2(){
        System.out.println("This is method2 of class B....");
    }

}

public class CWH_Ch10_03_MethodOverriding {
    public static void main(String[] args) {

        A a = new A();
        a.method2();
        B b = new B();
        b.method2();

    }
}
