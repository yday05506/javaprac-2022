package thread03;

public class Runnable1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        // Runnable 인터페이스를 이용하여 구현 클래스의 객체 생성(t)
        Top t = new Top();  // 1
        // Thread(t) 생성자에 의해 thd라는 스레드 객체 생성
        Thread thd = new Thread(t); // 2
        
        // Thread thd = new Thread(new Top()); // 위의 표현을 한 문장으로 표현

        thd.start();

        System.out.println("프로그램 종료");
    }
}
