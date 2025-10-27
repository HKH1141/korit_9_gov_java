package com.korit.study.실습문제;

public class ButtonMain {
    public static void main(String[] args) {
        Button button = new Button();

        // TODO: 여기에 익명 클래스를 사용하여 ClickListener 구현
         ClickListener clickListener = new ClickListener() {

             @Override
             public void onClick() {
                 System.out.println("버튼이 클릭되었습니다!");
             }

         };
         button.setListener(clickListener);


        button.click();
    }
}
