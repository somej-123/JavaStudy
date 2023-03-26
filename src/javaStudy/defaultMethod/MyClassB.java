package javaStudy.defaultMethod;

public class MyClassB implements MyInterface{
    @Override
    public void method1(){
        System.out.println("MyClass-method1() 실행");
    }

    // 디폴트 메소드 재정의
    @Override
    public void method2(){
        System.out.println("MyClass-method2() 실행");
    }
}
