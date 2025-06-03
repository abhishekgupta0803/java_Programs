class Kadanes{
    public static void maxinSubarry(int arr[]){

        int cursum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            cursum += arr[i];
            if(cursum < 0){
                cursum = 0;
            }
            max = Math.max(cursum,max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]= {-1,-2,-1,6};
        maxinSubarry(arr);
    }
}

//time complexity O(n)