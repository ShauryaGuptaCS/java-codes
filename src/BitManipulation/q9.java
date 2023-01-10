package BitManipulation;

import java.util.Scanner;

//find pow(a,b) without using Math.pow function
public class q9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the base");
        int a=in.nextInt();
        System.out.println("enter the power");
        int b=in.nextInt();
        int value=(int)(Math.log(b)/Math.log(2))+1;
        int i=1,c=b,ans=1,base=a;
        while(i<=value){
            if((c&1)==1)
            {
                ans=ans*base;
            }
            base*=base;
            c=c>>1;

            i+=1;
        }
        System.out.println("Answer is:"+ans);
    }
}
