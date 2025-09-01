package DHmotors.Car;

public class Riven extends Car {

    //car를 부모로 상속 받음
    public Riven() { super("리벤", 4000); }

    //super로 부모인 car 호출
    @Override
    //사용? 모르겠음
    protected void setOptions() {
        options.put("선팅", 50);
        options.put("유리막", 70);
        options.put("둘다", 100);
        options.put("안함", 0);
    }
}