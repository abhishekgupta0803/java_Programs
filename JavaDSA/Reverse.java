public class Reverse {
    public static void reverseArry(int arry[]){
        int start = 0,end = arry.length-1;
        while (start < end) {
            int temp = arry[start];
            arry[start] = arry[end];
            arry[end] = temp;
            
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int arry[]={1,2,7,4,9}; 
        reverseArry(arry);
        for(int i=0; i<arry.length; i++){
            System.out.println(arry[i]);
        }
    }    
}
