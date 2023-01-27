## **[짝수와 홀수](https://school.programmers.co.kr/learn/courses/30/lessons/12937)**

### **문제**

#### **문제 설명**

정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

#### **제한 조건**

-   num은 int 범위의 정수입니다.
-   0은 짝수입니다.

#### **입출력 예**

| num | return |
| --- | --- |
| 3 | "Odd" |
| 4 | "Even" |

### **풀이**

```java
class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 ==0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        return answer;
    }
}
```
[!image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbaWDAx%2FbtrXmRezVSZ%2FJlyTnJyDcqR31hD5V3oLkK%2Fimg.png)

### **실행 결과**
[!image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FceE6Wf%2FbtrXmJ8IUWS%2FJ0dkrPEdpyx9zusGXHqucK%2Fimg.png)
