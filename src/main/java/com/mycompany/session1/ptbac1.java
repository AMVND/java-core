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
public class ptbac1 {
    public static void main(String[] args) {
        Float a;
        Float b;
        Float x;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        a = input.nextFloat();
        System.out.println("Nhập số thứ hai: ");
        b = input.nextFloat();
        System.out.println("Phương trình có dạng: "+a+"x + "+b+"= 0");
        x = -b/a;
        System.out.println("Kết quả cần tìm là: "+x);
    }
}
