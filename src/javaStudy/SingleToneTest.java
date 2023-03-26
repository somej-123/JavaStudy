package javaStudy;

public class SingleToneTest {
    private static SingleToneTest singletone = new SingleToneTest();

    private SingleToneTest(){

    }

    static SingleToneTest getInstancSingleToneTest(){
        return singletone;
    }
}
