package com.Atyeti4.Interface;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Sit");

    }

    @Override
    public void left() {
        System.out.println("back");

    }

    @Override
    public void right() {
        System.out.println("fwd");

    }
}
