import java.util.Scanner;

public class ScannerBuiltIn{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you full name: ");
        String name = sc.nextLine();
        System.out.println(name);

    }
}