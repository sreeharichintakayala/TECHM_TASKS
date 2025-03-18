import java.util.List;

public class Task2 {
    public static void main(String[] args){
        // Integer[] arr = {1,2,3,4,5,6};
        // System.out.println("The sum of Even numbers is " + sumEven(arr));
        // System.out.println("The sum of Odd Numbers is " + sumOdd(arr));
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8);
        sumEvenOdd(intList);
    }
    public static <T extends Number> void sumEvenOdd(List<T> numbers){
        double evenSum = 0;
        double oddSum = 0;
        for(T number : numbers){
            double val = number.doubleValue();
            if(val%2 == 0){
                evenSum += val;
            }else{
                oddSum += val;
            }
        }
        System.out.println("Sum of Even numbers : " + evenSum);
        System.out.println("The sum of Odd Numbers: "+ oddSum);
    }
}
