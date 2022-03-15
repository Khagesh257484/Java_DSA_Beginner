package com.company.java.dsa.string;

public class Test {
    public static void main(String[] args) {
        String s="check";
        String s1="ch";
        String s2=s1.substring(0,2);
        if (s1.equals(s2)) {
            System.out.println("yes");
        }
        System.out.println(s2);
        if(s2==s1){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }
}
