class DecOrder{

    //Dec order print number
    public static void DecPrint(int n){
        if(n == 1){
            System.out.print(n +" ");
            return;
        }

         System.out.print(n +" ");
         DecPrint(n-1);
       
    }

    public static void main(String args[]){
        int n = 5;
        DecPrint(n);
    }
}