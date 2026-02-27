# 📅 Week 11: 시스템 설계 기초 (System Design Basics)

## 🎯 이번 주 목표
1.  **대규모 시스템 설계**의 기본 개념(Scalability, Availability)을 익힌다.
2.  **부하 분산(Load Balancing)**과 **캐싱(Caching)**의 중요성을 이해한다.
3.  간단한 시스템 아키텍처를 직접 그려본다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   Scale-up (수직 확장) vs Scale-out (수평 확장)
*   Load Balancer (L4 vs L7)
*   Caching Strategy (Local Cache vs Global Cache, Redis)
*   Database Sharding & Replication (Master-Slave)
*   CAP Theorem (Consistency, Availability, Partition Tolerance)
*   MSA (Microservices Architecture) vs Monolithic

---

## 💻 실습 과제 (Missions)

### Mission 1: 단축 URL 서비스 (URL Shortener) 설계
`bit.ly` 같은 단축 URL 서비스를 설계한다고 가정하고 아키텍처를 그려보세요.

**고려사항:**
1.  긴 URL을 어떻게 짧은 문자열(Base62 등)로 바꿀 것인가? (알고리즘)
2.  DB에 어떻게 저장할 것인가? (KEY-VALUE Store?)
3.  트래픽이 몰리면 어떻게 할 것인가? (캐싱, 로드 밸런싱)
4.  동일한 긴 URL이 들어오면 매번 새로 생성할 것인가, 기존 것을 줄 것인가?

### Mission 2: 캐시(Cache) 적용해보기
Week 8의 DB 조회 미션에 **Redis**나 **Local Cache**(`HashMap`, `Ehcache` 등)를 적용해보고 속도 차이를 비교해보세요.

---

## 📚 참고 자료
*   [가상 면접 사례로 배우는 대규모 시스템 설계 기초](http://www.yes24.com/Product/Goods/102819435) (강추)
*   [System Design Primer (GitHub)](https://github.com/donnemartin/system-design-primer)

---

## ✅ 완료 체크리스트
- [ ] Scale-out 환경에서 세션 관리(Session Clustering, Redis Session)를 어떻게 하는지 안다.
- [ ] 캐시를 쓸 때 정합성(Consistency) 문제가 발생할 수 있음을 이해했다.
- [ ] DB 샤딩이 무엇인지 설명할 수 있다.
