import java.util.Arrays;
public class DuplicateElem {
    public static int duplElem(int arr[]){
    
        Arrays.sort(arr);
        int a =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[i+1]){
                a = arr[i];
                break;
            }
        }
        return a;
    }
    public static void main(String args[]){
        int arr[]= {1,5,2,8,1,6,9};
        System.out.println(duplElem(arr));
    }
    
}
