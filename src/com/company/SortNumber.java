package com.company;
import java.util.Scanner;

public class SortNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // System.out.println(integer);
        int numarray[]=new int[10000];
        int j=0;

        int res = 0;
        int evensum = 0;
        while (num > 0) {
            int rem;
            rem = num % 10;
            num /= 10;
            if (rem % 2 == 0) {
                evensum = evensum + rem;
            }
            numarray[j++]=rem;

        }
        for(int i=0;i<j;i++)
        {
            for(int k=i+1;k<j;k++) {
                if (numarray[i]<numarray[k]) {
                   int temp=numarray[i];
                   numarray[i]=numarray[k];
                   numarray[k]=temp;
                }
            }
        }
        for(int i=0;i<j;i++)
            res=res*10+numarray[i];
            System.out.println("Sorted number in non-increasing order :"+res);
        System.out.println("Sum of even numbers :"+evensum);
        if(evensum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}