package algo;

public class ChangeData3 {
    public static void main(String[] args) {
        // Sort 정렬(오름차순) - 버블정렬
//        int[] arr = {7,4,2,3,1,5,6};
        int[] arr = {2, 1, 3, 4};
        int temp;

        // 버블정렬
        /*
        // 1차 풀이
// 0,1 비교 -> 참 -> 스왑{2,3,1}
if (arr[0] > arr[1]) {
    temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
}
// 1,2 비교 -> 참 -> 스왑{2,1,3}
if (arr[1] > arr[2]) {
    temp = arr[1];
    arr[1] = arr[2];
    arr[2] = temp;
}
// 0,1 비교 -> 참 -> 스왑{1,2,3}
if (arr[0] > arr[1]) {
    temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
}
         */
        /*
        // 2차 풀이
int a = 0;
int b = 1;

// 0,1 비교 -> 참 -> 스왑{2,3,1}
if (arr[a] > arr[b]) {
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
a++;
b++;
// 1,2 비교 -> 참 -> 스왑{2,1,3}
if (arr[a] > arr[b]) {
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
a = 0;
b = 1;
// 0,1 비교 -> 참 -> 스왑{1,2,3}
if (arr[a] > arr[b]) {
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
         */
        /*
        // 3차 풀이
int a = 0;
int b = 1;
for (int i = 0; i < 2; i++) {
    if (arr[a] > arr[b]) {
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    a++;
    b++;
}
a = 0;
b = 1;
// 0,1 비교 -> 참 -> 스왑{1,2,3}
if (arr[a] > arr[b]) {
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
         */
        /*
        4차 풀이
int a;
int b;

a = 0;
b = 1;
for (int i = 0; i < 2; i++) {
    if (arr[a] > arr[b]) {
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    a++;
    b++;
}
a = 0;
b = 1;
for(int i = 0 ; i < 1; i++)
{
    // 0,1 비교 -> 참 -> 스왑{1,2,3}
    if (arr[a] > arr[b]) {
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    a++;
    b++;
}
         */
        /*
        // 5차 풀이
int a;
int b;
int c = 2;

for(int j = 0 ; j < 2; j++)
{
    a = 0;
    b = 1;
    for (int i = 0; i < c; i++) {
        if (arr[a] > arr[b]) {
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        a++;
        b++;
    }
    c--;
}
         */
        /*
 // 6차 풀이
 for(int j = 0 ; j < arr.length - 1; j++)
 {
     for (int i = 0; i < arr.length - 1 - j; i++) {
         if (arr[i] > arr[i+1]) {
             temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
         }
     }
 }
*/
        /*
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
         */

        // 삽입정렬
        // {2,1,3,4}
        /*
        // 1번풀이
        // 2번째 숫자부터 정렬 시작(앞에서 부터 정렬을 시작하기 때문)
        index = arr[1];
        for (int i = 0; i < 1; i++) {
            if (index < arr[i]) {
                temp = arr[i];
                arr[i] = index;
                arr[1] = temp;
                break;
            }
        }
        // 3번째 숫자 정렬
        index = arr[2];
        for (int i = 0; i < 2; i++) {
            if (index < arr[i]) {
                temp = arr[i];
                arr[i] = index;
                arr[2] = temp;
                break;
            }
        }
        // 마지막 숫자 정렬
        index = arr[3];
        for (int i = 0; i < 3; i++) {
            if (index < arr[i]) {
                temp = arr[i];
                arr[i] = index;
                arr[3] = temp;
                break;
            }
        }
         */
        /*
        // 2번풀이
        // 2번째 숫자부터 정렬 시작(앞에서 부터 정렬을 시작하기 때문)
        int a = 1;

        index = arr[a];
        for (int i = 0; i < a; i++) {
            if (index < arr[i]) {
                temp = arr[i];
                arr[i] = index;
                arr[a] = temp;
                break;
            }
        }
        a++;
        // 3번째 숫자 정렬
        index = arr[a];
        for (int i = 0; i < a; i++) {
            if (index < arr[i]) {
                temp = arr[i];
                arr[i] = index;
                arr[a] = temp;
                break;
            }
        }
        // 마지막 숫자 정렬
        index = arr[a];
        for (int i = 0; i < a; i++) {
            if (index < arr[i]) {
                temp = arr[i];
                arr[i] = index;
                arr[a] = temp;
                break;
            }
        }
         */
        /*
        // 3번풀이
        int a = 1;
        int b = 3;

        for (int k = 0; k < b; k++) {
            index = arr[a];
            for (int i = 0; i < a; i++) {
                if (index < arr[i]) {
                    temp = arr[i];
                    arr[i] = index;
                    arr[a] = temp;
                    break;
                }
            }
            a++;
        }
         */
        /*
        // 4번풀이
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < k + 1; i++) {
                if (arr[k + 1] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[k + 1];
                    arr[k + 1] = temp;
                    break;
                }
            }
        }
         */


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
