package com.korit.study.ch04;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("어린이입니다.");
        } else if (age > 12 && age < 18) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}
