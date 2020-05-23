package com.company;

public class HisCar implements CarInterface {

    public String model;

    public String color;

    public int speed;


    public HisCar(String m, int s, String c) {

        model = m;

        color = c;

        speed = s;
    }




    @Override
    public String gas(int g) {
        return "gas:" + g;
    }

    @Override
    public String brake(int b) {
        return "brake:" + b;
    }



    @Override
    public String description() {

        return "model:" + model + "    color:" + color + "    speed:" + speed;
    }

}