import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
public class Task1 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10,20,40,30,50);
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        if(average.isPresent()){
            System.out.println("The average is " + average);
        }else{
            System.out.println("The average cannot be calculated due to an empty List");
        }
    }
    
}
