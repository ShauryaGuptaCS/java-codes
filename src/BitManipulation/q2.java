package BitManipulation;
//Input array=[2,3,4,1,2,1,3,6,4]
//Output-6
//return the unique element in the array
public class q2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,1,3,6,4,6,8};
        int ans=0,i;
        for( i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }

}
