package BitManipulation;

import java.util.Scanner;

//find nth magic number
//1=001(5^3*0 +5^2*0+ 5^1*0)
public class q7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        int c=n,ans=0,i,count=1;
        int value=(int)(Math.log(n)/Math.log(2))+1;
        System.out.println(value);
        while(count<=value){
            ans=ans+(c&1)*(int)Math.pow(5,count);
            c=c>>1;
            count++;
        }
        System.out.println("number is:"+Integer.toBinaryString(n));
        System.out.println("magic number is:"+ans);

    }
}
