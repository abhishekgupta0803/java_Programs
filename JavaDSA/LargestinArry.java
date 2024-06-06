import java.util.*;
public class LargestinArry {
    public static int largest(int arr[]){
        int lrgst = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(lrgst < arr[i]){
                lrgst = arr[i];
            }
            if(small > arr[i]){
                small = arr[i];
            }
        }
        System.out.println("Smallest is :"+small);
        return lrgst;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,11,9};
        System.out.println("Largest Array is:"+largest(arr));
    }
    
}

//time complex = O(N)