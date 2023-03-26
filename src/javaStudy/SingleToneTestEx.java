package javaStudy;

public class SingleToneTestEx {
    public static void main(String[] args){
        
        // SingleToneTest obj1 = new SingleToneTestEx(); // 컴파일 에러
        // SingleToneTest obj2 = new SingleToneTestEx(); // 컴파일 에러

        SingleToneTest obj1 = SingleToneTest.getInstancSingleToneTest();
        SingleToneTest obj2 = SingleToneTest.getInstancSingleToneTest();

        if(obj1 == obj2){
            System.out.println("같은 singleton 객체 입니다.");
        }else{
            System.out.println("다른 singleton 입니다.");
        }
    }
}
