package javaStudy.MethodOrveride;

public class Computer extends Calculator{
    @Override
    double areaCircle(double r){
        System.out.println("computer의 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
