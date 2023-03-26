package javaStudy.exam;

public class NationChild extends NationParent{
    
    private String name;

    public NationChild(){
        this("홍길동");
        System.out.println("Child() call");
    }

    public NationChild(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
