public class Java100_variable_HelloJava {
    public static void main(String[] args) {
        int a; // Java에서 변수 초기화 진행..?? New로 선언하면 자동으로 초기화해준다고 봄..
        int b;
        int sum;

        a = 3;
        b = 4; // 우선 여기서 명시적으로 초기화 시켜줌
        sum = a + b;

        System.out.println(a + b);
        System.out.println(sum);
    }
}
