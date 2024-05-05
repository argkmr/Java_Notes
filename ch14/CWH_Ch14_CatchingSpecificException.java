package com.company;

import java.util.Scanner;

public class CWH_Ch14_CatchingSpecificException {
    public static void main(String[] args) {

        int [] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        try{
            for (int i=0; i<3; i++) {
                System.out.print("Enter the element number "+(i+1)+": ");
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the divisor: ");
            int div = sc.nextInt();
            System.out.print("Enter the index of the element: ");
            int idx = sc.nextInt();
            System.out.println("Dividing element "+arr[idx]+" by "+div+" = "+arr[idx]/div);

        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Array index range is 3, you have exceeded");
        }catch(ArithmeticException error){
            System.out.println("Can not divide by zero.....");
        }catch(Exception error){
            System.out.println("You have made some error check it once more");
        }
    }
}
