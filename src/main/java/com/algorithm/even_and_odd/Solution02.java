package com.algorithm.even_and_odd;
public class Solution02 {
    public String solution(int num) {
        String answer = "";
        if (num%2==0){
            answer = "Even";
        }
        else {
            answer = "Odd";
        }
        return answer;
    }
    // 실행 결과
    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        System.out.println(solution.solution(3));
        System.out.println(solution.solution(2));
    }
}
