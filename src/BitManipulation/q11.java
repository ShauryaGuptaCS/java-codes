package BitManipulation;

import java.util.Scanner;

//find xor of values ranging from a to b
public class q11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Range is from a to b");
        System.out.println("enter the value of a");
        int a=in.nextInt();
        System.out.println("enter the value of b");
        int b=in.nextInt();
        int fa=xor(a-1);
        int fb=xor(b);
        System.out.println("Answer is:");
        System.out.println(fa^fb);
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
