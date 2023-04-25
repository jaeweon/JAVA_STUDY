package Inheritance;

// 부모 클래스
class Human{
    void eat(){
        System.out.println("먹기");
    }
    void sleep(){
        System.out.println("자기");
    }
    void walk(){
        System.out.println("두 발로 걷기");
    }
}

// 자식 클래스
class Monkey extends Human{
    void eatLouse(){
        System.out.println("냠냠");
    }

    @Override
    void walk() {
        // 덮어 쓰기전에 부모의 기능을 가져와 사용한다.
        // 부모의 기능을 그대로 쓰면서 몇 가지를 추가할 때 사용한다.
        // 하지만 부모의 기능을 완전 다 갈아 엎을 때는 쓰지 않는다.
        System.out.println("네 발로 걷기");
    }
}

public class InheritanceTest2 {
    public static void main(String[] args) {
        Monkey kingkong = new Monkey();
        kingkong.walk();
        Human human = new Human();
        human.walk();
    }
}