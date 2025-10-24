package com.korit.study.ch27;

public class Computer {
    private String cpu;
    private int ram;

    public Computer(int ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }
}
