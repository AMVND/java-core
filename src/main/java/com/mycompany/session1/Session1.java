/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.session1;

import java.util.Scanner;

/**
 *
 * @author LAPTOP
 */
public class Session1 {

    public static void main(String[] args) {
        System.out.println("Nhập tên của bạn");
        Scanner input = new Scanner(System.in);
        String ten;
        ten = input.nextLine();
        
        System.err.println("Chào " +ten+ " Chúc bạn một ngày super tốt lành");
    }
}
