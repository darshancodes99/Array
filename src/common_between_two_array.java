public class common_between_two_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,8,4,5};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr1.length; j++){
                if (arr[i] == arr1[j]){
                    System.out.println(arr1[j]);
                }
            }
        }

    }
}
