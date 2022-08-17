package thread05;

public class Runnable3Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        // Runnable 인터페이스를 사용한 구현 객체 생성
        Top t = new Top();
        // Thread(t, "a");에서 객체를 이용하여 스레드 객체를 생성하고
        // 스레드 이름을 "a"로 설정
        Thread thd1 = new Thread(t, "a");
        // Thread(t, "b");에서 객체를 이용하여 스레드 객체를 생성하고
        // 스레드 이름을 "b"로 설정
        Thread thd2 = new Thread(t, "b");

        System.out.println(thd1.getPriority()); // thd1 스레드 객체의 우선 순위 출력. 기본값은 5로 설정되어 있음
        System.out.println(thd2.getPriority());

        thd1.setName("new_a");  // thd1 스레드 객체의 이름을 "new_a"로 변경
        thd2.setName("new_b");  // thd2 스레드 객체의 이름을 "new_b"로 변경
        thd1.setPriority(9);    // thd1 스레드 객체의 우선 순위를 9로 변경
        thd2.setPriority(thd2.MIN_PRIORITY);    // thd2 스레드 객체의 우선 순위를 1로 변경
        System.out.println(thd1.getPriority());
        System.out.println(thd2.getPriority());

        thd1.start();   // thd1 스레드 객체 실행
        thd2.start();   // thd2 스레드 객체 실행
        System.out.println("프로그램 종료");
    }
}
