package com.company;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class fillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int number = Integer.parseInt(input[0]);
        String methodAB = input[1];
        int[][] matrixA = new int[number][number];
        int[][] matrixB = new int[number][number];
       // if(methodAB.equals("A")){
         //   MethodA(matrixA);
     //   }else {
         //   MethodB(matrixB);

       matrixB =  MethodB(matrixB);
      matrixA=  MethodA(matrixA);
        }


    static int[][] MethodA(int[][] matrixA) {
        int counter = 1;
        for (int col = 0; col < matrixA.length; col++) {
            for (int row = 0; row < matrixA[col].length; row++) {
                matrixA[row][col] = counter;
                counter++;

            }
        }
        return matrixA;
    }
    static int [][] MethodB(int [][] matrixB){
        int counter = 1;
        for (int col = 0; col <matrixB.length ; col++) {
            if(col%2==0){
                for (int row = 0; row <matrixB[col].length ; row++) {
                    matrixB[row][col]=counter++;
                }
            }else {
                for (int i = matrixB[col].length-1; i >0 ; i--) {
                   matrixB[i][col]=counter++;

                }


                }



        }

return matrixB;
        }

        }

