package com.algorithm.level1.add_missing_number;

//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
public class Solution06 {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        answer = 45 - sum;
        return answer;
    }

    // 실행 결과
    public static void main(String[] args) {
        Solution06 sol = new Solution06();
        int[] numbers = new int[]{1,2,3,4,6,7,8,9,0};
        int answer = sol.solution(numbers);
        System.out.println(answer);
    }
}

// 다른 풀이
//public class Solution06 {
//    public int solution(int[] numbers) {
//        int answer = 45;
//        for(int a : numbers){
//            answer -= a;
//        }
//        return answer;
//    }
//}
