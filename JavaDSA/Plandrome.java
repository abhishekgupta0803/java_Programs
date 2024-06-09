public class Plandrome {
    public static boolean checkPlandrome(String str){
        int len = str.length();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str  = "mmamm";

        System.out.println(checkPlandrome(str));
        
    }
}
