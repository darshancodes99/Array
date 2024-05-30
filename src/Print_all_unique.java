import java.sql.Array;
import java.util.Arrays;

public class Print_all_unique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3, 5, 5, 6};
        int count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            else {
                if (count == 0) {
                    System.out.println(arr[i]);
                }
                count = 0;
            }
        }


        if (count == 0){
            System.out.println(arr[arr.length - 1]);
        }
    }
}
