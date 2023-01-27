## [직사각형 별찍기](https://school.programmers.co.kr/learn/courses/30/lessons/12969)

### **문제**

#### **문제 설명**

이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.

별(\*)문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

#### **제한 조건**

-   n과 m은 각각 1000 이하인 자연수입니다.

#### **예시**

입력

```
5 3
```

출력

```
*****
*****
*****
```

### **풀이**

```java
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
```

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmcdBO%2FbtrXgqWqVn8%2FlqsKw0l490w1sA4J4yPDT1%2Fimg.png)

### **실행 결과**

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fw9dIJ%2FbtrXj1m4GH1%2FxH4vwHnYYp91J29MvU50N1%2Fimg.png)