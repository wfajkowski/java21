package com.java21days;

public class Investor{
    public static void main(String[] args) {
        float total = 14000;
        total = total+(total*.4F);
        total = total-1500F;
        total = total+(total*.12F);
        System.out.println(total);
    }
}