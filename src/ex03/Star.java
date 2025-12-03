package ex03;
//*
//**
//***
//****
//*****

public class Star {
    public static void main(String[] args) {
        // 1차풀이 별 직접 찍어보기
        // 2차풀이 반복되는 과정을 정렬하기
        // 3차풀이 압축한 코드의 동일한 과정을 한번 더 압축하기
        // 번외 *은 String형이기에 결합연산자로 묶어버리면 끝
        String star ="";
        for(int i = 0 ; i < 5; i++)
            System.out.println(star += "*");
    }
}
