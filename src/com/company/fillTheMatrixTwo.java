package com.company;

import java.util.Scanner;

public class fillTheMatrixTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int number = Integer.parseInt(input[0]);
        String methodAB = input[1];
        int[][] matrix = new int[number][number];


        if(methodAB.equals("A")){
            matrix = getMatrixA(number);
        }else {
            matrix= getMatrixB(number);
        }

        getPrintMatrix(matrix);
    }

    private static void getPrintMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();

        }
    }

    private static int[][] getMatrixB(int number) {
        int [][] matrixB = new int[number][number];
        int counter = 1;
        for (int col = 0; col <matrixB.length ; col++) {
            if(col%2==0){
                for (int row = 0; row <matrixB[col].length ; row++) {
                    matrixB[row][col]=counter++;
                }
            }else {
                for (int i = matrixB[col].length-1; i >=0 ; i--) {
                    matrixB[i][col]=counter++;

                }


            }



        }

        return matrixB;
    }


    private static int[][] getMatrixA(int number) {
        int [][] matrixA = new int[number][number];
        int counter = 1;
        for (int col = 0; col < matrixA.length; col++) {
            for (int row = 0; row < matrixA[col].length; row++) {
                matrixA[row][col] = counter;
                counter++;

            }
        }
        return matrixA;
    }
}
