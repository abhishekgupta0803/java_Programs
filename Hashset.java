import java.util.HashSet;
import java.util.Iterator;
public class Hashset {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        //add elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);

       

        if(set.contains(3)){
            System.out.println("Exist element");
        }

        if(set.remove(3)){
            System.out.println("item is deleted");
        }

        Iterator it = set.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
       
        System.out.println(set);
    }
}
