package com.company;

public class Main {

    public static void main(String[] args) {


        MyCar BMW = new MyCar("x5", 160, "black");


        System.out.println(BMW.gas(100));


        System.out.println(BMW.brake(50));


        System.out.println(BMW.description());





        HisCar Daewoo = new HisCar("Lanos", 90, "silver");


        System.out.println(Daewoo.gas(250));


        System.out.println(Daewoo.brake(120));


        System.out.println(Daewoo.description());

    }

}
