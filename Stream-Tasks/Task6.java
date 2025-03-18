// package Stream-Tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Task6 {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Banana","Apple","Cherry");
        List<String> ascendingOrder = strings.stream().sorted().collect(Collectors.toList());
        List<String> descendingOrder = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(ascendingOrder);
        System.out.println(descendingOrder);
    }
    
}
