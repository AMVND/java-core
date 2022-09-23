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
public class SinhVien {
    public static void main(String[] args) {
        System.out.println("Insert your name: ");
        Scanner input = new Scanner(System.in);
        String hoten;
        hoten = input.nextLine();
        System.out.println("Insert your age: ");
        Integer tuoi;
        tuoi = input.nextInt();
        System.out.println("Insert your diem ly thuyet: ");
        Float diemlt;
        diemlt = input.nextFloat();
        System.out.println("Insert your diem thuc hanh: ");
        Float diemth;
        diemth = input.nextFloat();
        Float diemtb;
        diemtb = (diemlt + diemth)/2 ;
        System.out.println("=================================");
        System.out.println("Xin chao " +hoten);
        System.out.println("Thong tin cua ban la: ");
        System.out.println("Ho va ten: " +hoten);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Diem ly thuyet: " +diemlt);
        System.out.println("Diem thuc hanh: " +diemth);
        System.out.println("Diem trung binh: " +diemtb);
        System.out.println("Chuc ban hoc tap that tot");
    }
}
