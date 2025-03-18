// package Stream-Tasks;
import java.util.Arrays;
import java.util.List;
public class Task5 {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Apple","Banana","Avocado","Grape");
        char startingLetter = 'A';
        long count = strings.stream().filter(s -> !s.isEmpty() && s.charAt(0) == startingLetter).count();
        System.out.println("Number of strings starting with " + startingLetter+ " is " + count);
    }
}
