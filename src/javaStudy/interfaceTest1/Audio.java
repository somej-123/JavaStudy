package javaStudy.interfaceTest1;

public class Audio implements RemoteControl{
    
    // 필드
    private int volumn;
    private boolean mute;

    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff(){
        System.out.println("Audio를 끕니다.");
    }

    // setVolumn() 추상 메소드의 실체 메소드
    // 인터페이스 상수를 이용해서 volumn 필드의 값을 제한
    public void setVolumn(int volumn){
        if(volumn>RemoteControl.MAX_VOLUME){
            this.volumn = RemoteControl.MAX_VOLUME;
        }else if(volumn<RemoteControl.MIN_VOLUME){
            this.volumn = RemoteControl.MIN_VOLUME;
        }else{
            this.volumn = volumn;
        }
        System.out.println("현재 Audio 볼륨 : "+ this.volumn);
    }

    @Override
    public void setMute(boolean mute){
        this.mute = mute;
        if(mute){
            System.out.println("Audio 무음 처리합니다.");
        }else{
            System.out.println("Audio 무음 해제합니다.");
        }
    }
}
