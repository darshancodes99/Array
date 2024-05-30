import java.util.Arrays;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8};
        int[] arr1 = {2, 3, 5, 7};
        int[] newArr = new int[arr1.length + arr.length];

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                newArr[index++] = arr[i];
                i++;
            } else {
                newArr[index++] = arr1[j];
                j++;
            }
        }

        while (i < arr.length){
            newArr[index++] = arr[i];
            i++;
        }

        while (j < arr.length){
            newArr[index++] = arr1[j];
            j++;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
