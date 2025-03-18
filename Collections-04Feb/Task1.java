public class Task1{
    public static void main(String[] args) throws Exception{
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {1,2,3,4,5};
        Integer[] arr3 = {1,2,3,4,6};
        System.out.println("Arrays 1 and 2 are " + areArraysEqual(arr1, arr2));
        System.out.println("Arrays 2 and 3 are " + areArraysEqual(arr2,arr3));
    }
    public static <T> boolean areArraysEqual(T[] arr1,T[] arr2){
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0;i < arr1.length;i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
}