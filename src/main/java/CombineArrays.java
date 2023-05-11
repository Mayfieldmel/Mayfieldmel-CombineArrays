import java.util.*;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        List<Integer> combinedList = new ArrayList<>();
        for (Integer i : arr1) {
        combinedList.add(i);
        }
        for (Integer i : arr2) {
            combinedList.add(i);
            }

       
        int[] combinedArr = combinedList.stream().mapToInt(i->i).toArray();
        return combinedArr;
       


      
    }
}
