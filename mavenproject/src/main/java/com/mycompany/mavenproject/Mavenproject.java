/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject;

/**
 *
 * @author IT20
 */
import java.util.*;
public class Mavenproject {
     
    public static void main(String[] args) {
        System.out.println("Leap year!");
        Scanner sc = new.Scanner();
        int year = sc.nextInt();
        if ((year % 4 ==0 && year % 4  !=0)||(year % 400 ==0)){
            System.out.println(year+" is a Leap year");
        }
        else{
            System.out.println(year+" is nt a Leap year!");
        }
        
   }
}
