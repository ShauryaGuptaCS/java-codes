package BitManipulation;

import java.util.Scanner;



// xor of values from 0 to a
//example 5
//0^1^2^3^4^5
public class q10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int a=in.nextInt();
        System.out.println("Answer is:"+xor(a));

    }

    private static int xor(int a) {
        if(a%4==0)
            return a;
        else if(a%4==1)
            return 1;
        else if(a%4==2)
            return a+1;
        else
            return 0;
    }
}
