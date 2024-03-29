## **[없는 숫자 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/86051)**

### **문제**

#### **문제 설명**

0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.

numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return하도록 solution 함수를 완성해주세요.

#### **제한 조건**

-   1 <= numbers의 길이 <= 9
    -   0 <= numbers의 모든 원소 <= 9
    -   numbers의 모든 원소는 서로 다릅니다.

#### **입출력 예**

| num | return |
| --- | --- |
| \[1,2,3,4,5,6,7,8,0\] | 14 |
| \[5,8,4,0,6,7,9\] | 6 |

#### **입출력 예 설명**

**입출력 예 #1**

-   5,9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.

**입출력 예 #2**

-   1,2,3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.

### **풀이**

```java
class Solution {
     public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        answer = 45 - sum;
        return answer;
    }
}
```

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FUgUUc%2FbtrXpcCiwRe%2FXt6rVVxLw2GFMrnl3Bl7Ek%2Fimg.png)

### **실행 결과**

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb4AUII%2FbtrXn9zgzWW%2FrHfME8ZwXG3NdfFkE4ke70%2Fimg.png)