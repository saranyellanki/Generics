package com.bridgelabz.uc1_intMaxOfThree;

import java.util.Scanner;

public class Maximum {
    Integer max = (int)Math.pow(-2,31);
    public void intMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        Integer num1 = sc.nextInt();
        System.out.println("Enter second number");
        Integer num2 = sc.nextInt();
        System.out.println("Enter third number");
        Integer num3 = sc.nextInt();
        int maximum = num1.compareTo(max);
        if(maximum > 0){
            max = num1;
        }
        maximum = num2.compareTo(max);
        if(maximum > 0){
            max = num2;
        }
        maximum = num3.compareTo(max);
        if (maximum > 0){
            max = num3;
        }
        System.out.println("Maximum of three : "+max);
    }
    public static void main(String[] args) {
        Maximum obj = new Maximum();
        obj.intMax();
    }
}
