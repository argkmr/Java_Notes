import java.util.Scanner;

public class CWH_Ch14_NestedTryAndCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        try {
            while (flag) {
                System.out.println();
                System.out.print("Enter the index of the element: ");
                int idx = sc.nextInt();
                try {
                    int[] arr = {23, 54, 67};
                    try {
                        System.out.println("The element at index " + idx + " is: " + arr[idx]);
                        flag = false;
                    } catch (ArrayIndexOutOfBoundsException error) {
                        System.out.println();
                        System.out.println("Index out of range!");
                        System.out.println("Error occured in level 3");
                    }
                } catch (Exception error) {
                    System.out.println();
                    System.out.println("Error occured in level 2");
                }

            }
        }catch (Exception error){
            System.out.println();
            System.out.println("Error occured in level 1");
        }
    }

}
