package algo;

public class Snail01 {
    public static void main(String[] args) {
        SnailPrint(5, 5);
    }

    public static void SnailPrint(int w, int h) {
        int left = 0;                       // 왼쪽 시작 지점
        int right = w;                      // 오른쪽 시작 지점
        int top = 0;                        // 위쪽 시작 지점
        int bottom = h;                     // 아래쪽 시작 지점
        int max = w * h + 1;                // 배열 크기(찍어야 될 숫자의 마지막 값)
        int current = 1;                    // 현재 찍고 있는 숫자

        int[][] arr = new int[h][w];        // 값이 들어갈 2차원 배열

        // 현재 찍고있는 숫자가 마지막 값에 도달할 떄 까지 반복
        while (current < max) {
            // 0,0 시작지점 / 왼쪽에서 오른쪽으로 우선 진행
            for (int i = left; i < right; i++) {
                // 혹시 현재값이 최대값과 같아지거나 커지면 종료
                if (current >= max) break;

                // 높이는 top으로 고정 넓이만 이동
                arr[top][i] = current;
                current++;
            }

            // 왼쪽에서 오른쪽으로 이동이 끝나면 top은 다음 줄로 이동
            top++;

            // 그다음 위에서 아래로
            for (int i = top; i < bottom; i++) {
                // 혹시 현재값이 최대값과 같아지거나 커지면 종료
                if (current >= max) break;

                // 넓이는 right로 고정 높이만 이동
                arr[i][right - 1] = current;
                current++;
            }

            // 위에서 아래로 이동이 끝나면 오른쪽 값은 왼쪽으로 1칸 이동
            right--;

            // 그다음 오른쪽에서 왼쪽으로
            for (int i = right - 1; i >= left; i--) {
                // 혹시 현재값이 최대값과 같아지거나 커지면 종료
                if (current >= max) break;

                // 높이는 고정 넓이만 움직임
                arr[bottom - 1][i] = current;
                current++;
            }

            // 오른쪽에서 왼쪽으로 이동이 끝나면 bottom이 한칸 위로 올라가야됨
            bottom--;

            // 그다음 아래에서 위로
            for (int i = bottom - 1; i >= top; i--) {
                // 혹시 현재값이 최대값과 같아지거나 커지면 종료
                if (current >= max) break;

                arr[i][left] = current;
                current++;
            }
            // 아래에서 위로 이동이 끝나면 left가 오른쪽으로 한칸 이동
            left++;

        }

        // 숫자 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
