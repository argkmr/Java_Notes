package com.company;

import java.util.Scanner;

public class CWH_Ch6_MultidimensionalArray {
    public static void main(String[] args) {

        int [][] flats = new int[2][4]; // 2-D Array
        // A building with two floors (ground and first) with 4 flats each
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[0][3] = 103;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;
        flats[1][3] = 203;

        for (int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int [][][] flats2 = new int[2][4][2]; // 3-D Array
        // A building with two floors with four flats each, and each flat has 2 rooms
        // Rest remains similar.....................


    }
}
