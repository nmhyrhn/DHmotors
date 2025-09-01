package DHmotors.Car;

public class Palihyde extends Car {

    //car를 부모로 상속 받음
    public Palihyde() { super("펠리헤이드", 6000); }

    @Override
    protected void setOptinos() {

    }

    //super로 부모인 car 호출
    @Override
    //사용? 모르겠음
    protected void setOptions() {
        options.put("선팅", 30);
        options.put("유리막", 50);
        options.put("둘다", 70);
        options.put("안함", 0);
    }
}
