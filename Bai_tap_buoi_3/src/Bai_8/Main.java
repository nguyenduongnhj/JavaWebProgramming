package Bai_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j;
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        boolean flag = true;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    if (matrix[i][j] == 1) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
        }
        boolean flag2 = true;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                } else {
                    flag2 = false;
                    break;
                }
            }
        }
        boolean flag3 = true;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (matrix[i][j] == matrix[i][j]) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        System.out.println("=============");

        if (flag) {
            System.out.println("Ma tran vua nhap la ma tran don vi");
        } else {
            System.out.println("Ma tran vua nhap khong la ma tran don vi");
        }

        if (flag2) {
            System.out.println("Ma tran vua nhap la ma tran khong");
        } else {
            System.out.println("Ma tran vua nhap khong la ma tran khong");
        }
        if (flag3) {
            System.out.println("Ma tran vua nhap la ma tran doi xung");
        } else {
            System.out.println("Ma tran vua nhap khong la ma tran doi xung");
        }
    }
}
