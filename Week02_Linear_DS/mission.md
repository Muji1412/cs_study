# 📅 Week 2: 선형 자료구조 (Linear Data Structures)

## 🎯 이번 주 목표
1.  **배열(Array)과 연결 리스트(LinkedList)의 장단점**을 명확히 설명할 수 있다.
- 배열 -> 
- 링크드리스트 -> 전부 탐색은 느릴수 있어도 노드처럼 연결되어 있으므로 빠르다?

2.  **스택(Stack)과 큐(Queue)**가 어디에 쓰이는지 이해하고 직접 구현해본다.
- 스택
- 큐
3.  자료구조 선택의 기준(시간 복잡도 Big-O)을 익힌다. 
- 알고있음

---

## 📝 필수 학습 키워드 (면접 단골)
*   Array vs LinkedList (메모리 구조 차이, 삽입/삭제 성능 비교)
*   Stack (LIFO) 활용 사례 (함수 호출 스택, 뒤로 가기)
*   Queue (FIFO) 활용 사례 (프린터 대기열, BFS)
*   Deque (Double-Ended Queue)
*   Time Complexity (시간 복잡도): O(1), O(n), O(log n)
*   Java Collection Framework: `ArrayList`, `LinkedList`, `Stack`, `Queue`, `Deque`

---

## 💻 실습 과제 (Missions)

### Mission 1: `MyStack` & `MyQueue` 구현하기
Java의 `Stack`과 `Queue` 인터페이스를 사용하지 않고, 직접 배열이나 연결 리스트를 이용해 구현해보세요.

**요구사항:**
*   **MyStack**:
    *   `void push(int data)`
    *   `int pop()`
    *   `int peek()`
    *   `boolean isEmpty()`
*   **MyQueue**:
    *   `void enqueue(int data)`
    *   `int dequeue()`
    *   `int peek()`
    *   `boolean isEmpty()`

### Mission 2: 괄호 짝 맞추기 (Stack 활용)
주어진 문자열에서 괄호 `()`, `{}`, `[]`의 짝이 맞는지 확인하는 알고리즘을 작성하세요.

**예시:**
*   Input: `"{[()]}"` -> Output: `true`
*   Input: `"{[(])}"` -> Output: `false`

---

## 📚 참고 자료
*   [Java Collections Framework Overview](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
*   "Visualgrid" (자료구조 시각화 사이트)

---

## ✅ 완료 체크리스트
- [ ] 배열과 리스트의 삽입/삭제 시간 복잡도 차이를 표로 정리했다.
- [ ] 스택을 이용해 괄호 검사기를 성공적으로 구현했다.
- [ ] 큐를 이용해 데이터를 순서대로 처리하는 구조를 이해했다.
