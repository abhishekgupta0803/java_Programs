class Diagnoal{
    public static int dignalSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];

            if(i != arr.length-1-i)
                sum += arr[i][arr.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,2},
                     {3,4,5},
                     {6,7,8}};
       int opt =  dignalSum(arr);
       System.out.println(opt);
    }
}