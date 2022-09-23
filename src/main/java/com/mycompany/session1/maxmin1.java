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
public class maxmin1 {
    public static void main(String[] args) {
        Float n1;
        Float n2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        n1 = input.nextFloat();
        System.out.println("Nhap so thu 2: ");
        n2 = input.nextFloat();
        if (n1 > n2) {
            System.out.println("Số " +n1+ " lớn nhất");
        } else {
            System.out.println("Số " +n2+ " lớn nhất");
        }
    }
}
