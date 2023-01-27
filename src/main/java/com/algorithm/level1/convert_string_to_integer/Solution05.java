package com.algorithm.level1.convert_string_to_integer;

// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
public class Solution05 {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
    // 실행 결과
    public static void main(String[] args) {
        Solution05 solution = new Solution05();
        System.out.println(solution.solution("-1234"));
    }
}
