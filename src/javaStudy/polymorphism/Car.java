package javaStudy.polymorphism;

public class Car {

    // 배열 방식을 사용하지 않을 때

    // Tire frontLeftTire = new HankookTire();
    // Tire frontRightTire = new HankookTire();
    // Tire backLeftTire = new KumhoTire();
    // Tire backRightTire = new KumhoTire();

    // void run(){
    //     frontLeftTire.roll();
    //     frontRightTire.roll();
    //     backLeftTire.roll();
    //     backRightTire.roll();
    // }

    // 배열 방식을 사용하지 않을 때 끝

    // 배열 방식을 이용할 때

    Tire[] tires = {
        new HankookTire(),
        new HankookTire(),
        new HankookTire(),
        new HankookTire()
    };

    void run(){
        for(Tire tire : tires){
            tire.roll();
        }
    }

    // 배열 방식을 이용할 때 끝


}
