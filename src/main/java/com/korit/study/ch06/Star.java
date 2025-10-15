package com.korit.study.ch06;

public class Star {
    public static void main(String[] args) {

//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i ; j++) {
                System.out.print(" ");
            }
            for (int f = 0; f < i + 1; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < i + 1; j++){
                System.out.print(" ");
            }
            for (int f = 0; f < 3 - i; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 2; k++) {
                System.out.print("*");
            }
//            for (int k = 0; k < (i < 2 ? i : i < n - 1 ? 1 : n - 1 - i); k++) {
//                System.out.print(" ");
//            }
            System.out.print(i == 0 || i == n - 1 ? "" : " ");

            for (int k = 0; k < i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int num = 15;
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (i * 2) + 1 :((num - i - 1) * 2) + 1);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2) );
        }
    }
}
