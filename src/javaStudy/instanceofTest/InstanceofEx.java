package javaStudy.instanceofTest;

public class InstanceofEx {
    public static void method1(Parent parent) {
        // Child 타입으로 변환 가능한지 확인
        if(parent instanceof Child){
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        }else{
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(Parent parent){
        // ClassCastException이 발생할 가능성이 있음
        Child child = (Child) parent;
        System.out.println("method2 - Child로 변환 성공");
    }

    public static void main(String[] args){
        // Child 객체를 매개값으로 전달
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        // Parent 객체를 매개값으로 전달
        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB);
    }
}
