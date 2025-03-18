import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2{
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Hello", "World","Sreehari","Kabir","Jim");
        List<String> uppercaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowercaseStrings = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Original List : " + "\t" + strings );
        System.out.println("UpperCase strings are : " + uppercaseStrings);
        System.out.println("Lowercase strings are : " + lowercaseStrings);
    }
}