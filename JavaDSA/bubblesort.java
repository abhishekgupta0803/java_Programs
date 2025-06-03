public class bubblesort {
    public static void bubblesort(int arr []){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {4,1,2,8,6};
        bubblesort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
