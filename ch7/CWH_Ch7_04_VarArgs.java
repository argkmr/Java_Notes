public class CWH_Ch7_04_VarArgs {

//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(/*int x,*/ int ...arr){  // This is the concept of varargs (variable arguments)
        int summ = 0;
        for (int i:arr){
            summ += i;
        }

        return summ;
    }

    public static void main(String[] args) {
        System.out.println("Sum of nothing is: "+ sum()); // One compulsory element is required due to x
        System.out.println("Sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("Sum of 4 5 and 8 is: "+ sum(4,5,8));
        System.out.println("Sum of 4 5 8 and 19 is: "+ sum(4,5,8,19));
    }
}
