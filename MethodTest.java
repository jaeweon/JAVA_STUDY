public class MethodTest {
    // f(x) = 2x + 1
    // 단, x는 정수이다.
   static int f(int x){
        return 2 * x + 1;
    }

    public static void main(String[] args) {
        // 메소드

//    f(3);   이렇게 사용하면 오류남 이유는 static 때문이다
//            static 은 컴파일 시 가장 먼저 메모리에 할당됨.
//            그러므로 위에서 f 선언 시 static을 같이 써준다
        // 1. 같이 satic 을 붙여서 사용한다
        // 2. 메소드의 클래스 소속을 앞에 붙여준다
        f(4);
    MethodTest methodTest = new MethodTest();
    methodTest.f(3);
    }
}