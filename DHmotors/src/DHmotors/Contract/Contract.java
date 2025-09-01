package DHmotors.Contract;

import DHmotors.Car.*;

public class Contract implements Printable {
    private final String contractNo;
    private final String plateNo;
    private Customer customer;
    private Car car;
    private String option;
    private String color;
    private int finalPrice;

    public Contract(String contractNo, String plateNo, Customer customer, Car car, String option, String color) {
        this.contractNo = contractNo;
        this.plateNo = plateNo;
        this.customer = customer;
        this.car = car;
        this.option = option;
        this.color = color;
        this.finalPrice = car.getFinalPrice(option);
    }

    public Contract(String contractNo, String plateNo, Customer customer, Car car, String option, String color) {
    }

    @Override
    public void print() {
        System.out.println("=== 계약서 ===");
        System.out.println("계약번호: " + contractNo);
        System.out.println("고객명: " + customer.getName());
        System.out.println("출고일: " + customer.getReleaseDate());
        System.out.println("차량: " + car.getModelName());
        System.out.println("옵션: " + option);
        System.out.println("색상: " + color);
        System.out.println("번호판: " + plateNo);
        System.out.println("총 금액: " + finalPrice + "만원");
    }
}
