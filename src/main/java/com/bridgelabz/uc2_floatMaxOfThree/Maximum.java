package com.bridgelabz.uc2_floatMaxOfThree;

import java.util.Scanner;

public class Maximum {
    Float max = (float)Math.pow(-2,31);
    public void floatMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        Float num1 = sc.nextFloat();
        System.out.println("Enter second number");
        Float num2 = sc.nextFloat();
        System.out.println("Enter third number");
        Float num3 = sc.nextFloat();
        float maximum = num1.compareTo(max);
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
        obj.floatMax();
    }
}
