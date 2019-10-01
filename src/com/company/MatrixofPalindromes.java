package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int cow = scanner.nextInt();

        char[][] matrixLetters = new char[row][cow];
        char symbol = 'a';
        char symbol2 = 'a';
        char symbol3 = 'a';
        char result = '0';
        for (int i = 0; i < matrixLetters.length; i++) {
            for (int j = 0; j < matrixLetters[i].length; j++) {
                if (j == 0) {
                    for (int k = 1; k <= 3; k++) {
                        System.out.print(symbol);
                    }
                } else {
                    for (int k = 1; k <= 3; k++) {

                        if (k % 2 == 0) {
                            symbol2++;
                            System.out.print(symbol2);

                        } else {
                            System.out.print(symbol);
                        }
                    }
                }
                System.out.print(" ");
            }
            symbol++;
            symbol2 = symbol;
            System.out.println();
        }


    }
}
