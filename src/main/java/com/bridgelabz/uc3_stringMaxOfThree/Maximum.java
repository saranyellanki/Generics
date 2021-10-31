package com.bridgelabz.uc3_stringMaxOfThree;

import java.util.Scanner;

public class Maximum {
    String max = "";
    public void stringMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String  string1 = sc.next();
        System.out.println("Enter second string");
        String  string2 = sc.next();
        System.out.println("Enter third string");
        String  string3 = sc.next();
        int maximum = string1.compareTo(max);
        if(maximum > 0){
            max = string1;
        }
        maximum = string2.compareTo(max);
        if(maximum > 0){
            max = string2;
        }
        maximum = string3.compareTo(max);
        if (maximum > 0){
            max = string3;
        }
        System.out.println("Maximum of three : "+max);
    }
    public static void main(String[] args) {
        Maximum obj = new Maximum();
        obj.stringMax();
    }
}
