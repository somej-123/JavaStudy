package javaStudy.interfaceTest1;

public class Television implements RemoteControl{
    
    // 필드
    private int volumn;

    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    //setVolum() 추상 메소드의 실체 메소드
    // 인터페이스 상수를 이용하여 volumn 필드의 값을 제한
    public void setVolumn(int volumn){

        if(volumn > RemoteControl.MAX_VOLUME){

            this.volumn = RemoteControl.MAX_VOLUME;

        }else if(volumn > RemoteControl.MIN_VOLUME){

            this.volumn = RemoteControl.MIN_VOLUME;

        }else{

            this.volumn = volumn ;
        }

        System.out.println("현재 TV 볼륨: "+ this.volumn);
    }
}
