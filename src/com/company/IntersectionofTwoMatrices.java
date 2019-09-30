package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int coll = Integer.parseInt(scanner.nextLine());

        char[][] first = new char[row][coll];
        char[][] second = new char[row][coll];
        char[][] result = new char[row][coll];
char inputArrays='a';
        for (int i = 0; i < first.length; i++) {
            String [] array= scanner.nextLine().split(" ");
            for (int j = 0; j <array.length ; j++) {
                for (String arrays:array
                     ) {
                    inputArrays += arrays.charAt(j);
                    first[i][j] = inputArrays;
                }
            }

        }
      //  for (int i=0; i <coll ; i++) {
        //    second[i] = scanner.toString().toCharArray();


        for (int i = 0; i < coll; i++) {
            for (int j = 0; j < first[i].length; j++) {
                if (first[i][j] == second[i][j]) {
                    result[i][j] = first[i][j];

                } else {
                    result[i][j] = '*';
                }

            }
        }
        System.out.println(Arrays.toString(result));
    }
}
