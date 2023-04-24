public class MethodTask {
    void printFrom1To10(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }
// 홍길동을 10번 출력해주는 메소드
    void printHong(int cnt){
        for(int i = 0; i < cnt; i++){
            System.out.println("홍길동");
        }
    }
// 이름을 n번 출력하는 메소드
    void printName(String name, int cnt){
        for (int i = 0; i < cnt; i++) {
            System.out.println(name);
        }
    }
// 세 정수를 빼주는 메소드
    int sub(int num1, int num2, int num3){
        int result = num1 - num2 - num3;
        return result;
    }

// 두 정수의 나눗셈을 해주는 메소드(몫과 나머지)
    int[] div(int num1, int num2){
        int[] result = new int[2];
        result[0] = num1 / num2;
        result[1] = num1 % num2;
        return result;
    }

// 1 ~ n 까지의 합을 구해주는 메소드
    int sum1ToN(int n){
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += i + 1;
        }
        return total;
    }

// 홀수를 짝수로, 짝수를 홀수로 바쭤주는 메소드
    int change(int num){
        return ++num;
    }

// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
    String changeStr(String str){
        char c =' ';
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c >= 65 && c <= 90){
                result += (char)(c + 32);
            }else if (c >= 97 && c <= 122){
                result += (char)(c - 32);
            }else {
                result += c;
            }
        }
        return  result;
    }

// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
    int getCount(String str, char c){
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) cnt++;
        }
        return cnt;
    }


//

    public static void main(String[] args) {

        MethodTask methodTask = new MethodTask();
        int result = methodTask.change(2);


    }
}
