package javaStudy.interfaceTest1;

public class RemoteControlEx {
    public static void main(String[] args) {

        /*
         * 인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체를 대입해야 한다.
         * 인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입될 경우 구현 객체의 번지를 저장한다.
         */

        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVolumn(15);
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setVolumn(1);
        rc.setMute(true);

        // 정적 메소드 사용
        // 인터페이스의 정적 메소드는 인터페이스로 바로 호출이 가능하다.
        RemoteControl.changeBattery();

        // 익명 구현 객체
        /*
         * new 연산자 뒤에는 클래스 이름이 와야 하는데, 이름이 없다.
         * 인터페이스() {} 는 인터펭이스를 구현해서 중괄호 {} 와 같이 클래스를 선언하라는 뜻이고, new 연산자는 이렇게 선언된 클래스를 객체로 생성한다.
         * 그렇지 않으면 컴파일 에러가 발생한다.
         * 추가적으로 필드와 메소드를 선언할 수 있찌만, 익명 객체 안에서만 사용할 수 있고 인터페이스 변수로 접근할 수 없다.
         */

        //  RemoteControl rc = new RemoteControl() {
        //     public void turnOn(){
        //         // 실행문
        //         System.out.println("무언가 킵니다.");
        //     }
        //     public void turnOff(){
        //         // 실행문
        //         System.out.println("무언가 킵니다.");
        //     }
        //     public void setVolumn(int volumn){
        //         // 실행문
        //         System.out.println("볼륨을 킵니다.");
        //     }
        //  };
    }
}
