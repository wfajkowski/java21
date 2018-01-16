/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.util.StringTokenizer;

/**
 *
 * @author iwaf
 */
public class Birthday {
    public static void main(String[] args) {
        StringTokenizer token1;
        
        String birthDate =  "29/04/2016";
        
        token1 = new StringTokenizer(birthDate,"/");
        
        System.out.println(token1.nextToken());
        System.out.println(token1.nextToken());
        System.out.println(token1.nextToken());
    }
    
}
