package com.company;

public class MyCar extends Car {


    public MyCar(String m, int s, String c) {
        model = m;

        color = c;

        speed = s;
    }

    @Override
    public String description() {

        return "model:" + model + "    color:" + color + "    speed:" + speed;
    }

}