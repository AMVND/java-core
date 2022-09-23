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
public class ptbac2 {
    public static void main(String[] args) {
        Double a;
        Double b;
        Double c;
        Double x1;
        Double x2;
        Double x;
        Double delta;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        a = input.nextDouble();
        System.out.println("Nhap so thu hai: ");
        b = input.nextDouble();
        System.out.println("Nhap so thu ba: ");
        c = input.nextDouble();
        System.out.println("Phuong trinh co dang: "+a+"x^2 + "+b+"x +"+c+" = 0");
        delta = (b*b) -(4*a*c);
        if (delta ==0) {
            x = -b/(2*a);
            System.out.println("Phuong trinh co MOT NGHIEM DUY NHAT: "+x);
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem");
            System.out.println("Nghiem 1%.2f: "+x1);
            System.out.println("Nghiem 2%.2f: "+x2);
        }else {
            System.out.println("Phuong trinh VO NGHIEM");
        }
    }
}
