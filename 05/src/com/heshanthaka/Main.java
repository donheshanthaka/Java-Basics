package com.heshanthaka;

public class Main {

    public static void main(String[] args){

        Prius prius01 = new Prius(100);
        System.out.println(prius01.getName());
        prius01.move(2,3);
        System.out.println(prius01.getCurrentVelocity());
    }
}
