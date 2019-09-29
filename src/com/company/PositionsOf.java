package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int [][] matrix = new int [numbers[0]][numbers[1]];

        for (int i = 0; i <matrix.length ; i++) {
            int [] input=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //  String []input = sc.nextLine().split("\\s+");
            //for (int j = 0; j <input.length ; j++) {
            matrix[i]= input;

        }

        int num = Integer.parseInt(sc.nextLine());
        boolean isValid = false;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]==num){
                    System.out.println(i + " " + j);
                    isValid=true;
                }

            }


        }
        if(!isValid){
            System.out.println("not found");
        }
    }

}

