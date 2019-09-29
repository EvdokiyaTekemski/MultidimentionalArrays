package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //For matrix one
        int[] dimensions = getDimensions(scanner);
        int rowsMatrixOne = dimensions[0];
        int colsMatrixOne = dimensions[1];

        int[][] matrixOne = new int[rowsMatrixOne][];
        for (int i = 0; i < rowsMatrixOne; i++) {
            int[] line = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .limit(colsMatrixOne)
                    .toArray();
            matrixOne[i] = line;
        }

        //For matrix two
        dimensions = getDimensions(scanner);
        int rowsMatrixTwo = dimensions[0];
        int colsMatrixTwo = dimensions[1];

        int[][] matrixTwo = new int[rowsMatrixTwo][];
        for (int i = 0; i < rowsMatrixTwo; i++) {
            int[] line = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .limit(colsMatrixTwo)
                    .toArray();
            matrixTwo[i] = line;
        }

        //We call method for check that matrices are equals
        boolean isEqual = matricesAreEqual(matrixOne, matrixTwo);

        System.out.println(isEqual ? "equal" : "not equal");
    }

    private static int[] getDimensions(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}