package com.korit.study.ch05;

public class 연습문제4_2 {
    public static void main(String[] args) {

        //evens에 짝수숫자 배열 집어넣기
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evens = new int[0];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                int[] temp = new int[evens.length + 1];
                for (int j = 0; j < evens.length; j++) {
                    temp[j] = evens[j];
                }
                temp[temp.length - 1] = nums[1];
                evens = temp;
            }
        }
    }
}
