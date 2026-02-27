# 📅 Week 10: 디자인 패턴 (Design Patterns)

## 🎯 이번 주 목표
1.  **GoF 디자인 패턴** 중 자주 쓰이는 패턴(Singleton, Factory, Builder, Observer)을 익힌다.
2.  **재사용성(Reusability)**과 **유지보수성(Maintainability)**을 높이는 구조를 이해한다.
3.  직접 코드로 패턴을 구현해보고, **Anti-Pattern**이 무엇인지 안다.

---

## 📝 필수 학습 키워드 (면접 단골)
*   Creational Patterns (생성 패턴): Singleton, Factory Method, Builder
*   Structural Patterns (구조 패턴): Adapter, Decorator, Facade
*   Behavioral Patterns (행동 패턴): Observer, Strategy, Template Method
*   SOLID Principles (객체지향 5원칙) - 복습

---

## 💻 실습 과제 (Missions)

### Mission 1: Singleton 패턴의 진화 과정
싱글톤 패턴을 구현하되, **Thread-safe**하게 만드는 단계를 거쳐보세요.

**단계:**
1.  Eager Initialization
2.  Lazy Initialization (동기화 문제 발생 가능)
3.  `synchronized` method (성능 저하)
4.  Double Checked Locking (DCL)
5.  Static Inner Class (권장)
6.  Enum Singleton (가장 안전)

### Mission 2: 전략 패턴 (Strategy Pattern)으로 게임 캐릭터 무기 교체하기
게임 캐릭터가 무기를 바꿔 낄 때마다 공격 방식이 달라지는 것을 전략 패턴으로 구현해보세요. `if-else` 도배를 없애는 것이 핵심입니다.

**요구사항:**
*   `Weapon` 인터페이스
*   `Sword`, `Bow`, `Axe` 클래스
*   `Character` 클래스는 `setWeapon(Weapon w)` 메서드를 가짐

---

## 📚 참고 자료
*   [Refactoring.Guru - Design Patterns](https://refactoring.guru/design-patterns) (강추)
*   [Head First Design Patterns](http://www.yes24.com/Product/Goods/17703350) (책 추천)

---

## ✅ 완료 체크리스트
- [ ] 싱글톤 패턴이 안티 패턴으로 불리는 이유(테스트 어려움 등)를 안다.
- [ ] 팩토리 메서드 패턴이 객체 생성의 결합도를 어떻게 낮추는지 이해했다.
- [ ] 옵저버 패턴이 이벤트 처리에 어떻게 쓰이는지 안다.
