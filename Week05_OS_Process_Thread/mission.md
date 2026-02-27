# 📅 Week 5: 운영체제 - 프로세스와 스레드 (Process & Thread)

## 🎯 이번 주 목표
1.  **프로세스(Process)와 스레드(Thread)**의 차이를 명확히 설명할 수 있다.
2.  **멀티 스레드(Multi-Thread)** 프로그래밍의 장점과 문제점(동기화 이슈)을 이해한다.
3.  **컨텍스트 스위칭(Context Switching)**이 무엇인지 설명할 수 있다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   Process vs Thread (메모리 공유 여부, 자원 할당 단위)
*   Multi-process vs Multi-thread
*   Context Switching (문맥 교환) 비용
*   PCB (Process Control Block) & TCB (Thread Control Block)
*   Concurrency (동시성) vs Parallelism (병렬성)
*   Critical Section (임계 영역) & Synchronization (동기화)
*   Deadlock (교착 상태) 발생 조건 4가지

---

## 💻 실습 과제 (Missions)

### Mission 1: Java로 멀티 스레드 구현하기
Java에서 스레드를 생성하는 두 가지 방법(`Thread` 클래스 상속 vs `Runnable` 인터페이스 구현)을 모두 사용해보세요.

**요구사항:**
*   `MyThread` 클래스 (`Thread` 상속)
*   `MyRunnable` 클래스 (`Runnable` 구현)
*   메인 함수에서 두 스레드를 동시에 실행시켜 출력 결과 확인하기 (순서가 뒤죽박죽인지 확인)

### Mission 2: 공유 자원 동기화 문제 해결 (은행 예제)
두 개의 스레드가 하나의 계좌(공유 자원)에서 동시에 출금을 시도할 때 발생하는 문제를 시뮬레이션하고 해결해보세요.

**요구사항:**
*   `Account` 클래스 (잔액 `balance` 공유)
*   동시에 여러 스레드가 출금을 시도
*   `synchronized` 키워드 없이 문제 발생 확인 -> `synchronized` 적용 후 해결 확인

---

## 📚 참고 자료
*   [Oracle Java Concurrency](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
*   운영체제 공룡책 (Operating System Concepts) 요약본

---

## ✅ 완료 체크리스트
- [ ] 프로세스는 운영체제로부터 자원을 할당받는 작업의 단위임을 이해했다.
- [ ] 스레드는 프로세스 내에서 실행되는 흐름의 단위임을 이해했다.
- [ ] 멀티 스레드 환경에서 동기화 처리를 안 하면 어떤 일이 벌어지는지 눈으로 확인했다.
