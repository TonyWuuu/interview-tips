package com.tony.interview.jvm;

/*
 * 子类
 */
public class JVMSons extends JVMParent {

    {
        System.out.println("son no static code block :" + count);
    }

    static {
        System.out.println("son static 1");
    }

    public static int count1;


    JVMSons() {
        System.out.println("son init:" + count);
    }

    static {
        System.out.println("son static 2");
    }

    public static void main(String[] args) {
        System.out.println("son main start");
        JVMSons a = new JVMSons();

    }

}