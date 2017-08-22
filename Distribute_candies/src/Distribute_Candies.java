import java.util.HashMap;

public class Distribute_Candies {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr) {
            hm.put(i, hm.getOrDefault(i,0) + 1);
        }
        System.out.println(arr.length / 2 > hm.size() ? hm.size() : arr.length / 2);
    }
}
