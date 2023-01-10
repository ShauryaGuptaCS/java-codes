package BitManipulation;

import java.util.Scanner;

//find pow(a,b)
public class q9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the base");
        int a=in.nextInt();
        System.out.println("enter the power");
        int b=in.nextInt();
        int value=(int)(Math.log(b)/Math.log(2))+1;
        int i=1,c=b,count=0,ans=1;
        while(i<=value){
            if((c&1)==1)
            {
                ans=ans*(int)Math.pow(a,((int)Math.pow(2,count)));
            }
            c=c>>1;
            count+=1;
            i+=1;
        }
        System.out.println("Answer is:"+ans);
    }
}
