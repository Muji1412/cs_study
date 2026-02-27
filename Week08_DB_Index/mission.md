# 📅 Week 8: 데이터베이스 인덱스 & 최적화 (DB Index & Optimization)

## 🎯 이번 주 목표
1.  **인덱스(Index)**의 원리(B-Tree)와 종류를 이해한다.
2.  인덱스를 언제 사용해야 하고, 언제 사용하면 안 되는지(Trade-off) 설명할 수 있다.
3.  **실행 계획(Explain)**을 보고 쿼리 성능을 분석할 수 있다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   B-Tree vs B+Tree (DB에서 B+Tree를 주로 쓰는 이유)
*   Clustered Index vs Non-Clustered Index (Primary Key와 연관성)
*   Index Cardinality (카디널리티가 높은 컬럼에 인덱스를 걸어야 함)
*   Covering Index (쿼리에 필요한 모든 컬럼이 인덱스에 있는 경우)
*   Composite Index (복합 인덱스의 컬럼 순서 중요성)
*   Query Optimization (Execution Plan)

---

## 💻 실습 과제 (Missions)

### Mission 1: 인덱스 성능 비교 실험
대량의 데이터(약 100만 건 이상)를 넣고 인덱스 유무에 따른 조회 속도를 비교해보세요.

**요구사항:**
*   Dummy Data 생성 (반복문 또는 프로시저 활용)
*   `SELECT * FROM users WHERE email = 'test@example.com'` 실행 시간 측정
*   `email` 컬럼에 인덱스 생성 후 다시 실행 시간 측정
*   `EXPLAIN` 명령어를 통해 인덱스를 탔는지(`Index Scan` vs `Full Table Scan`) 확인

### Mission 2: 복합 인덱스 순서의 중요성
`First Name`과 `Last Name` 두 컬럼으로 복합 인덱스를 만들었을 때, 쿼리 조건에 따라 인덱스를 타는지 안 타는지 실험해보세요.

**실험 케이스:**
*   `WHERE first_name = ?`
*   `WHERE last_name = ?`
*   `WHERE first_name = ? AND last_name = ?`

---

## 📚 참고 자료
*   [Real MySQL](http://www.yes24.com/Product/Goods/6960931) (책 추천)
*   [PostgreSQL Indexing](https://www.postgresql.org/docs/current/indexes.html)

---

## ✅ 완료 체크리스트
- [ ] B-Tree 구조를 그림으로 그릴 수 있다.
- [ ] 인덱스를 너무 많이 만들면 `INSERT`, `UPDATE`, `DELETE` 성능이 떨어지는 이유를 안다.
- [ ] 실행 계획(Explain)에서 `type`이 `ALL`이면 풀 스캔임을 안다.
