package com.company;

public class CWH_Ch6_Arrays2 {
    public static void main(String[] args) {

        int[] marks = {98, 96, 91, 88, 100};
        float[] marks2 = {98.5f, 96.5f, 91, 88.5f, 100};
        String [] family  = {"Anurag", "Ashutosh", "Harendra", "Asha"};

        System.out.println(marks.length); // Finding the length of the array

        for (int i = 0; i < family.length; i++) { // Accessing each element of the array
            System.out.println(family[i]);
        }
    }
}
