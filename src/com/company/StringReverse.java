package com.company;
import java.util.Scanner;

public class StringReverse{

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        char arr[]=str.toCharArray();
        int l=0,r=arr.length-1;
        for(int i=l,j=r;i<j;i++,j--)
        {
             char temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
        }
        int i;
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]);
    }
}
