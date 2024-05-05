package com.company;

public class CWH_Ch6_ForEachLoop {
    public static void main(String[] args) {

        float[] marks2 = {98.5f, 96.5f, 91, 88.5f, 100};
        System.out.println("Using the for each loop: ");
        for (float element:marks2){           // Python: for element in marks2:
            System.out.println(element);
        }
    }
}
