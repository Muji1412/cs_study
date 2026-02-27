package java_study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArrayList list = new MyArrayList();

        System.out.println("🚀 MyArrayList 실시간 테스트를 시작합니다!");

        while (true) {
            // 1. 현재 리스트의 상태를 시각적으로 출력 (실시간 모니터링)
            System.out.print("\n현재 배열 상태: [");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("] (현재 size: " + list.size() + ")");
            System.out.println("------------------------------------------------");

            // 2. 메뉴 출력
            System.out.println("1. 맨 뒤에 데이터 추가 (add)");
            System.out.println("2. 특정 위치에 데이터 끼워넣기 (add with index)");
            System.out.println("3. 데이터 삭제 (remove)");
            System.out.println("4. 특정 위치 데이터 조회 (get)");
            System.out.println("5. 특정 위치 값 변경 (set)");
            System.out.println("6. 값 포함 여부 확인 (contains)");
            System.out.println("7. 값의 위치 찾기 (indexOf)");
            System.out.println("8. 비어있는지 확인 (isEmpty)");
            System.out.println("9. 전체 삭제 (clear)");
            System.out.println("10. toString 출력");
            System.out.println("0. 테스트 종료");
            System.out.print("👉 원하는 작업 번호를 입력하세요: ");

            int choice = scanner.nextInt();

            // 3. 사용자가 선택한 번호에 따라 메서드 실행
            if (choice == 0) {
                System.out.println("테스트를 종료합니다. 수고하셨습니다!");
                break; // while 무한 루프 탈출
            } else if (choice == 1) {
                System.out.print("추가할 값을 입력하세요: ");
                int val = scanner.nextInt();
                list.add(val);
                System.out.println("✅ 맨 뒤에 " + val + " 추가 완료!");
            } else if (choice == 2) {
                System.out.print("끼워넣을 인덱스(방 번호)를 입력하세요: ");
                int idx = scanner.nextInt();
                System.out.print("추가할 값을 입력하세요: ");
                int val = scanner.nextInt();
                list.add(idx, val);
                System.out.println("✅ " + idx + "번 인덱스에 " + val + " 추가 완료!");
            } else if (choice == 3) {
                System.out.print("삭제할 인덱스(방 번호)를 입력하세요: ");
                int idx = scanner.nextInt();
                int result = list.remove(idx);
                System.out.println("🗑️ " + idx + "번 인덱스의 값 " + result + " 삭제 완료!");
            } else if (choice == 4) {
                System.out.print("조회할 인덱스(방 번호)를 입력하세요: ");
                int idx = scanner.nextInt();
                System.out.println("🔍 " + idx + "번 인덱스의 값: " + list.get(idx));
            } else if (choice == 5) {
                System.out.print("변경할 인덱스(방 번호)를 입력하세요: ");
                int idx = scanner.nextInt();
                System.out.print("새로운 값을 입력하세요: ");
                int val = scanner.nextInt();
                list.set(idx, val);
                System.out.println("✅ " + idx + "번 인덱스의 값을 " + val + "로 변경 완료!");
            } else if (choice == 6) {
                System.out.print("찾을 값을 입력하세요: ");
                int val = scanner.nextInt();
                System.out.println("🔍 " + val + " 포함 여부: " + list.contains(val));
            } else if (choice == 7) {
                System.out.print("찾을 값을 입력하세요: ");
                int val = scanner.nextInt();
                System.out.println("🔍 " + val + "의 위치: " + list.indexOf(val));
            } else if (choice == 8) {
                System.out.println("🔍 비어있는지: " + list.isEmpty());
            } else if (choice == 9) {
                list.clear();
                System.out.println("🗑️ 전체 삭제 완료!");
            } else if (choice == 10) {
                System.out.println("📋 toString 결과: " + list.toString());
            } else {
                System.out.println("❌ 잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
