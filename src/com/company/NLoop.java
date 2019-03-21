package com.company;
import java.util.Scanner;

public class NLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();
        int num=1;
        for(int i=0;i<integer;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(num+" ");
            }
            num++;
        }
    }
}