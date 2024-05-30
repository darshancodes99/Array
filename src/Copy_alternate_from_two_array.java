import java.util.Arrays;

public class Copy_alternate_from_two_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 7, 8, 9, 10};
        int[] newArr = new int[arr1.length + arr.length];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            newArr[index++] = arr[i];
            newArr[index++] = arr1[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
