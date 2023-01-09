package BitManipulation;

import java.util.Scanner;

//Reset the ith bit
public class q5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        System.out.println("enter the ith position");
        int pos=in.nextInt();
        int k,ans=1;
        ans=~(ans<<(pos-1));
        System.out.println(Integer.toBinaryString(ans));
        String bin=Integer.toBinaryString(n);
        System.out.println("Binary Value of a number is :"+ bin);
        int value=n&ans;
        System.out.println("Answer is");
        System.out.println(Integer.toBinaryString(value));
    }
}
