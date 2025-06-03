public class MaxSubArry {
    public static void maxSum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                curSum = 0;
                for(int k=start; k<=end; k++){
                   curSum += arr[k];
                   if(maxsum < curSum ){
                    maxsum = curSum;
                   }
                }
                System.out.println(curSum);
            }
            System.out.println();
        }
        System.out.println("MAx sum:"+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxSum(arr);
    }
}
