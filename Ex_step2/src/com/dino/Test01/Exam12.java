package com.dino.Test01;
/*
 *12. 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.

 *
 */
public class Exam12 {

    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];  // 숫자 1부터 4까지의 개수를 저장할 배열

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i] - 1]++; // 각 숫자의 개수를 세는 부분
        }
        //i = 0  answer[i] 값: 1, counter[1 - 1] 증가 → {1, 0, 0, 0}
        //i = 1  answer[i] 값: 4, counter[4 - 1] 증가 → {1, 0, 0, 1}
        //i = 2  answer[i] 값: 4, counter[4 - 1] 증가 → {1, 0, 0, 2}
        //i = 3  answer[i] 값: 3, counter[3 - 1] 증가 → {1, 0, 1, 2}

        for (int i = 0; i < counter.length; i++) {
            System.out.print((i + 1) + ": "); // 숫자의 레이블 출력
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*"); // 해당 숫자의 개수만큼 '*' 출력
            }
            System.out.println(); // 줄바꿈
        }
    }
}