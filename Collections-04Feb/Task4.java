import java.util.ArrayList;
import java.util.List;
public class Task4 {
    public static <T> List<T> listReverse(List<T> l1){
        List<T> l2 = new ArrayList<T>();
        for(int i = l1.size() - 1;i >= 0;i--){
            l2.add(l1.get(i));
        }
        return l2;
    }
    public static void main(String[] args){
        List<Integer> l1= List.of(1,2,3,4,5);
        System.out.println(listReverse(l1));
        List<String> l2 = List.of("hello","world");
        System.out.println(listReverse(l2));
    }   
}
