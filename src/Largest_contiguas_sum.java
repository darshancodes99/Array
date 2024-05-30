public class Largest_contiguas_sum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3, -4, -5, 6, 7};
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
