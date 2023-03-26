package javaStudy;

public class Korean {
    // 필드
    String nation = "대한민국";
    String name;
    String ssn;

    String test;

    // 생성자
    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    void KoreanTest(String abc){
        System.out.println(abc);
    }
    
    int KoreanNumberTest(int testNumber){
        return testNumber;
    }
}
