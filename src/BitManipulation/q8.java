package BitManipulation;

import java.util.Scanner;

//tell whether the number is power of two or not
public class q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        if((n&(n-1))==0)
            System.out.println("It is power of two");
        else
            System.out.println("It is not power of two");
    }
}
