package BitManipulation;
//find ith bit a number
//Example-100001101  ith position from last is 2
//output is 0

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        System.out.println("enter the ith position");
        int pos=in.nextInt();
        int k,ans=n;
            ans=ans>>(pos-1);
        String bin=Integer.toBinaryString(n);
        System.out.println("Binary Value of a number is :"+ bin);

        System.out.println("Answer is");
        System.out.println(ans&1);

    }
}
