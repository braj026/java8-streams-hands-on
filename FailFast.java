import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            Integer value=itr.next();
            System.out.println(value);
            list.add(value);
        }
    }
}
