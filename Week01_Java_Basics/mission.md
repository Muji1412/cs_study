# 📅 Week 1: Java 기초 & 객체지향 다시 보기

## 🎯 이번 주 목표
1.  **JVM 메모리 구조 (Stack vs Heap)**를 그림 그리듯 설명할 수 있다.
2.  **객체지향 4대 특징**이 코드에서 어떻게 쓰이는지 이해한다.
3.  `ArrayList`를 직접 구현하며 배열과 리스트의 차이를 체감한다.

배열 -> 딱 박힘. 사이즈를 지정하면 사이즈를 늘릴 수 없음
어레이리스트 -> 꽉 차서 늘려야하는 상황이 온다면 사이즈를 알아서 늘림 (MyArrayList에서 구현)

---

## 📝 필수 학습 키워드 (면접 단골)
*   JVM 메모리 구조 (Method, Stack, Heap Areas)
    - Method Area -> 메서드, Static 영역
        - 대충 '설계도' 정도로 이해하면 됨
        - 프로그램 시작할 때, 클래스 설계도, 메서드 ByteCode, static이 붙은 변수들 딱 한번 올라감. 프로그램 종료 전까지 보관
    - Stack Area -> 실행 로그
        -메서드 호출 시 마다 '프레임' 생성, 지역/매개 변수 들어감. 
        -해당 메서드 끝날 시 프레임 날라감
    - Heap Area -> 임시보관함
        - 코드에서 'new' 써서 생성할때마다 무조건 힙 영역에 생성
        - 이러한 객체를 가비지컬렉터가 알아서 청소해줌
*   Primitive Type vs Reference Type (Call by Value vs Call by Reference)
    -Primitive Type (기본형) -> int, double, boolean 같은 케이스
        - 데이터 자체가 작아서, stack 영역에 값을 그대로 적어버림.
        - 이를 다른 메서드에 넘겨주는 행위를 Call by Value라고 칭함. 
        - 그렇기 때문에 다른곳에서 값을 바꾸어도 내 값은 변하지 않음
    -Reference Type (참조형) -> String, Array, new, 내가 만든 클래스 등
        - 데이터 크기 큼. Heap 영역에 저장, Stack에는 메모리 주소만 저장함
        - Call by Value와 다르게, Reference를 불러와 메서드에 넘겨줄때 주소값을 복사해 줌
        - 따라서, 해당 클래스 안의 값을 바꾸면 값이 변화하는 차이점이 있음.
*   OOP 4대 특성: 캡슐화, 상속, 다형성, 추상화
    - 캡슐화 (Encapsulation)
        - Getter, Setter를 사용하는 이유.
        - Public 메서드를 사용할때, 객체 내 변수는 private으로 숨김
        - Getter, Setter로만 접근 가능하게 만들어, 외부에서 데이터를 접근하지 못하게 보호함.
    - 상속 (Inheritance)
        - extends 클래스 - 지금 구현해놓은 Payment 처럼, 상속해서 사용함.
        - 재사용성 뛰어남. 이미 구현해놓은 기능들을 굳이 다시 코딩할 필요 없음.
    - 다형성 (Polymorphism)
        - 다양한 형태를 가짐 - Payment 예시의 Main 클래스처럼, .pay 함수가 객체에 따라 다르게 작동
        - 메인 코드는 유지시키며, 객체만 갈아끼우면 됨.
    - 추상화 (Abstraction)
        - 하드코딩의 반대격, 정적이 아닌 동적인 코딩을 위함
        - 핵심적인 속성들만 뽑아내어, 클래스로 만드는 과정
        - 추상 클래스 / 인터페이스가 이를 구현하는 도구임
*   Overloading vs   Overriding
    - 오버로딩 -> 말 그대로 '과적'
        - 같은 이름의 메서드지만, 변수의 개수, 타입에 따라 다른 행동을 함
        - 예시 
            - Arrays.sort(arr); -> 전체 정렬
            - Arrays.sort(arr, 1, 4); -> 일부 범위만 정렬함.
    - 오버라이드 -> 말 그대로 '덮어쓰기'
        - 부모 클래스에서 상속받고, 자식 클래스에서 재정의해서 사용
        - 단, 이름, 매개변수, 리턴타입이 같아야 덮어써짐
        - 예시
            - 부모 클래스 pay -> 100퍼센트 다 내야함
            - 자식 클래스 BigSaleDayPay -> 80퍼센트만 내면 되도록 변경해서 사용
