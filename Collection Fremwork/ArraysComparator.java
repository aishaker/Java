import java.util.*;

class My implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1<i2) return 1;
        if(i1>i2) return -1;
        return 0;
    }
}
public class ArraysComparator {
    public static void main(String[] args) {
        // int a[]={2,3,5,4,1,6,8,7};
        // int b[]={2,3,5,4,1,6,8,7};
        
        // int c[] = Arrays.copyOf(a, 6);
        // Arrays.sort(c);
        // System.out.println(Arrays.binarySearch(c, 8));
        Integer a[] = {2,3,5,4,1,6,8,7};
        Arrays.sort(a, new My()); // revers order
        // Arrays.sort(a);//increasing order
        for(var x:a){
            System.out.println(x);
        }
    }
}