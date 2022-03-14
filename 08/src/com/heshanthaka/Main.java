package com.heshanthaka;

public class Main {
    public static void main(String[] args){
        CookPhone cookPhone = new CookPhone();
        cookPhone.call();
        cookPhone.move();
        cookPhone.dance();
        cookPhone.cook();
    }
}

abstract class BasePhone{
    public void call(){
        System.out.println("Calling...");
    }

//    public BasePhone() {
//    }

    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class MovePhone extends BasePhone{
    public void move(){
        System.out.println("Moving...");
    }
}

abstract class DancePhone extends MovePhone{
    public void dance(){
        System.out.println("Dancing...");
    }
}

class CookPhone extends DancePhone{
    public void cook(){
        System.out.println("Cooking...");
    }
}
