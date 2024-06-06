class PrintSubArray{
    public static void subArry(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int start = i;
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                int end = j;
              
                for(int k=start; k<=end; k++){
                   
                    sum += arr[k];
                }
                System.out.println(sum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArry(arr);
    }
}