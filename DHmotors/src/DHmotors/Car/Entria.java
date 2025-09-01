package DHmotors.Car;

public class Entria extends Car {

    //car를 부모로 상속 받음
    public Entria() { super("엔트리아", 4500); }
    //super로 부모인 car 호출
    @Override
    //사용? 모르겠음
    protected void setOptions() {
        options.put("선팅", 50);
        options.put("유리막", 80);
        options.put("둘다", 110);
        options.put("안함", 0);
    }
}