package Variable;

public class Variable2 {
    public static void main(String[] args) {

        Variable1 v1 = new Variable1();
        Variable1 v2 = new Variable1();
        v1.data = 10; // 전역 변수
        v2.data = 30;

        System.out.println(v1.data);
        System.out.println(v2.data);

        v1.data_s = 15; // 정적 변수 static
        v2.data_s = 309;
        System.out.println(v1.data_s);
        System.out.println(v2.data_s);






//        Variable1 v1 = new Variable1();

//        Variable1.increaseData_s(); // 정적변수는 class로 호출 가능(편의성)
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1 = new Variable1(); // static 은 생성자로 할당되지 않는다
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1.increaseData_s();
//        v1.increaseData_s();



//        v1.increaseData();
//        v1.increaseData();
//        v1.increaseData();
//        v1.increaseData();
//        v1.increaseData();
//        v1 = new Variable1(); // 전역변수 new 만나면 초기화
//        v1.increaseData();
//        v1.increaseData();
//        v1.increaseData();
//        v1.increaseData();
//        v1.increaseData();

    }
}
