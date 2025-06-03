public class CountingSort {
    public static void countSort(int arr[]){
        //max elem
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        // count  arr
        int count[] = new int[max + 1];

        //frequency
        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }

        
        int j = 0;
        for(int i=0; i<count.length; i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] ={2,3,1,1,7,8,2};
        countSort(arr);
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
