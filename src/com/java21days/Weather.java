package com.java21days;

public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.err.println(fah + " stopni Fahrenheita to ...");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " stopni Celsjusz\n");
        
        float cel = 33;
        System.err.println(cel + " stopnie Celsjusza to ...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " stopni Fahrenheita");
    }
}