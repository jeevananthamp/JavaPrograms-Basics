package com.company;
import java.util.*;

public class FindCharTyp {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        char c = scan.next().charAt(0);
        if((c >= 65)&&(c <=  90))
            System.out.println("CAPITAL LETTER");
        else if(c>=48&&c<=57)
            System.out.println("Digits");
        else if(c>=97&&c<=122)
            System.out.println("Samll letter");
        else
            System.out.println("Special Symbols");

    }
}
