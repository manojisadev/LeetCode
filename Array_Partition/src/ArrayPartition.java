import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(nums);
        int counter = 0;
        for(int i = 0; i < nums.length; i = i+2) {
            counter += nums[i];
        }
        System.out.println(counter);
    }
}
