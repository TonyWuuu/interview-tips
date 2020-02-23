package com.tony.interview;

class A {
    public A() {
        System.out.print("main.java.com.tony.interview.A gouzhao");
    }

    private static A a = new A();

    static {
        System.out.print("static");
    }

    {
        System.out.print("A1");
    }
}

public class Main extends A {
    public Main() {
        System.out.print("B");
    }

    public static void main(String[] args) {
        System.out.println("0000");
        Main b = new Main();
    }
}