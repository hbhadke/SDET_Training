package com.atyeti5.abstractInterface;

interface Flyable{
    void fly();
}

class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("with wing");
    }
}
class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with petrol");
    }
}
class FlyableRunner{
    public static void main(String[]args){

        Flyable [] flys ={new Bird(),new Aeroplane()};

        for(Flyable fly:flys){
            fly.fly();
        }
    }

}