public class StairCase {
    public static String stairCase(int arr[][],int key){
        int row = arr.length-1;
        int col = 0;
        while (row < arr.length && col >= 0) {
            if(arr[row][col] == key){
                return row+","+col;
            }
            if(arr[row][col] > key){
                row--;
            }else{
                col++;
            }

            
        }
        return "false";
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                   {15,25,35,45},
                   {27,29,37,48},
                   {32,33,39,50}};

        int key = 40;
        
        System.out.println(stairCase(arr, key));
    }
}
