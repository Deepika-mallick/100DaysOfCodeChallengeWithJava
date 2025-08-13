package FuntionsAndMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValueExample {
    public static void main(String[] args) {
        //create an array
        int[] array = {23, 45, 67, 56, 89};
        change(array);
        System.out.println(Arrays.toString(array));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
