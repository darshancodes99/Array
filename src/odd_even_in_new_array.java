import java.util.Arrays;

public class odd_even_in_new_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length];

        int index = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                newArr[index++] = j;
            }
        }

        for (int j : arr) {
            if (j % 2 == 0) {
                newArr[index++] = j;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
