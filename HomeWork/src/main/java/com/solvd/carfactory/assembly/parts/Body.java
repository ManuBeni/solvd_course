package com.solvd.carfactory.assembly.parts;

public class Body {
    private int doors;
    private String color;
    private int wheels;

    public Body(int doors,String color,int wheels){
        this.doors=doors;
        this.color=color;
        this.wheels=wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
