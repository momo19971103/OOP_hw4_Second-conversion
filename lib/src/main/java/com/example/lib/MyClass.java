package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int hr,min,sec = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J���");
        int SEC = scanner.nextInt();
        hr = SEC/3600;
        min = (SEC%3600)/60;
        sec =  (SEC%3600)%60;
        System.out.printf("�ഫ�� %d �� %d �� %d ��",hr,min,sec);
    }
}
