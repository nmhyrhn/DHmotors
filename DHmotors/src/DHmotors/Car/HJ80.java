package DHmotors.Car;

public class HJ80 extends Car {

    //car를 부모로 상속 받음
    public HJ80() { super("헤네시스", 9000); }
    //super로 부모인 car 호출
    @Override
    //사용? 모르겠음
    protected void setOptions() {
        options.put("선팅", 50);
        options.put("유리막", 90);
        options.put("둘다", 130);
        options.put("안함", 0);
    }
}