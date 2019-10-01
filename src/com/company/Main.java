package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //   static void PrintResult(int[][] matrixA,int [][] matrixB ){
    //     for (int row = 0; row <matrixA.length ; row++) {
    ///       for (int col = 0; col <matrixA[row].length ; col++) {
    //        System.out.print(Arrays.toString(matrixA[row]));
    //  }
    //System.out.println();

    //}

    //for (int i = 0; i <matrixB.length ; i++) {
    //  for (int j = 0; j <matrixB[i].length ; j++) {
    //    System.out.println(Arrays.toString(matrixB[i]));

    //}
    //System.out.println();
    //}





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");

        int first  = Integer.parseInt(input[0]);
        int second  = Integer.parseInt(input[1]);
         int [][] firstMatrix = new int [first][second];
        for (int i = 0; i <firstMatrix.length ; i++) {
            firstMatrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        String [] inputTwo = scanner.nextLine().split(" ");

        int firstTwo  = Integer.parseInt(input[0]);
        int secondTwo = Integer.parseInt(input[1]);
        int [][] secondMatrix = new int [first][second];
        for (int i = 0; i <secondMatrix.length ; i++) {
            secondMatrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        boolean isTrue = matricesAreEqual(firstMatrix,secondMatrix);
        if(isTrue){
            System.out.println("еqual");
        }else {
            System.out.println("not equal");
        }
    }
    static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) return false;
        for (int row = 0; row < firstMatrix.length; row ++) {
            if (firstMatrix[row].length != secondMatrix[row].length)
                return false;
            for (int col = 0; col < firstMatrix[row].length; col ++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) return false;
            }
        }
        return true;
    }

}
