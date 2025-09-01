import DHmotors.Car.*; // Car 관련 클래스 (Car 추상 클래스, 차종별 클래스) 불러오기
import DHmotors.Car.Car;
import DHmotors.Car.Hyerante;
import DHmotors.Contract.*; // 계약 관련 클래스 불러오기
import DHmotors.Util.RandomUtil; // 계약번호/차량번호판 랜덤 생성 유틸리티
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        System.out.println("=== DH모터스 신차 출고 시스템 ===");
        // 고객 정보 입력
        System.out.print("고객명 입력: ");
        String name = sc.nextLine();
        System.out.print("출고 희망일 입력 (YYYY-MM-DD): ");
        String releaseDate = sc.nextLine(); // 고객이 원하는 출고일
        Customer customer = new Customer(name, releaseDate); // Customer 객체 생성

        System.out.println("차종 선택: 1.세단 2.SUV 3.대형");
        int type = sc.nextInt(); // 차종 번호 입력
        Car car = null; // 추상 클래스 Car 타입 참조 변수 선언

        switch(type) { //switch(type) 문으로 세단 / SUV / 대형 중 하나 선택 : 다형성(추상 클래스 Car를 부모로 둠)
            case 1: car = new Hyerante(); break;
             case 2: car = new Ssohento(); break;
             case 3: car = new Riven(); break;
            default: System.out.println("잘못 입력"); return; // 잘못된 입력이면 프로그램 종료
        }

        // 선택된 차종의 기본 옵션 출력
        car.printOptions();
        sc.nextLine(); // 버퍼 비우기 (nextInt() → nextLine() 이어질 때 버퍼 문제 방지)
        System.out.println("옵션 선택 (선팅/유리막/둘다/없음): " );
        System.out.print("옵션 입력: ");
        String option = sc.nextLine();

        // 색상 선택
        System.out.print("색상 선택 (블랙/화이트/노랑): ");
        String color = sc.nextLine();

        // 계약 객체 생성
        Contract contract = new Contract(
                RandomUtil.generateContractNo(), // 랜덤 계약번호 생성
                RandomUtil.generatePlate(),     // 랜덤 차량번호판 생성
                customer,                       // 고객 정보
                car,                            // 차량 정보
                option,                         // 옵션 선택
                color                           // 차량 색상
        );

        contract.print(); // Printable 인터페이스 기반으로 계약서 자동 출력.
    }
}
