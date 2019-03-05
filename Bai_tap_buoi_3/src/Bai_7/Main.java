/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_7;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    public static void main(String[] args) {
        int i, j, sum;
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] tong = new int[3][3];
        int[][] tich = new int[3][3];
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("-----------------");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("--------------------");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%3d ", b[i][j]);
            }
            System.out.println("");
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tong[i][j] = a[i][j] + b[i][j];
            }

        }
        for (i = 0; i < 3; i++) {
            sum = 0;
            for (j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    sum += a[i][k] * b[k][i];
                }
                tich[i][j] = sum;
            }

        }

        System.out.println("----------------------");
        System.out.println("tong cua hai ma tran la:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%3d", tong[i][j]);
            }
            System.out.println("");
        }
        System.out.println("tich cua hai ma tran la;");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%5d", tich[i][j]);
            }
            System.out.println("");
        }
    }
}
