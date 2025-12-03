package algo;

public class ChangeData2 {
    public static void main(String[] args) {
        // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} -> {10, 9, 8, 7, 6, 5, 4, 3, 2, 1} reverse
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int temp = 0;

        int a1 = arr.length;
        int a2 = 0;
        int row = arr.length / 2;

        for (int i = 0; i < row; i++) {
            a1--;
            temp = arr[a1];
            arr[a1] = arr[a2];
            arr[a2] = temp;
            a2++;
        }


//        for (int i = 0; i < arr.length / 2; i++) {
//            temp = arr.length - i;
//            arr[arr.length - i - 1] = arr[i];
//            arr[i] = temp;
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
