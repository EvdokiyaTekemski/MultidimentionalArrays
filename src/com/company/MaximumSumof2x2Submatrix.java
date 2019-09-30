package com.company;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int row = Integer.parseInt(input[0]);
        int coll = Integer.parseInt(input[1]);
        int[][] matrix = new int[row][coll];
        for (int i = 0; i <matrix.length ; i++) {
            String [] arr = scanner.nextLine().split(", ");
            for (int j = 0; j < arr.length; j++) {
                int num = Integer.parseInt(arr[j]);
                matrix[i][j]=num;
            }

            }

   int result =  MaxtrixSum(matrix);
        System.out.println(result);
        }
        static int MaxtrixSum(int [][]matrix){

        int maxSum=0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                for (int k = i; k < matrix.length; k++)
                    for (int l = j; l < matrix[i].length; l++) {


                        int tempSum = 0;
                        for (int m = i; m <= k; m++)
                            for (int n = j; n <= l; n++)
                                tempSum += matrix[m][n];


                        if (tempSum > maxSum)
                            maxSum = tempSum;

                    }
        return maxSum;
    }
}

