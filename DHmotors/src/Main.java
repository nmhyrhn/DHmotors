import DHmotors.Car.*;
import DHmotors.Car.Car;
import DHmotors.Car.Hyerante;
import DHmotors.Contract.*;
import DHmotors.Util.RandomUtil;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DH모터스 신차 출고 시스템 ===");
        System.out.print("고객명 입력: ");
        String name = sc.nextLine();
        System.out.print("출고 희망일 입력 (YYYY-MM-DD): ");
        String releaseDate = sc.nextLine();
        Customer customer = new Customer(name, releaseDate);

        System.out.println("차종 선택: 1.세단 2.SUV 3.대형");
        int type = sc.nextInt();
        Car car = null;

        switch(type) {
            case 1: car = new Hyerante(); break; // 예시
            // case 2: car = new Ssohento(); break;
            // case 3: car = new Riven(); break;
            default: System.out.println("잘못 입력"); return;
        }

        car.printOptions();
        sc.nextLine(); // 버퍼 비우기
        System.out.print("옵션 입력: ");
        String option = sc.nextLine();

        System.out.print("색상 선택 (블랙/화이트/노랭이): ");
        String color = sc.nextLine();

        Contract contract = new Contract(
                RandomUtil.generateContractNo(),
                RandomUtil.generatePlate(),
                customer,
                car,
                option,
                color
        );

        contract.print();
    }
}
