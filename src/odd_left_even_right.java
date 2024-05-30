import javax.swing.*;
import java.util.Arrays;

public class odd_left_even_right {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] % 2 != 0){
                left++;
            } else if (arr[right] % 2 == 0){
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
