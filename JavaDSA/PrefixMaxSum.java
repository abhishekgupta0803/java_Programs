public class PrefixMaxSum {
    public static void prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        int curr = 0;
        int maxSum =Integer.MIN_VALUE;
        //prefix
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            
            for(int j=i; j<arr.length; j++){
                int end = j;
                curr  = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < curr ){
                    maxSum = curr;
                }
            }
        }

        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        prefixSum(arr);
    }
}