*   Interface vs Abstract Class (언제 무엇을 써야 할까?)
    - Abstract Class (추상 클래스)
        - 근본이 같을때 사용 (예시 - 동물이 부모 클래스, 사자가 자식 클래스)
    - Interface (인터페이스)
        - 근본이 달라도 기능을 사용할 수 있게 만들 수 있음
    - 이해를 위한 예시 코드

        추상 클래스 Animal,
        Machine 추상 클래스,
        Flyable 인터페이스 (fly 기능) 있다고 가정함.
        
        class Bird extends Animal implements Flyable
        class Airplane extends Machine implements Flyable

        // 1. 새 (Bird) : 동물(Animal)의 핏줄이면서 + 날 수 있는(Flyable) 능력이 있음!
        class Bird extends Animal implements Flyable {
            public Bird(String name) { super(name); }

            @Override
            void cry() { System.out.println("짹짹!"); }

            // 인터페이스의 규약을 강제로 구현
            @Override
            public void fly() {
                System.out.println("새가 날개를 파닥거리며 하늘을 납니다!");
            }
        }

        // 2. 비행기 (Airplane) : 기계(Machine)의 핏줄이면서 + 날 수 있는(Flyable) 능력이 있음!
        class Airplane extends Machine implements Flyable {
            @Override
            void turnOn() { System.out.println("엔진 시동을 켭니다 부릉부릉"); }

            // 새와 핏줄(Animal)은 전혀 다르지만, 날 수 있으니까 인터페이스 규약을 구현!
            @Override
            public void fly() {
                System.out.println("비행기가 제트 엔진으로 하늘을 납니다!");
            }
        }

        이러한 방식으로 코드를 만들어준다면, 
        public class Main {
            public static void main(String[] args) {
                Bird myBird = new Bird("참새");
                Airplane myPlane = new Airplane();

                // 핏줄(부모)이 완전히 다른 둘을 'Flyable(날 수 있는 것)'이라는 인터페이스 하나로 묶어버립니다! 배열에 같이 담을 수 있어요!!
                Flyable[] flyingObjects = { myBird, myPlane };

                System.out.println("--- 비행 시작 ---");
                for (Flyable obj : flyingObjects) {
                    obj.fly(); // 참새는 날개를 펄럭이고, 비행기는 엔진을 뿜으며 납니다.
                }
            }
        }

        이러한 방식으로 마치 '다형성' 처럼 돌아감.

*   `static` 키워드의 의미와 메모리 위치

---

## 💻 실습 과제 (Missions)

### Mission 1: 나만의 `MyArrayList` 만들기
Java의 `ArrayList`를 사용하지 않고, 직접 `int` 배열을 감싸는 클래스를 만들어보세요.

**요구사항:**
*   클래스 이름: `MyArrayList`
*   멤버 변수: `int[] data`, `int size`
*   구현해야 할 메서드:
    *   `void add(int value)`: 데이터를 마지막에 추가 (배열이 꽉 차면 크기를 2배로 늘리기 - Doubling)
    *   `int get(int index)`: 해당 인덱스의 값 반환 (범위 벗어나면 예외 발생)
    *   `void remove(int index)`: 해당 인덱스 삭제 후 뒤의 요소들을 앞으로 당기기

### Mission 2: 결제 시스템 설계 (인터페이스 활용)
다형성(Polymorphism)을 이해하기 위한 최고의 예제입니다.

**요구사항:**
*   `Payment` 인터페이스 정의 (`pay(int amount)` 메서드 포함)
*   `CreditCard`, `Cash`, `MobilePay` 클래스가 `Payment`를 구현(implements)
*   `PaymentService` 클래스에서 `Payment` 타입을 받아 결제를 진행
    *   **포인트:** `PaymentService` 코드는 `CreditCard`나 `Cash` 같은 구체적인 클래스를 몰라야 합니다. (의존성 역전)

---

## 📚 참고 자료
*   [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/)
*   "Java의 정석" 또는 "Effective Java" (책이 있다면)

---

## ✅ 완료 체크리스트
- [ ] `MyArrayList`가 저절로 크기가 늘어나는지 테스트했다.
- [ ] `PaymentService`가 구체적인 결제 수단이 바뀌어도 코드가 안 바뀌는지 확인했다.
- [ ] JVM의 Stack과 Heap에 변수가 어떻게 쌓이는지 그림으로 그려봤다.

## 🏃‍♂️ 실행 방법 (Tip)
터미널에서 해당 폴더로 이동 후:
```bash
javac MyArrayList.java
java MyArrayList
```
만약 IDE(IntelliJ, Eclipse)를 쓴다면 해당 폴더를 프로젝트로 열어주세요.
