import java.util.ArrayList;
import java.util.List;

public class StreamBasic {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(33);
        list.add(24);
        list.add(15);
        list.add(60);
        list.add(27);
        list.add(18);

        //filter element which is greater then 30
        List<Integer>list1=list.stream()
                .filter(x-> x>30)
                .toList();
        System.out.println("Filtered :"+list1);

        //filter element which is even numbr
        List<Integer>list2=list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println("Even numbers :"+list2);

        //filter element which is odd in list
        List<Integer>list3=list.stream()
                .filter(x -> x % 2 != 0)
                .toList();
        System.out.println("Odd numbers :"+list3);

        //sort element in accending order
        List<Integer>list4=list.stream().sorted().toList();
        System.out.println("Element in acceding order : "+list4);

        //sort in decending order
        List<Integer>list5=list.stream().sorted((a, b )-> b- a).toList();
        System.out.println("Element in decending order : "+list5);
    }
}
