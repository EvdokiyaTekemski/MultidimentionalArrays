package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(reader.readLine());
        int coll = Integer.parseInt(reader.readLine());

        char[][] firstMatrix = new char[row][coll];
        char[][] secondMatrix = new char[row][coll];

        fillMatrix(firstMatrix, reader);
        fillMatrix(secondMatrix, reader);

        printResult(firstMatrix, secondMatrix);
    }

    private static void printResult(char[][] firstMatrix, char[][] secondMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]) {
                    System.out.print(firstMatrix[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, BufferedReader reader) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            String[] array = getLineAsString(reader); //\\s+
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[j].charAt(0);
            }
        }
    }

    private static String[] getLineAsString(BufferedReader reader) throws IOException {
        return reader.readLine().split("\\s+");
    }
}