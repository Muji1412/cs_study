# 📅 Week 9: Java 심화 (Java Advanced)

## 🎯 이번 주 목표
1.  **Java 8+**의 새로운 기능(Stream, Lambda, Optional)을 능숙하게 사용한다.
2.  **함수형 프로그래밍**의 개념을 Java에 적용해본다.
3.  **동시성 프로그래밍(Concurrency)**을 더 깊이 이해한다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   Lambda Expression (익명 함수) & Functional Interface
*   Stream API (중간 연산 vs 최종 연산, Lazy Evaluation)
*   Optional (NullPointerException 방지)
*   CompletableFuture (비동기 프로그래밍)
*   Garbage Collection (GC) 알고리즘 (Minor GC vs Major GC, STW)

---

## 💻 실습 과제 (Missions)

### Mission 1: 기존 코드 리팩토링 (for문 -> Stream)
이전에 짰던 코드(예: `MyArrayList`나 `Mission 2`)에서 `for`, `if` 문이 복잡하게 얽힌 부분을 Stream API를 사용하여 간결하게 바꿔보세요.

**요구사항:**
*   데이터 필터링 (`filter`)
*   데이터 변환 (`map`)
*   결과 집계 (`collect`, `reduce`)
*   **Before & After 코드 비교**

### Mission 2: Null 안전한 코드 만들기 (Optional)
`null`을 리턴할 수 있는 메서드를 `Optional`을 사용해 리팩토링하고, 호출하는 쪽에서 `if (obj != null)` 대신 `Optional` 메서드(`orElse`, `ifPresent`)를 사용하도록 변경하세요.

---

## 📚 참고 자료
*   [Modern Java in Action](http://www.yes24.com/Product/Goods/77125987) (책 추천)
*   [Baeldung - Java 8 Stream API](https://www.baeldung.com/java-8-streams)

---

## ✅ 완료 체크리스트
- [ ] Stream의 `map`과 `flatMap`의 차이를 안다.
- [ ] `Optional.get()`을 바로 쓰지 않고 안전하게 값을 꺼내는 방법을 익혔다.
- [ ] `CompletableFuture`를 이용해 비동기 작업 결과를 조합해봤다.
