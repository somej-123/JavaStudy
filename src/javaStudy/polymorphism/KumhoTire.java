package javaStudy.polymorphism;

public class KumhoTire implements Tire{
    // Tire 인터페이스 구현
    @Override
    public void roll(){
        System.out.println("금호 타이거가 굴러갑니다.");
    }
}
