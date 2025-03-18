// package Stream-Tasks;

import java.util.Arrays;
import java.util.List;
public class Task3 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOfEven = numbers.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
        int sumOfOdd = numbers.stream().filter(n -> n%2 == 1).mapToInt(Integer::intValue).sum();
        System.out.println("The sum of Even numbers"+"\t" + sumOfEven);
        System.out.println("The sum of odd numbers" + "\t" + sumOfOdd);
    }
}
