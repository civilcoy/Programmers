package com.algorithm.level1.plus_yin_yang;

//어떤 정수들이 있습니다.
//이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
//이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
//실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
// sign[i]가 참이면 absolutes[i]가 양수, 거짓이면 음수
// signs의 길이는 absolutes의 길이와 같음
public class Solution07 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i< signs.length; i++){
            if (signs[i] == true){
                answer = answer + absolutes[i];
            }
            else {
                answer = answer - absolutes[i];
            }
        }
        return answer;
    }
    // 실행 결과
    public static void main(String[] args) {
        Solution07 sol = new Solution07();
        int[] absolutes = new int[]{4, 7, 12};
        boolean[] signs = {true, false, true};
        int answer = sol.solution(absolutes, signs);
        System.out.println(answer);
    }
}
// 다른 풀이
//class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//        for (int i=0; i<signs.length; i++)
//            answer += absolutes[i] * (signs[i]? 1: -1);
//        return answer;
//    }
//}

