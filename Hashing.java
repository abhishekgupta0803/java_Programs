import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        //insert value
        map.put("India", 200);
        map.put("china", 300);
        map.put("pok", 400);
        map.put("japan", 500);

        //search value
       if( map.containsKey("India")){
          System.out.println("Value Exist");
       }else{
        System.out.println("Not Exist");
       }

       //iteration

       for(Map.Entry<String,Integer> e : map.entrySet()){
         System.out.println(e.getKey());
         System.out.println(e.getValue());
       }

        // System.out.println(map);
    }
    
}
