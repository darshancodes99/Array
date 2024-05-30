import java.util.Arrays;

public class small_count_in_new_array {
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 7, 9};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            newArr[i] = count;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
