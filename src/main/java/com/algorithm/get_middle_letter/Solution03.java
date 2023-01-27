package com.algorithm.get_middle_letter;

public class Solution03 {
    public String solution(String s) {
        String answer = "";
        answer = (s.length()%2==0) ?
                s.substring(s.length()/2-1, s.length()/2+1) : s.substring(s.length()/2, s.length()/2+1);
        return answer;
    }

    // 실행 결과
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        System.out.println(solution.solution("abcde"));
    }
}

// 다른 풀이법
//public class Solution03 {
//    public String solution(String s) {
//        String answer = "";
//        answer = s.substring((s.length()-1)/2, s.length()/2+1);
//        return answer;
//    }
//}
