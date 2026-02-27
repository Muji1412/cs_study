# 📅 Week 3: 비선형 자료구조 (Non-Linear Data Structures)

## 🎯 이번 주 목표
1.  **트리(Tree)와 그래프(Graph)**의 차이를 이해한다.
2.  **이진 탐색 트리(BST)**의 원리를 알고 검색 성능을 이해한다.
3.  **힙(Heap)**을 이용해 우선순위 큐를 이해한다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   Tree vs Graph (순환 vs 비순환, 방향성)
*   Binary Tree (이진 트리) 종류 (Full, Complete, Perfect)
*   Binary Search Tree (BST)의 특징과 시간 복잡도
*   Tree Traversal (전위, 중위, 후위 순회)
*   Heap (Max Heap, Min Heap)과 Priority Queue
*   Graph 표현 방법 (Adjacency Matrix vs Adjacency List)
*   BFS (너비 우선 탐색) vs DFS (깊이 우선 탐색)

---

## 💻 실습 과제 (Missions)

### Mission 1: 이진 탐색 트리 (BST) 구현
직접 간단한 BST를 구현하고 탐색 기능을 만들어보세요.

**요구사항:**
*   클래스 이름: `MyBST`
*   메서드:
    *   `void insert(int key)`: 값 추가
    *   `boolean search(int key)`: 값 존재 여부 확인
    *   `void inorder()`: 중위 순회 결과 출력 (정렬된 순서로 나와야 함)

### Mission 2: 친구 추천 알고리즘 (Graph 맛보기)
친구 관계를 그래프로 표현하고, 특정 친구의 "친구의 친구"를 찾는 로직을 구상해보세요. (코드로 구현까지 하면 Best, 설계만 해도 OK)

**설계:**
*   사람을 노드(Node), 친구 관계를 간선(Edge)으로 표현
*   A의 직계 친구 목록 찾기 vs A의 친구의 친구 목록 찾기

---

## 📚 참고 자료
*   [VisuAlgo - Binary Search Tree](https://visualgo.net/en/bst)
*   [GeeksforGeeks - Data Structures](https://www.geeksforgeeks.org/data-structures/)

---

## ✅ 완료 체크리스트
- [ ] 트리의 순회 방식(Pre/In/Post-order)을 그림으로 그릴 수 있다.
- [ ] BST에서 데이터가 어떻게 저장되는지 시뮬레이션 해봤다.
- [ ] 그래프의 인접 행렬과 인접 리스트 차이를 이해했다.
