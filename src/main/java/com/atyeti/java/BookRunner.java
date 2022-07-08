package com.atyeti.java;

public class BookRunner {
    public static void main(String[] args) {
Book artOfLiving = new Book();
Book cleanCode =  new Book();
Book mahabharat = new Book();

artOfLiving.setNoOfCopies(120);
cleanCode.setNoOfCopies(489);
mahabharat.setNoOfCopies(143);

artOfLiving.setNoOfCopies(100);
System.out.println(artOfLiving.increaseNoOfCopies(100));

        System.out.println(cleanCode.increaseNoOfCopies(100));
        System.out.println(mahabharat.increaseNoOfCopies(100));

    }
}