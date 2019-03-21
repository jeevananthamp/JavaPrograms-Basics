
package com.company;

import java.util.*;
 public class GuessNumber {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);
        int flag=0;
        System.out.println("Enter the number With in the Range of 100");
        Scanner scan=new Scanner(System.in);
        while(flag==0) {
            int num = scan.nextInt();
            if (num == rand_int1) {
                System.out.println("Guessed correctly");
                flag = 1;
            }
            else if (num < rand_int1)
                System.out.println("Guessed is less than original number");
            else
                System.out.println("Guessed is greater than original");
        }
    }
}
