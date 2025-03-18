// package Stream-Tasks;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,2,3,5,6,7,7,1);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Original List : " + numbers);
        System.out.println("Unique List after removing duplicates : "+uniqueNumbers);
    }
}
