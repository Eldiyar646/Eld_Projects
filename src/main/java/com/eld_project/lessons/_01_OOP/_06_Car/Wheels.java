package com.eld_project.lessons._01_OOP._06_Car;

public class Wheels {

    private String type;
    private int size;

    public Wheels(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "type: " + type + ", size: " + size;
    }
}
