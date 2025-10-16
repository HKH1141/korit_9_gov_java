package com.korit.study.ch21;

public class ClassC {
    public void run() {
        Singleton.getInstance().changeDate();
        Singleton.getInstance().deleteData();
    }
}
