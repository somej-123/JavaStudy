package javaStudy.exam;

public class NationParent {
    public String nation;

    public NationParent(){
        this("대한민국");
        System.out.println("Parent() call");
    }

    public NationParent(String nation){
        this.nation = nation;
    }
}
