package com.tinhchisocannangcuacothe;
import java.util.Scanner;
public class Kiemtra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("1. Bat dau chuong trinh tinh chi so can nang cua co the");
        System.out.println("0. Exit");
        System.out.println("Enter 1 or 0");
        int so=scanner.nextInt();

        while (so!=0){

            System.out.println("Nhap can nang:");
            double weight=scanner.nextDouble();
            System.out.println("Nhap chieu cao:");
            double height=scanner.nextDouble();
            double bmi=weight/(height*height);
            if (bmi<18.5) System.out.println("bmi= "+bmi+" Underweight");
            else if (bmi<25.0) System.out.println("bmi= "+bmi+" Normal");
            else if (bmi<30.0) System.out.println("bmi= "+bmi+" Overweight");
            else System.out.println("bmi= "+bmi+" Obese");
        }
    }
}
