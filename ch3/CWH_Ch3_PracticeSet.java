import java.util.Scanner;

public class CWH_Ch3_PracticeSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want: ");
        String str = sc.nextLine();

        System.out.println("Lower case: "+str.toLowerCase()); // Que: 1
        System.out.println("Spaces -> Underscores: "+str.replace(" ", "_")); // Que: 2
        System.out.println("Formated letter: "+str.replace("<|name|>", "Harry")); // Que: 3
        System.out.println("Double space: "+str.indexOf("  ")); // Que: 4a
        System.out.println("Triple space: "+str.indexOf("   ")); // Que: 4b

    }
}
