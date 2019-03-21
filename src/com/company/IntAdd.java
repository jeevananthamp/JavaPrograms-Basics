package com.company;
import java.util.Scanner;

public class IntAdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String integers = scan.nextLine();
        char intg[] = integers.toCharArray();
        int arr = 0, sum = 0,res=0;
        int j = 0;
        for (int i = 0; i < integers.length(); i++) {
            if ((intg[i] != ' ') && (intg[i] <= 48) || (intg[i] > 57)) {
                System.out.print("Enter integer only..");res=0;
                break;
            }
            else {

                    if (intg[i] == ' ') {
                        sum = sum + arr;
                        arr = 0;

                    } else {
                        arr = (arr * 10) + Character.getNumericValue(intg[i]);

                    }

                    res=sum+arr;
                }
            }
        if(res>0)
        System.out.print(res);
    }
}