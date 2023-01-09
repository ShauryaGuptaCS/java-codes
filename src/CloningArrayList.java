import java.util.ArrayList;
import java.util.Collections;
public class CloningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(9);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        ArrayList<Integer> sec=new ArrayList<>();
        sec.addAll(arr);
        Collections.sort(sec);
        System.out.println(sec);
    }
}
