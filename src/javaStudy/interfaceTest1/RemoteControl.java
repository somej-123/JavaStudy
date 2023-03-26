package javaStudy.interfaceTest1;

public interface RemoteControl {
    // 상수는 public static final로 선언한다.
    //  인터페이스에 선언된 필드는 모두 public static final의 특성을 갖는다.
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드
    // 메소드 선언부만 작성 (추상 메소드)
    public void turnOn();
    public void turnOff();
    public void setVolumn(int volumn);

    // 디폴트 메소드

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
        }else{
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드
    static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }
}
