import java.util.Arrays;

public class copy_reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[index++] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
