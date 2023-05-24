package ch02.sec02;

public class LongExample {
    public static void main(String[] args){
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 1000000000000;
        //long 타입의 허용 범위를 초과
        //컴파일러는 기본적으로 int로 간주하기 때문에 뒤에 l,L을 붙여야함
        long var4 = 1000000000000l;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}