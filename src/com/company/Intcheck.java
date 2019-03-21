package com.company;
import java.util.Scanner;

public class Intcheck {

    public static void main(String[] args) {
        Scanner  scan=new Scanner(System .in);
        int  integer =scan.nextInt();
        if((integer>=20)&&(integer<=30)) {
            if (integer % 2 == 0) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
        }
        else
        {
            System.out.println(" integer is not in the range");
        }
    }
}
