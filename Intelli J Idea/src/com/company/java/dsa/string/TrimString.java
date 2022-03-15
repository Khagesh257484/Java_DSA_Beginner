package com.company.java.dsa.string;

/*
 You are given a character string A. You to trim(remove) both leading and trailing asterisk characters('*') in the string and return the resultant string.

 Input : A = "**h*e*l*lo*"
 Output : h*e*l*l*o

* */
public class TrimString {
    public static void main(String[] args) {
        String s = "**h*e*l*lo*";
        int length=s.length();
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<sb.length();i++){
            if(s.charAt(i)=='*'){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);

    }
}
