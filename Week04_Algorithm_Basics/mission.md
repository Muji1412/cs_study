# 📅 Week 4: 알고리즘 기초 (Algorithm Basics)

## 🎯 이번 주 목표
1.  **재귀(Recursion)**의 동작 원리(Stack Frame)를 이해한다.
2.  **정렬(Sorting)** 알고리즘의 원리와 시간 복잡도를 비교한다.
3.  **이진 탐색(Binary Search)**를 언제 써야 하는지 안다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   Recursion (재귀) vs Iteration (반복문)
*   Stack Overflow (무한 재귀 조심!)
*   Sorting Algorithms:
    *   Bubble Sort, Selection Sort, Insertion Sort (O(n^2))
    *   Merge Sort, Quick Sort (O(n log n))
*   Binary Search (이진 탐색) 조건과 시간 복잡도 O(log n)
*   Divide and Conquer (분할 정복) 전략

---

## 💻 실습 과제 (Missions)

### Mission 1: 재귀 함수로 팩토리얼 & 피보나치 구현
재귀 호출의 흐름을 이해하고 스택 프레임을 상상하며 코드를 작성해보세요.

**요구사항:**
*   `factorial(int n)`
*   `fibonacci(int n)`

### Mission 2: 나만의 정렬 라이브러리 `MySorters`
직접 정렬 알고리즘을 구현하며 비교해봅니다.

**요구사항:**
*   `int[]` 배열을 입력받아 정렬하는 정적 메서드 구현
*   `bubbleSort(int[] arr)`
*   `quickSort(int[] arr, int low, int high)` (도전 과제!)
*   실행 시간을 측정해서 O(n^2)과 O(n log n)의 차이를 체감해보기 (`System.nanoTime()`)

---

## 📚 참고 자료
*   [VisuAlgo - Sorting](https://visualgo.net/en/sorting)
*   [HackerRank - Algorithms](https://www.hackerrank.com/domains/algorithms)

---

## ✅ 완료 체크리스트
- [ ] 재귀 함수의 종료 조건을 명확히 설정했는가?
- [ ] 퀵 정렬과 병합 정렬의 차이점(안정성, 공간 복잡도)을 이해했는가?
- [ ] 이진 탐색이 정렬된 배열에서만 작동한다는 것을 확인했는가?
