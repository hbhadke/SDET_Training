package com.atyeti.java;

import java.util.Scanner;

public class Loops {
    public  static  void forLoop(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter which table you want to print: ");
        int num = sc1.nextInt();
        for (int initlize=1;initlize<=10;initlize++){
            System.out.printf("%d * %d = %d",num,initlize,num*initlize);
            System.out.println("\n");
        }
    }
    public static  void whileLoop(){
       int i=2;
        while( i>10)
            System.out.println(i);
    }

    public static  void doWhile(){
        int i=2;

        do {
            System.out.println(i);
        }
        while(i<3);

    }
}
