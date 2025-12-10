package ex08.ch02;

import java.util.Scanner;

public class ExamValid {

    int[] arr;

    public ExamValid() {
        this.arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
    }

    void searchArr(int index){
        System.out.println("찾으시는 배열 공간의 값은 : "+arr[index]);
    }

    // 문제 : 잘못된 인덱스 번호를 넣으면 "[0~2]까지 입력가능합니다"라고 출력해주세요!!
    // if를 사용하여 validation 체크하기
    public static void main(String[] args) {
        ExamValid examTry = new ExamValid();
        Scanner sc = new Scanner(System.in);
        System.out.println("찾고 싶은 배열의 index를 입력하세요");

        while (true){
            int index = sc.nextInt();

            // if 코드를 여기에 작성하세요.
            if(index < 0 || index > 2)
                System.out.println("[0~2]까지 입력 가능합니다");
            else
                examTry.searchArr(index);
        }
    }
}
