package Car;

import java.util.*;

public abstract class Car{
    protected String modelName;
    protected String basePrice;
    protected Map<String, Integer> options = new HashMap<>();
    //map 사용해서 옵션의 키와 벨류 값 지정 (선팅, 가격)
    //protected를 사용해 패키지 내에서만 상속 허용

    public Car(String modelName, String basePrice){
        this.modelName=modelName;
        this.basePrice=basePrice;
        //this 자신의 객체를 의미
        setOptinos();
    }

    protected abstract void setOptinos();
    // 근데 추상화 클래스 감이 잘 안옴
    public void printOptions(){
        System.out.println("[" + modelName + "] 기본 가격: " + basePrice + "만원");
        options.forEach((k,v) -> System.out.println(" - " + k + " : " + v + "만원"));
        //forEach 구문 음..
    }

    public int getFinalPrice(String option) {
        return basePrice + options.getOrDefault(option, 0);
    }
    // fianl 값이 변하지 않음?? get 사용해서 ???임
    public String getModelName() { return modelName; }
}
    }

}

