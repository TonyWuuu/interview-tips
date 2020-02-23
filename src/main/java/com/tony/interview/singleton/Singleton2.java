package com.tony.interview.singleton;

public class Singleton2 {
    private Singleton2(){

    }

    private static class SingleHolder{
        private static Singleton2 single2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingleHolder.single2;
    }

}
