# 📅 Week 1: Java 기초 & 객체지향 다시 보기

## 🎯 이번 주 목표
1.  **JVM 메모리 구조 (Stack vs Heap)**를 그림 그리듯 설명할 수 있다.
2.  **객체지향 4대 특징**이 코드에서 어떻게 쓰이는지 이해한다.
3.  `ArrayList`를 직접 구현하며 배열과 리스트의 차이를 체감한다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   JVM 메모리 구조 (Method, Stack, Heap Areas)
*   Primitive Type vs Reference Type (Call by Value vs Call by Reference)
*   OOP 4대 특성: 캡슐화, 상속, 다형성, 추상화
*   Overloading vs   Overriding
*   Interface vs Abstract Class (언제 무엇을 써야 할까?)
*   `static` 키워드의 의미와 메모리 위치

---

## 💻 실습 과제 (Missions)

### Mission 1: 나만의 `MyArrayList` 만들기
Java의 `ArrayList`를 사용하지 않고, 직접 `int` 배열을 감싸는 클래스를 만들어보세요.

**요구사항:**
*   클래스 이름: `MyArrayList`
*   멤버 변수: `int[] data`, `int size`
*   구현해야 할 메서드:
    *   `void add(int value)`: 데이터를 마지막에 추가 (배열이 꽉 차면 크기를 2배로 늘리기 - Doubling)
    *   `int get(int index)`: 해당 인덱스의 값 반환 (범위 벗어나면 예외 발생)
    *   `void remove(int index)`: 해당 인덱스 삭제 후 뒤의 요소들을 앞으로 당기기

### Mission 2: 결제 시스템 설계 (인터페이스 활용)
다형성(Polymorphism)을 이해하기 위한 최고의 예제입니다.

**요구사항:**
*   `Payment` 인터페이스 정의 (`pay(int amount)` 메서드 포함)
*   `CreditCard`, `Cash`, `MobilePay` 클래스가 `Payment`를 구현(implements)
*   `PaymentService` 클래스에서 `Payment` 타입을 받아 결제를 진행
    *   **포인트:** `PaymentService` 코드는 `CreditCard`나 `Cash` 같은 구체적인 클래스를 몰라야 합니다. (의존성 역전)

---

## 📚 참고 자료
*   [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/)
*   "Java의 정석" 또는 "Effective Java" (책이 있다면)

---

## ✅ 완료 체크리스트
- [ ] `MyArrayList`가 저절로 크기가 늘어나는지 테스트했다.
- [ ] `PaymentService`가 구체적인 결제 수단이 바뀌어도 코드가 안 바뀌는지 확인했다.
- [ ] JVM의 Stack과 Heap에 변수가 어떻게 쌓이는지 그림으로 그려봤다.

## 🏃‍♂️ 실행 방법 (Tip)
터미널에서 해당 폴더로 이동 후:
```bash
javac MyArrayList.java
java MyArrayList
```
만약 IDE(IntelliJ, Eclipse)를 쓴다면 해당 폴더를 프로젝트로 열어주세요.
