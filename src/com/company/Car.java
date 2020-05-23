package com.company;

public abstract class Car {

    public String model;

    public String color;

    public int speed;


    public String gas(int g){
        return "gas:" + g;

    }
    public String brake(int b){
        return "brake:" + b;

    }
    public abstract String description();

}