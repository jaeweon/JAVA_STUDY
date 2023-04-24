

class A{
    int data = 100;
    void printData(){
        System.out.println(data);
    }



}

public class ClassTest {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        System.out.println(a); // 주소 값
        a.printData(); // 100
        a.data = 200;
        a.printData(); // 200
        a2.data = 300;
        a2.printData(); // 300

    }
}
