public class CWH_Ch7_06_PracticeSet {

    // Question: 5
    static int fib(int n){
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Question: 7
    static void printRows(int n){
        if (n==0){
            return;
        }
        System.out.print("* ");
        printRows(n-1);
    }

    static void pattern(int num, int rows){
        if (num==0){
            return;
        }
        printRows(rows);
        System.out.println();
        pattern(num-1, rows+1 );
    }

    // Question: 8
    static void printRowsQue8(int n){
        if (n==0){
            return;
        }
        System.out.print("* ");
        printRows(n-1);
    }

    static void patternQue8(int num, int rows){
        if (num==0){
            return;
        }
        printRowsQue8(rows);
        System.out.println();
        patternQue8(num-1, rows-1 );
    }

    public static void main(String[] args) {
        System.out.println("The fib number is: "+fib(5));
        System.out.println();
        pattern(5, 1);
        System.out.println();
        patternQue8(5, 5);


    }
}
