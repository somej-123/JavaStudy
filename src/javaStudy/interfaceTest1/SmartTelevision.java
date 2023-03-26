package javaStudy.interfaceTest1;

public class SmartTelevision implements Serarchable, RemoteControl{
    private int volumn;

    /*
     * RemoteControl의 추상메소드에 대한 실체 메소드
    */

    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    public void setVolumn(int volumn){
        if(volumn>RemoteControl.MAX_VOLUME){
            this.volumn = RemoteControl.MAX_VOLUME;
        }else if(volumn<RemoteControl.MIN_VOLUME){
            this.volumn = RemoteControl.MIN_VOLUME;
        }else{
            this.volumn = volumn;
        }
        System.out.println("현재 TV 볼륨 :" + this.volumn);
    }

    // Searchable의 추상 메소드에 대한 실체 메소드

    public void search(String url){
        System.out.println(url+" 을 검색합니다.");
    }
}
