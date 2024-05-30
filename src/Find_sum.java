public class Find_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 9;
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] + arr[right] == sum){
                System.out.println("present");
                return;
            } else if (sum > arr[left] + arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("not present");
    }
}
