package BitManipulation;

import java.util.Scanner;

//find the right most set bit
public class q6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();

        int ans=n,i=1;
        while(i<=32){
            if((ans&1)==1){
                break;
            }

            ans=ans>>1;
            i+=1;
        }
        String bin=Integer.toBinaryString(n);
        System.out.println("Binary Value of a number is :"+ bin);
        if(i>32)
            System.out.println("Exceeds");
        else{
            System.out.println("Position is:"+i);
        }


    }
}
