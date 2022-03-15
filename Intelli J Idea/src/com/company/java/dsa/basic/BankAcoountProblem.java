package com.company.java.dsa.basic;

import java.util.Scanner;

public class BankAcoountProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int operation=sc.nextInt();

        // Operation loop
        for(int i=1;i<=operation;i++){
            int type=sc.nextInt();
            int amount2=sc.nextInt();
            if(type==1){
                amount+=amount2;
                System.out.println(amount);
            }else if(type==2){
                if(amount2>amount){
                    System.out.println("Insufficient Funds");
                }else{
                    amount-=amount2;
                    System.out.println(amount);
                }

            }
        }
    }
}
