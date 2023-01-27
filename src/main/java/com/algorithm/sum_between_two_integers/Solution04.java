package com.algorithm.sum_between_two_integers;

//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

public class Solution04 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++)
                answer += i;
        }
        return answer;
    }

    // 실행 결과
    public static void main(String[] args) {
        Solution04 solution = new Solution04();
        System.out.println(solution.solution(3,5));
    }
}

