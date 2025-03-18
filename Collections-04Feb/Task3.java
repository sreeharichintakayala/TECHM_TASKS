import java.util.List;

public class Task3 {
    public static <T> int findElement(List<T> l1,T target){
        for(int i = 0; i < l1.size();i++){
            if(l1.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        List<Integer> intList = List.of(10,20,30,40,50);
        int targetInt = 20;
        int index = findElement(intList,targetInt);
        System.out.println("First occurence of " + targetInt + " is " + index + " position");
    }
}
