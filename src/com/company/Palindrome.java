package com.company;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();
       // System.out.println(integer);
        int num=integer;

            int reverse=0;
            int evensum=0;
            while (num > 0) {
                int rem;
                rem=num%10;
                num /= 10;
                if(rem%2==0)
                {
                    evensum=evensum+rem;
                }
                reverse=reverse*10+rem;

            }
      //  System.out.println(reverse);

        System.out.println(evensum);
        if(integer==reverse) {
            if (evensum > 25)
                System.out.println(integer + " is palindrome and the sum of even numbers is greater than 25");
            else
                System.out.println(integer + " is palindrome and the sum of even numbers is less than 25");
        }
        else
            System.out.println(integer+"is not palindrome");
    }
}
