public class CWH_Ch7_01_Methods {

    void logic(int x, int y){               // Non static method
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.print(x+" "+y);
    }

    static void logic2(int x, int y){       // Static method
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.print(x+" "+y);
    }

    public static void main(String[] args) {
        CWH_Ch7_01_Methods meth = new CWH_Ch7_01_Methods();
        int a=2, b=8;
//      Non static method therefore we used object to access the method.
        meth.logic(a,b); // Passes a copy to the method.
        System.out.println();
        System.out.print(a+" "+b); // That's why original values did not swap

        System.out.println();
        logic2(3,5); // Static method therefore we did not use any object.
    }
}
