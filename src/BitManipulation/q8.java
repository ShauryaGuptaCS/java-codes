package BitManipulation;

import java.util.Scanner;

//tell whether the number is power of two or not
public class q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int value=(int)(Math.log(n)/Math.log(2))+1;
        int c=n,count=0,i=1;
        while(i<=value){
            if((c&1)==1)
                count+=1;
            i+=1;
            c=c>>1;
        }
        if(count==1)
            System.out.println("It is power of two");
        else
            System.out.println("It is not power of two");
    }
}
