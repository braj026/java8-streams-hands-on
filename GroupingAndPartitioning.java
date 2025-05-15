import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioning {
    public static void main(String[] args) {

        List<String>friends = List.of("Braj", "Chandra", "Vibhu", "Rajesh", "Sachin", "Saurabh", "Vikash", "Vishal");

        Map<Character, List<String>> grouped = friends.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Grouped by first character: " + grouped);

        Map<String, List<String>> partitioned = friends.stream()
                .collect(Collectors.groupingBy(name -> name.length() > 5 ? "Long" : "Short"));
        System.out.println("Grouped by length: " + partitioned);

        Map<Boolean, List<String>> partitionedByLength = friends.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 5));
        System.out.println("Partitioned by length: " + partitionedByLength);

        Map<Boolean, List<String>> partitionedByFirstLetter = friends.stream()
                .collect(Collectors.partitioningBy(name -> name.startsWith("V")));
        System.out.println("Partitioned by first letter: " + partitionedByFirstLetter);

        Map<Boolean, List<String>> partitionedByFirstLetterAndLength = friends.stream()
                .collect(Collectors.partitioningBy(name -> name.startsWith("V") && name.length() > 5));
        System.out.println("Partitioned by first letter and length: " + partitionedByFirstLetterAndLength);

    }
}
