# 📅 Week 6: 네트워크 & 웹 기초 (Network & Web Basics)

## 🎯 이번 주 목표
1.  **웹의 동작 원리 (Client-Server)**를 설명할 수 있다.
2.  **HTTP 프로토콜**의 구조(Header, Body)와 **REST API**의 개념을 이해한다.
3.  **TCP/IP 4계층** 모델을 통해 데이터가 전달되는 과정을 이해한다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   OSI 7 Layer vs TCP/IP 4 Layer
*   HTTP vs HTTPS (Status Codes: 200, 404, 500 등)
*   TCP (3-way Handshake) vs UDP (비신뢰성, 속도)
*   DNS (Domain Name System)의 원리
*   REST API (Representational State Transfer)의 특징 (자원 기반 URI)
*   Cookie vs Session (상태 유지 기술)

---

## 💻 실습 과제 (Missions)

### Mission 1: 가장 단순한 HTTP 웹 서버 만들기
외부 프레임워크(Spring, Express 등) 없이 Java의 기본 소켓(`ServerSocket`, `Socket`)만으로 간단한 웹 서버를 만들어보세요. 브라우저에서 `localhost` 접속 시 "Hello World"를 띄워보세요.

**요구사항:**
*   `ServerSocket`을 8080 포트로 염
*   브라우저 요청(`GET /`)을 받으면 HTTP 응답 헤더와 본문을 전송
*   `writer.println("HTTP/1.1 200 OK");`
*   `writer.println("Content-Type: text/html; charset=utf-8");`

### Mission 2: REST API 설계 연습 (게시판 CRUD)
코드로 구현하기 전에, 게시판 기능을 위한 API 명세서를 작성해보세요.

**요구사항:**
*   게시글 목록 조회 (GET)
*   게시글 작성 (POST)
*   게시글 수정 (PUT/PATCH)
*   게시글 삭제 (DELETE)
*   URI 설계: `/posts`, `/posts/{id}` 등

---

## 📚 참고 자료
*   [MDN Web Docs - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP)
*   "그림으로 공부하는 HTTP & Network" (책 추천)

---

## ✅ 완료 체크리스트
- [ ] 브라우저 주소창에 `www.naver.com`을 쳤을 때 일어나는 과정을 설명할 수 있다.
- [ ] HTTP 요청과 응답 메시지의 구조를 직접 패킷 분석 도구(Wireshark, Chrome DevTools)로 확인했다.
- [ ] TCP 3-way Handshake가 왜 필요한지 이해했다.
