package javaStudy;

public class KoreanEx {
    public static void main(String[] args){
        Korean k1 = new Korean("우정호", "123456-1234567");
        System.out.println("k1.name = "+k1.name);
        System.out.println("k1.name = "+k1.ssn);

        k1.KoreanTest("???");
        int k2 = k1.KoreanNumberTest(12);
        System.out.println(k2);
    }
}
