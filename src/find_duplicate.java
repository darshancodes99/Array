public class find_duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        int n = 5;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        n = n * (n + 1) / 2;

        System.out.println(sum - n);
    }
}
