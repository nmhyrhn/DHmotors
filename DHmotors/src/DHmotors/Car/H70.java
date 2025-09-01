package DHmotors.Car;

public class H70 extends Car {

    //car를 부모로 상속 받음
    public H70() { super("H70", 8000); }

    @Override
    protected void setOptinos() {

    }

    //super로 부모인 car 호출
    @Override
    //사용? 모르겠음
    protected void setOptions() {
        options.put("선팅", 60);
        options.put("유리막", 90);
        options.put("둘다", 130);
        options.put("안함", 0);
    }
}

