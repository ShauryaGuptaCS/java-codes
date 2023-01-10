package BitManipulation;

import java.util.Scanner;

//find the sum of nth row in a Pascal's Triangle
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
 */
public class q12 {
    public static void main(String[] args) {
        //for sum of nth row we have formula: pow(2,(n-1))
        //for sum of each row we have formula:pow(2,n)
        Scanner in =new Scanner(System.in);
        System.out.println("enter the nth row");
        int n=in.nextInt();
        System.out.println("Sum of nth row in Pascal's Triangle is:"+(1<<(n-1)));
    }
}
