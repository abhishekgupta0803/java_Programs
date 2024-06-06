public class LinearSrch{
    public static int linrSrch(String menu[], String key){
        for(int i=0; i<menu.length; i++){

            if(menu[i] == key){
                return i;
            }
        }

        return -1;

    }
    public static void main(String args[]){
        String menu[]= {"samosa","dosa","momos","chowmin"};
        String key = "samosa";

        int value = linrSrch(menu, key);

        if(value == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key Found at index of:"+value);
        }
    }
}