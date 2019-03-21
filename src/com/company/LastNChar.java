package com.company;
import java.util.Scanner;

public class LastNChar {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String  str=scan.next();
        int integer=scan.nextInt();
        char [] arr=str.toCharArray();
       char res[] =new char[arr.length];
        int j=0,i;

        for(i=arr.length-1;i>(arr.length-integer-1);i--)
        {
            res[j++]=arr[i];
           // System.out.println(arr[i]);

        }
        for (i=0;i<arr.length-integer;i++)
            System.out.print(arr[i]);
        for(i=0;i<integer;i++) {
            for (int k = j - 1; k >= 0; k--) {
                System.out.print(res[k]);
            }
        }
    }
}
