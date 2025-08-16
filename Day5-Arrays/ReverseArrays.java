package arrays;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverseArray(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
