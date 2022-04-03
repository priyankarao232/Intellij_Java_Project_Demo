package com.intellij.demo;

public class Calculator {
    public static void main(String[] args){
        int a=10;
        int b=6;
        int add = add(a,b);
        int sub= subtract(a, b);
        int mul=multiply(a,b);
        int div= division(a,b);
        int mod= modulus(a,b);
        System.out.format("Add %d + %d = %d \n",a,b,add);
        System.out.format("Sub %d - %d = %d\n",a,b,sub);
        System.out.format("Mul %d * %d = %d\n",a,b,mul);
        System.out.format("Div %d / %d = %d\n",a,b,div);
        System.out.printf("Mod %d %% %d = %d\n",a,b,mod);

    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }

    public static int division(int a, int b){
        return a/b;
    }
    public static int modulus(int a, int b){
        return a%b;
    }

}
