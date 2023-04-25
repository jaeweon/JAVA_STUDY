package Inheritance;

class A{
    String nameA = "A";
    int data = 10;
    public A(){
        System.out.println("부모 생성자 호출");
    }
}

class B extends A{
    String nameB = "B";

    public B(){
        // 부모 생성자, 생략 시 컴파일러가 컴파일 시 작성한다.
        super();
        System.out.println("자식 생성자 호출");
    }

    void printData(){
        System.out.println(data);
        System.out.println(nameA);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        B b = new B();
        b.printData();
        System.out.println(b.nameA);
        System.out.println(b.nameB);
    }
}
