import java.util.IntSummaryStatistics;
import java.util.List;

import static java.lang.Long.sum;

public class SummaryStatisticsExample {
    public static void main(String[] args) {

        List<Integer>num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using summary statistics to get count, sum, min, average, and max
        IntSummaryStatistics stats =num.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Range: " + (stats.getMax() - stats.getMin()));
        System.out.println("SUm of Even Number : " +num.stream().filter(x -> x%2==0)
                         .mapToInt(Integer::intValue)
                             .sum());
        System.out.println("SUm of Odd Number : " +num.stream().filter(x -> x%2!=0)
                .mapToInt(Integer::intValue)
                .sum());

    }
}
