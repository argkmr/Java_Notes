import java.util.Scanner;

public class CWH_Ch7_05_Recursions {

    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want the factorial: ");
        int factNum = sc.nextInt();
        int factResult = fact(factNum);
        System.out.println("The factorial of the given number is: "+factResult);
    }
}
