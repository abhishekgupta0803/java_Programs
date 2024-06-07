import java.util.Scanner;
public class Largestin2Darr {
    public static void largestFound(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if( max < arr[i][j] ){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element in :"+max);
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int arr[][] = new int [4][4];

        System.out.println("Enter Your Elements:");
        for(int  i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = s1.nextInt();
            }
        }
        
        largestFound(arr);

    }
}
