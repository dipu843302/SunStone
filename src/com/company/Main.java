package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount");
        float n=scanner.nextFloat();
        if (n<=50000){
            System.out.println("Income tax is 0 rupees");
        }
        float temp;
        float pay1;
        float pay2;
        float pay3;
        if (n>50000 && n<=60000){
             temp=n-50000;
             pay1=temp/10;
            System.out.println("Income tax is "+ pay1+ " rupees");
        }
        if (n>60000 && n<=150000){
            temp=n-60000;
            pay2=(temp*20)/100+1000;
            System.out.println("Income tax is "+ pay2+ " rupees");
        }
        if (n>150000){
            temp=n-150000;
            pay3=(temp*30)/100+19000;
            System.out.println("Income tax is "+ pay3+ " rupees");
        }
    }
}
