package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []firstMatrixDim = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[][] firstMarix = new int[firstMatrixDim[0]][firstMatrixDim[1]];

        for (int row = 0; row < firstMarix.length; row++) {
            String[] inputData = sc.nextLine().split("\\s+");
            firstMarix[row] = new int[inputData.length];

            for (int coll = 0; coll < inputData.length; coll++) {
                int number = Integer.parseInt(inputData[coll]);
                firstMarix[row][coll] = number;

            }


        }
        int []secondMatrixDim = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[][] secondMarix = new int[secondMatrixDim[0]][secondMatrixDim[1]];
        for (int row = 0; row < secondMarix.length; row++) {
            String[] inputData = sc.nextLine().split("\\s+");
            secondMarix[row] = new int[inputData.length];

            for (int coll = 0; coll < inputData.length; coll++) {
                int number = Integer.parseInt(inputData[coll]);
                secondMarix[row][coll] = number;

            }

        }

        if(firstMatrixDim[0]!=secondMatrixDim[0]){
            System.out.println("not equal");
            return;
        }
        boolean areEqual=true;
        for (int row=0;row<firstMarix.length;row++){
            boolean equal = firstMarix[row].length==secondMarix[row].length;
            if(!equal){
                System.out.println("not equal");
                return;
            }
            for (int col = 0; col <firstMarix[row].length ; col++) {
                int firstValue = firstMarix[row][col];
                int secondVaLUE = secondMarix[row][col];

                if(firstValue!=secondVaLUE){
                    System.out.println("not equal");
                    return;
                }

            }
        }
        if (areEqual){
            System.out.println("equal");;
        }
    }
}
