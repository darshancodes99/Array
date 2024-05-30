public class Binary_search_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 6;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == n) {
                System.out.println("present");
                return;
            } else if (n > arr[mid]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("not present");

    }
}
