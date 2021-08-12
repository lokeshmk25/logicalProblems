package com.bridgelabz;

import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int n1=0,n2=1,n3;

        for(int i=2;i<=num;i++){
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }


    }
}
