package hashmap;
import java.util.*;

public class basic {
    //all basic operations of hashmap are done in this class
    // Implementation details would go here
    //can be stored inform of(key,value) pair where key is unique
    public static void main(String[] args) {
        HashMap <String,Integer> hm= new HashMap<>();
        //insert
        hm.put("china",10);
      
        //get
          int population=hm.get("china");
          System.out.println("Population of China: " + population);
           //contains
            boolean hasChina=hm.containsKey("china");
            System.out.println("Has China: " + hasChina);

            //remove
            hm.remove("china");
            System.out.println("China removed from hashmap.");

            //size
            int size=hm.size();
            System.out.println("Size of hashmap: " + size);


            //empty
            boolean isEmpty=hm.isEmpty();
            System.out.println("Is hashmap empty: " + isEmpty);

            //clear
            hm.clear();
            System.out.println("Hashmap cleared.");

            //iteration in hasmap
            Set<String> keys=hm.keySet();
            for(String key: keys){
                System.out.println("Key: " + key + ", Value: " + hm.get(key));

                ///foreach loop
                hm.forEach((key,value)->{
                    System.out.println("Key: " + key + ", Value: " + value);
                });
            }
           }               
    
}
