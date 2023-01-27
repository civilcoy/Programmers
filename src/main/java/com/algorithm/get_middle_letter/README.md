## [**가운데 글자 가져오기**](https://school.programmers.co.kr/learn/courses/30/lessons/12903)

### **문제**

#### **문제 설명**

단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.

단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

#### **제한 조건**

-   s는 길이가 1 이상, 100이하인 스트링입니다.

#### **입출력 예**

| s | return |
| --- | --- |
| "abcde" | "c" |
| "qwer" | "we" |

### **풀이**

substring 메소드를 활용하면 되는데 잠깐 알아보면

#### **method**

substring 함수는 두 가지가 있는데 인자값을 하나만 받는 것과 두 개를 받는 것으로 나뉜다.

**String substring(int index)**

-   인자값 하나
-   인자값은 int형으로 substring하고자 하는 문자열의 앞에서부터 몇번째 위치인가를 지정하는 값
-   입력받은 인자값을 index로 해당 위치를 **포함해** 이후의 모든 문자열을 받는 함수(index값은 0부터 시작)

```java
String s = "01234567";
System.out.println(s.substring(5));
```

> 결과 : 567

**String substring(int beginIndex, int endIndex)**

-   인자값 두 개
-   첫 번째 인자값은 가져올 문자열의 시작 부분을 지정
-   두 번째 인자값은 가져올 문자열의 끝 부분을 지정
-   **beginIndex 위치에서 시작하여** **endIndex 전 위치까지**의 값을 리턴(index값은 0부터 시작)

```java
String s = "01234567";
System.out.println(s.substring(3,5));  // 3에서 시작해서 5전까지
```

> 결과 : 34

#### **내 풀이**

```java
class Solution {
    public String solution(String s) {
        String answer = "";
        answer = (s.length()%2==0) ?
        	s.substring(s.length()/2-1, s.length()/2+1) : s.substring(s.length()/2, s.length()/2+1);
        return answer;
    }
}
```

![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FDh6nT%2FbtrXn7U6C9J%2Fwk3NWGxLmxEspZqttkW21k%2Fimg.png)

#### **다른 풀이**

```java
class Solution {
    public String solution(String s) {
        String answer = "";
        answer = s.substring((s.length()-1)/2, s.length()/2+1);
        return answer;
    }
}
```

### **실행 결과**
![image](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FWwZSX%2FbtrXmk9vTRV%2FkV8U1JMMxGEsUqAS5P3q6K%2Fimg.png)
