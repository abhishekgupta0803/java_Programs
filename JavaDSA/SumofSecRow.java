public class SumofSecRow {
    public static void sumRow(int arr[][]){
        int row = 1;
        int col = arr[0].length;
        int sum = 0;
        for(int j=0; j<col; j++){
             sum += arr[row][j] ;
        }
        System.out.println("Sum of Sec Row :"+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        sumRow(arr);
    }
}
