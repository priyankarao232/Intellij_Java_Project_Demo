package com.intellij.demo;

public class Calculator {
    public static void main(String[] args){
        int a=10;
        int b=6;
        int add = add(a,b);
        int sub= a-b;
        System.out.format("Add %d + %d = %d",a,b,add);
        System.out.format("Add %d + %d = %d",a,b,sub);

    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int substract(int a, int b){
        return a-b;
    }



}
