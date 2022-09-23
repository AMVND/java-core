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
public class maxmin2 {
    public static void main(String[] args) {
        Float n1;
        Float n2;
        Float n3;
        Float min;
        Float max;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        n1 = input.nextFloat();
        System.out.println("Nhap so thu 2: ");
        n2 = input.nextFloat();
        System.out.println("Nhap so thu 3: ");
        n3 = input.nextFloat();
        if (n1 > n2) {
            if (n1 > n3) {
                max = n1;
                System.out.println("Số " +max+ " lớn nhất");
            } else {
                max = n3;
                System.out.println("Số " +max+ " lớn nhất");
            }
        } else{
            if (n2 > n3) {
                max = n2;
                System.out.println("Số " +max+ " lớn nhất");
            } else {
                max = n3;
                System.out.println("Số " +max+ " lớn nhất");
            }
        }
    }
}
