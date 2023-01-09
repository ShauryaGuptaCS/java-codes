package BitManipulation;

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n=in.nextInt();
        if((n&1)==1)
            System.out.println("number is odd");
        else
            System.out.println("number is even");
    }
}
