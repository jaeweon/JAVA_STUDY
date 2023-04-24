
class Car{
    String brand; // 전역 변수
    String color;
    int price;


    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public Car(int price) { // 오버로딩
        this.price = price;
    }


    void engineStart(){ // method에서 선언된 변수 : 지역변수
        System.out.println(this); // this : 접근한 객체의 주소를 받는다
//        필드에 접근한 객체가 누구인지 알아야 해당 필드에 접근할 수 있다.
//        이 때 접근한 객체가 가지고 있는 필드의 주소값을 this라는 변수에 담을 수 있으며,
//                자동으로 담기게 된다.
        System.out.println(this.brand + " 시동킴");
    }
}



public class Road {
    public static void main(String[] args) {
        Car mom = new Car("Benz", "Black", 10000);
        Car dady = new Car("BMW", "Blue", 230000);
        Car me = new Car(2000);


//        mom.brand = "Benz";
//        mom.color = "Black";
//        mom.price = 100000;
        mom.engineStart();
        System.out.println(mom);

//        dady.brand = "BMW";
//        dady.color = "Blue";
//        dady.price = 20001;
        dady.engineStart();
        System.out.println(dady);


    }
}
