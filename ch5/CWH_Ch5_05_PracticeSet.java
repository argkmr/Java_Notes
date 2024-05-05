import java.util.Scanner;

public class CWH_Ch5_05_PracticeSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question: 1
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        for (int i=num; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Question: 2
        System.out.print("How many even natural numbers you want to sum? : ");
        int evennum = sc.nextInt();
        int sum=0, i=1;
        while (i<=evennum){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("The sum is: "+sum);

        System.out.println();

        // Question: 3
        System.out.print("Enter the number of which you seek the factorial: ");
        int fact = sc.nextInt(), mul=1;
        for (int k=1; k<=fact; k++){
            mul *= k;
        }
        System.out.println("Factorial of the given number is: "+mul);

        System.out.println();

        // Question: 9
        int summ=0, j=1;
        while (j<=10){
            summ = summ + (8*j);
            j++;
        }
        System.out.println("The sum is: "+summ);

        System.out.println();

    }
}
