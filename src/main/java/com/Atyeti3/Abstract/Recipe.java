package com.Atyeti3.Abstract;

public class Recipe extends AbstractRecipe{

    @Override
    protected void getRoll() {
        System.out.println("GetRoll");
    }

    @Override
    protected void getCamera() {
System.out.println("GetCamera");
    }

    @Override
    protected void getAction() {
System.out.println("GetACTION");
    }
}
