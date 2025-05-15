import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        Iterator<String> itr=map.keySet().iterator();
        while (itr.hasNext()){
            String key = itr.next();
            System.out.println(key);
            map.put("Six",6);
        }

        System.out.println("Aftre modify List :"+map);
    }
}
