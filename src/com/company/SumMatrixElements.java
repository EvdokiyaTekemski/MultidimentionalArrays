package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNumber = 0;
        String [] input = scanner.nextLine().split(", ");
        int row = Integer.parseInt(input[0]);
        int coll = Integer.parseInt(input[1]);

        int [][] matrix = new int [row][coll];
        for (int i = 0; i <matrix.length ; i++) {
            String [] array = scanner.nextLine().split(", ");
            for (int j = 0; j <array.length ; j++) {
                int num = Integer.parseInt(array[j]);
                matrix[i][j]= num;

            }

        }

        for (int i = 0; i <matrix.length ; i++) {
                //for (int number:matrix[i]
                  //   ) {
                    //sumNumber+=number;

            for (int j = 0; j <matrix[i].length ; j++) {
                sumNumber+=matrix[i][j];

            }
                }




        System.out.println(row);
        System.out.println(coll);
        System.out.println(sumNumber);
    }
}
