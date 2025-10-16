package com.korit.study.ch21;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton instance = new Singleton("Class Data");
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public void changeDate() {
        System.out.println("데이터를 변경 " + data);
    }

    public void deleteData() {
        System.out.println("데이터 삭제 " + data);
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton("Class Data");
        }
        return instance;
    }

    public static Singleton getSynchronizedInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton("Class Data");
                }
            }
        }
        return instance;
    }
}
