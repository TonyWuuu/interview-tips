package com.tony.interview;

public class RevString {
    public static String rev(String s) {
        if (s == null){
            return null;
        }
        int len = s.length();
        StringBuilder ss = new StringBuilder();
        for (int i = len -1; i >= 0; i--){
             ss.append(s.charAt(i));
        }
        return ss.toString();
    }
}
