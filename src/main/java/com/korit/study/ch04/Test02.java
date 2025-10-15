package com.korit.study.ch04;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score < 90 && score >= 80) {
            System.out.println("B");
        } else if (score < 80 && score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
