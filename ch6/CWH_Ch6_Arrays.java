package com.company;

import java.util.Scanner;

public class CWH_Ch6_Arrays {
    public static void main(String[] args) {

        int [] marks = new int[5]; // Another way is: int [] marks = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            marks[i] = sc.nextInt();
        }

        for (int i=0; i<5; i++){
            System.out.println(marks[i]);
        }
        float [] marks2 = {98.5f, 96.5f, 91, 88.5f, 100};
    }
}
