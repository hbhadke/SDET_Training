package com.Atyeti3.Abstract;

public abstract class AbstractRecipe {
 private  int value =10;
    public  void setUp(){
        getRoll();
        getCamera();
        getAction();
        
    }

    protected abstract void getRoll();

    protected abstract void getCamera();

    protected abstract void getAction();
}
