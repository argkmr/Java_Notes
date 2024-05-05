import java.util.Scanner;

public class CWH_Ch2_PracticeSet {
    public static void main(String[] args) {

//        Question no: 2
        System.out.print("Enter the grade: ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        // Encrypting
        char encrypt = (char)(grade + 8);
        System.out.println("Encrypted: " + encrypt);
        // Decrypting
        char decrypt = (char)(encrypt - 8);
        System.out.println("Decrypted: " + decrypt);
        System.out.println();

//        Question no: 3 and 5
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(a>8);
        System.out.print("The value of expression 7*49/7+35/7 is:  ");
        System.out.println(7*49/7+35/7);

    }
}
