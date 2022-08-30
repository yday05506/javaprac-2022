package thread06;

public class MultiThreadExam extends Thread {
    private Summing sum;
    private int num;

    public MultiThreadExam(String s, Summing sum, int num) {
        super(s);   // 상위 클래스(Thread)의 생성자를 호출. Thread(s)
        // 스레드의 이름을 설정
        this.sum = sum; // 현재 실행하는 스레드의 객체에서 sum 객체
        this.num = num; // 현재 실행하는 스레드의 객체에서 num 값
        System.out.println("스레드 : " + this.getName() + "가 시작 됨");
    }

    public void run() {
        sum.sumTo(num);
        System.out.println("스레드 : " + getName() + "가 종료 됨");
    }

    public static void main(String[] args) {
        Summing sum = new Summing();
        MultiThreadExam a = new MultiThreadExam("A", sum, 5);
        MultiThreadExam b = new MultiThreadExam("B", sum, 7);
        a.setPriority(1);   // 우선 순위
        b.setPriority(10);
        a.start();
        b.start();
    }
}
