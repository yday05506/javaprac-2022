package thread02;

public class Thread2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        DerivedThread d1 = new DerivedThread(); // d1 스레드 객체 생성
        DerivedThread d2 = new DerivedThread(); // d2 스레드 객체 생성

        d1.start(); // d1 스레드 객체에서 run() 메소드 실행
        d2.start(); // d2 스레드 객체에서 run() 메소드 실행

        System.out.println("프로그램 종료");
    }
}
