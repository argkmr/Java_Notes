import java.util.Scanner;

public class CWH_Ch3_Strings {
    public static void main(String[] args) {
        String name = "Harry is a good boy";
        System.out.println(name);
        int a = 454;
        float b = 45.65f;
        System.out.printf("The value of a is %d and the value of b is %10.3f", a, b);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your first name: ");
        String str = sc.next();
        System.out.println("Your first name is: "+str);
    }
}
