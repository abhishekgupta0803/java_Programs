public class Transpose {
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                     {4,5,6}};
    
       //print original arry
       for(int i=0; i<2; i++){
        for(int j=0; j<3; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
       }

       //transpose
       int transpose[][] = new int[3][2];

       for(int i=0; i<3; i++){
        for(int j=0; j<2; j++){
            transpose[i][j] = arr[j][i];
        }
       }
       
       
       

       //transpose arry
       System.out.println("Transpose:");
       for(int i=0; i<3; i++){
        for(int j=0; j<2; j++){
            System.out.print(transpose[i][j]);
        }
        System.out.println();
       }

    }
}
