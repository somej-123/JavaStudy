package javaStudy.polymorphism;

public class CarExample {
    public static void main(String[] args){

        // 배열 방식으로 하지 않았을 때
        // Car myCar = new Car();

        // myCar.run();

        // myCar.frontLeftTire = new KumhoTire();
        // myCar.frontRightTire = new KumhoTire();

        // myCar.run();
        // 배열 방식으로 하지 않았을 때 끝

        // 배열 방식으로 할 때

        Car myCar = new Car();

        myCar.run();

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
        // 배열 방식으로 할 때 끝
    }
}