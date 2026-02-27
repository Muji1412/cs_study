# 📅 Week 7: 데이터베이스 기초 (Database Basics)

## 🎯 이번 주 목표
1.  **RDBMS(관계형 데이터베이스)**의 개념과 **SQL** 기본 문법을 익힌다.
2.  **데이터 모델링(ERD)**을 통해 테이블 간의 관계(1:1, 1:N, N:M)를 설계한다.
3.  **정규화(Normalization)**의 필요성을 이해하고 데이터 중복을 제거한다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   RDBMS vs NoSQL (ACID vs BASE)
*   SQL Commands: DDL, DML, DCL, TCL
*   Primary Key (PK) & Foreign Key (FK)
*   JOIN (Inner, Left, Right, Outer)
*   Normalization (1NF, 2NF, 3NF, BCNF)
*   Transaction (ACID 특성: Atomicity, Consistency, Isolation, Durability)
*   Index (다음 주 주제지만 맛보기)

---

## 💻 실습 과제 (Missions)

### Mission 1: 나만의 서비스 DB 설계 (ERD)
본인이 만들고 싶은 서비스(예: 쇼핑몰, 블로그, 수강신청 등)의 DB 스키마를 설계해보세요.

**요구사항:**
*   최소 3개 이상의 테이블 포함
*   테이블 간의 관계(Foreign Key) 설정
*   [dbdiagram.io](https://dbdiagram.io/) 같은 도구 활용

### Mission 2: SQL 쿼리 연습 (프로그래머스/LeetCode)
SQL 문제를 풀어보며 감을 익히세요.

**추천 문제:**
*   SELECT (모든 레코드 조회하기)
*   IS NULL (이름이 없는 동물의 아이디)
*   GROUP BY (고양이와 개는 몇 마리 있을까)
*   JOIN (없어진 기록 찾기)

---

## 📚 참고 자료
*   [W3Schools SQL Tutorial](https://www.w3schools.com/sql/)
*   [Programmers SQL Kit](https://school.programmers.co.kr/learn/challenges?tab=sql_practice_kit)

---

## ✅ 완료 체크리스트
- [ ] 정규화를 하지 않았을 때 발생할 수 있는 이상 현상(Anomaly)을 설명할 수 있다.
- [ ] 트랜잭션의 ACID 특성이 왜 중요한지 예시를 들 수 있다.
- [ ] `JOIN`을 사용해 두 테이블의 데이터를 합쳐서 조회할 수 있다.
