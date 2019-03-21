package com.company;
import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>=65 && arr[i]<=90) || (arr[i]>=97 && arr[i]<=122))
            {
                if(arr[i]=='a'|| arr[i]=='A')
                    System.out.println("Vowels");
                else if(arr[i]=='e'|| arr[i]=='E')
                    System.out.println("Vowels");
                else if(arr[i]=='i'|| arr[i]=='I')
                    System.out.println("Vowels");
                else if(arr[i]=='o'|| arr[i]=='O')
                    System.out.println("Vowels");
                else if(arr[i]=='u'|| arr[i]=='U')
                    System.out.println("Vowels");
                else
                    System.out.println("Consonants");
            }
            else
            {
                System.out.println("Sorry...Enter a Character");
            }
        }

    }
}