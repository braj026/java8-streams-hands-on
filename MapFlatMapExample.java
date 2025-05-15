import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapExample {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using map to square each number
        List<Integer>mappedNum=numbers.stream()
                .map(x -> x * x)
                .toList();
        System.out.println("Mapped Numbers: " + mappedNum);

        //Using map to add 10 to each number
        List<Integer>mappedNum2=numbers.stream()
                .map(x -> x+10)
                .toList();
        System.out.println("Mapped Numbers after add 10: " + mappedNum2);

        //Using map to convert each number to a string
        List<String>mappedNum3=numbers.stream()
                .map(x -> "Number: " + x)
                .toList();
        System.out.println("Mapped Numbers to String: " + mappedNum3);


        //New List of Straing
        List<String> stringList = List.of("ViBhu", "Chnadra", "Braj", "Sachin", "Rajesh");

        //Using map convert each string to uppercase
        List<String>mappedString = stringList.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Mapped String to Uppercase: " + mappedString);

        //Using map convert each string to lowercase
        List<String>mappedString2 = stringList.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("Mapped String to Lowercase: " + mappedString2);

        //Using map to get the length of each string
        List<Integer>mappedString3 = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("Mapped String Length: " + mappedString3);



        //Using flatMap to flatten a list of lists
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        List<Integer>flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);



    }
}
