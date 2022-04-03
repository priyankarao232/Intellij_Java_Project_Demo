package com.intellij.demo;

public class Calculator {
    public static void main(String[] args){
        int a=10;
        int b=6;
        int add = add(a,b);
        int sub= substract(a, b);
        int mul=multiply(a,b);
        int mod= modulus(a,b);
        System.out.format("Add %d + %d = %d",a,b,add);
        System.out.format("Add %d + %d = %d",a,b,sub);
        System.out.format("Mul %d * %d = %d",a,b,mul);
        System.out.printf("Mod %d %% %d = %d",a,b,mod);
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int substract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }

    public static int modulus(int a, int b){
        return a%b;
    }

}
