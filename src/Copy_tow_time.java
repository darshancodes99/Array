import java.util.Arrays;

public class Copy_tow_time {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length * 2];


        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
            newArr[arr.length + i] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
