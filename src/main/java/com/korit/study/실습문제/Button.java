package com.korit.study.실습문제;

interface ClickListener {
    void onClick();
}

public class Button {
    private ClickListener listener;

    public void setListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }

}
