## **[음양 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/76501)**

### **문제**

#### **문제 설명**

어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와

이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.

실제 정수들의 합을 구하여 return하도록 solution 함수를 완성해주세요.

#### **제한 조건**

-   absolutes의 길이는 1이상 1,000 이하입니다.
    -   absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
-   signs의 길이는 absolutes의 길이와 같습니다.
    -   sings\[i\]가 참이면 absolutes\[i\]의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

#### **입출력 예**

| absolutes | signs | result |
| --- | --- | --- |
| \[4 ,7, 12\] | \[true, false, true\] | 9 |
| \[1, 2, 3\] | \[false, false, true\] | 0 |

### **풀이**

```java
class Solution {
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
}
```

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fm98Ob%2FbtrXqsLDOcM%2Fxwqd6e8yKxID3aKdn6k8ok%2Fimg.png)

### **실행 결과**

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbWXC4K%2FbtrXn8mPKTa%2FLQjriyIGlrtrvx3YYkuJS0%2Fimg.png)