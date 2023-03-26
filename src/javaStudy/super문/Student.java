package javaStudy.super문;

public class Student extends People{
    public int StudentNo;

    public Student(String name, String ssn, int StudentNo){
        // 부모생성자 호출
        super(name, ssn);
        this.StudentNo = StudentNo;
    }
}
