class IncOrder{

    //increasing order print number
    public static void incPrint(int n){
        if(n == 1){
            System.out.print(n +" ");
            return;
        }
        incPrint(n-1);
        System.out.print(n +" ");
    }

    public static void main(String args[]){
        int n = 5;
        incPrint(n);
    }
}