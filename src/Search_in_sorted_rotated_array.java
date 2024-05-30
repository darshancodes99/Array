public class Search_in_sorted_rotated_array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int n = 5;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (arr[mid] == n){
                System.out.println("present");
                return;
            }

            if (arr[mid] >= arr[left]){
              if (arr[mid] > n && n >= arr[left]){
                  right = mid - 1;
              } else {
                  left = mid + 1;
              }
            } else {
                if (arr[mid] < n && n <= arr[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        System.out.println("not present");
    }
}
