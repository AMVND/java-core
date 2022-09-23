/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session1;

import java.util.Scanner;

/**
 *
 * @author LAPTOP
 */
public class tongso {
    public static void main(String[] args) {
        //Khai báo biến
        Integer n1;
        Float m1;
        Integer n2;
        Float m2;
        Float s1;
        Float s2;
        Float s3;
        
        System.out.println("Nhập số nguyên thứ nhất: ");
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        n2 = input.nextInt();
        System.out.println("Nhập số thực thứ nhất: ");
        m1 = input.nextFloat();
        System.out.println("Nhập số thực thứ hai: ");
        m2 = input.nextFloat();
        
        s3 = n1.floatValue() + n2.floatValue();
        s1 = n1 + m1;
        s2 = n2 + m2;
        System.out.println("so thực 1: " +m1);
        System.out.println("so thực 2: " +m2);
        System.out.println("n1 + m1  = " +s1);
        System.out.println("n2 + m2  = " +s2);
        System.out.println("n1 + n2  = " +s3);
    }
}
