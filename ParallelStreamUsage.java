import java.util.ArrayList;
import java.util.List;

public class ParallelStreamUsage {
    public static void main(String[] args) {

        List<Integer>num =new ArrayList<>();
        for (int i=0;i<100;i++){
            num.add(i);
        }
        System.out.println("Starting parallel stream");
        long startTime = System.currentTimeMillis();
        num.parallelStream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        });
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream: " + (endTime - startTime) + " milliseconds");


    }
}
