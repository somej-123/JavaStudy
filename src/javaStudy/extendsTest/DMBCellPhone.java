package javaStudy.extendsTest;

public class DMBCellPhone extends Cellphone{
    // 필드
    int channel;

    // 생성자
    DMBCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 메소드
    void turnOnDMB(){
        System.out.println("채널 : "+ channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDMB(int channel){
        System.out.println("채널 " + channel + "번으로 변경합니다.");
    }

    void turnOff(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
