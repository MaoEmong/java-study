package ex06;

public class MyHash03 {
    public static void main(String[] args) {

        char[] arr = {'A','B','C'};

        int h = 0;

        // 스텝1
        int n = arr[0]; // 65
        h = h * 31 + n; //  h = 65

        // 스텝2
        n = arr[1];
        h = h *31 + n; // h = 2081

        // 스텝3
        n = arr[2];
        h = h *31 + n; // h = 64578

        System.out.println(h);
    }
}
