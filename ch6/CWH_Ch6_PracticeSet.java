package com.company;

import java.util.Scanner;

public class CWH_Ch6_PracticeSet {
    public static void main(String[] args) {

//         Question: 1
        float[] marks2 = {98.5f, 96.5f, 91, 88.5f, 100};
        float sum=0;
        for (int i=0; i<5; i++){
            sum += marks2[i];
        }
        System.out.println("Sum of the marks is: "+sum);

        System.out.println();

//         Question: 2
        int[] marks = {98, 96, 91, 88, 100};
        int markToBeChecked = 78, i;
        for (i=0; i<marks.length; i++){
            if (marks[i]==markToBeChecked){
                System.out.println("It is present!");
                break;
            }

            if(i==marks.length-1){
                System.out.println("It is not present!");
            }
        }

        System.out.println();

//         Question: 3
        float[] marksPhysics = {98.5f, 96.5f, 91, 88.5f, 100};
        float summ=0;
        for (int j=0; j<5; j++){
            summ += marksPhysics[j];
        }
        System.out.println("Average of the marks in physics is: "+(sum/(marksPhysics.length)));

        System.out.println();

//         Question: 4
        int [][] mat1 = new int[2][3];
        int [][] mat2 = new int[2][3];
        int [][] matSum = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int k=0; k<2; k++){
            for (int l=0; l<3; l++){
                System.out.print("Enter element for mat1["+k+"]["+l+"] and mat2["+k+"]["+l+"]: ");
                mat1[k][l] = sc.nextInt();
                mat2[k][l] = sc.nextInt();
            }
        }

        for (int k=0; k<2; k++){
            for (int l=0; l<3; l++){
                System.out.println("matSum["+k+"]["+l+"] = "+ (mat1[k][l]+mat2[k][l]));
            }
        }

        System.out.println();

//         Question: 5
        int [] arr = {1,2,3,4,5};
        int temp, n = arr.length;
        for (int m=0; m<n/2; m++){
            temp  = arr[m];
            arr[m] = arr[n-m-1];
            arr[n-m-1] = temp;
        }

        for (int m=0; m<n; m++){
            System.out.print(arr[m]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();

//         Question: 6 and 7
        int [] arr2 = {6,3,9,1,2,5};
        int size = arr2.length, max = arr2[0], min = arr2[0];
        for (int p=0; p<size; p++){
            if (max<arr2[p]){
                max = arr2[p];
            }

            if(min>arr2[p]){
                min = arr2[p];
            }
        }
        System.out.println("Maximum element is "+max+" and minimum element is "+min);

        System.out.println();

        // Question: 8 (Harry's code)
        int [] arr3 = {1,2,2,2,2,4,5};
        int flag = 1, arrSize = arr3.length;
        for (int q=0; q<arrSize-1; q++){
            if (arr3[q]>arr3[q+1]) {
                flag = 0;
                break;
            }
        }

        if (flag==1){
            System.out.println("sorted");
        }else {
            System.out.println("not sorted");
        }

//        My code for question number 8:
//        int [] arr3 = {1,1,2,2,2,2,3,3,3,3,1,1,1};
//        int flag = 0, arrSize = arr3.length;
//        for (int q=0; q<arrSize-1; q++){
//            if (arr3[q]<=arr3[q+1]){
//                flag = 1;
//            }else{
//                flag = 0;
//                System.out.println("No the array is not sorted");
//                break;
//            }
//
//            if (q==(arrSize-2) && (flag==1)){
//                System.out.println("Yes the array is sorted");
//                break;
//            }else if (q==(arrSize-2) && (flag!=1)){
//                System.out.println("No the array is not sorted");
//                break;
//            }
//        }


    }
}
