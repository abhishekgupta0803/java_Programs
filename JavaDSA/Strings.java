public class Strings {
    public static void length(String str){
        System.out.println("Length of Str:"+str.length());
    }
    public static void charAtMeth(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void concatn(String str){
      String name = "Manu";
      String names = str +" "+name;
      System.out.println("Concatination:"+names); 
    }
    public static void main(String[] args) {
        String str = "Abhishek Gupta";
        length(str);
        charAtMeth(str);
        concatn(str);
    }
}
