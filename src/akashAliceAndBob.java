import java.util.ArrayList;
import java.util.Scanner;

//2 3 4 5 7 11
//least split

public class akashAliceAndBob {
    public int gcd(int a,int b){
        int min=Math.min(a,b);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        int i,gc=1;
        for(i=2;i<=min;i++)
        {
            if(a%i==0 && b%i==0){
                if(i%gc==0){
                    gc=i;
                }
                else{
                    gc=i*gc;
                }
            }
        }
        list.add(gc);
        System.out.println(list);
        return gc;
    }
    public  int splitmin(int arr[]){
        int ans[]=new int[arr.length+1];
        ans[arr.length]=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]=ans[i+1]+1;
            for(int j=i+1;j<arr.length;j++){
                if(gcd(arr[i],arr[j])>1){
                    ans[i]=Math.min(ans[i],ans[j+1]+1);
                }
            }
        }
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"  ");
        }
        System.out.println();
        return ans[0];

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=in.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        akashAliceAndBob ob=new akashAliceAndBob();
        System.out.println(ob.splitmin(arr));


    }
}
