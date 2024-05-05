public class CWH_Ch7_03_MethodOverloading {

    /* Note: METHOD OVERLOADING CAN BE ACHIVED ONLY IF THE PARAMETERS ARE DIFFERENT AND THE 
             DATA TYPES NOT THE RETURN TYPE.  */

    static void foo(){
        System.out.println("This is without any argument");
    }

    static void foo(int a){
        System.out.println("This is with 1 argument and the argument passed is: "+ a);
    }

    static int foo(int a, int b){      // This is valid as the number of arguments are different
        System.out.println("This is with 2 argument and the arguments passed is: "+ a+" and "+b);
        return 0;
    }

//    static void foo(int a, int b){      // This is invalid as the number of arguments are same and the return type is different
//        System.out.println("This is with 2 argument and the arguments passed is: "+ a+" and "+b);
//    }



    public static void main(String[] args) {
        foo();
        foo(54);
        foo(56, 74);
    }
}
