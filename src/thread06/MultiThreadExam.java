package thread06;

public class MultiThreadExam extends Thread {
    private Summing sum;
    private int num;

    public MultiThreadExam(String s, Summing sum, int num) {
        super(s);
        this.sum = sum;
        this.num = num;
        System.out.println("스레드 : " + getName() + "가 시작 됨");
    }

    public void run() {
        sum.sumTo(num);
        System.out.println("스레드 : " + getName() + "가 종료 됨");
    }

    public static void main(String[] args) {
        Summing sum = new Summing();
        MultiThreadExam a = new MultiThreadExam("A", sum, 5);
        MultiThreadExam b = new MultiThreadExam("B", sum, 5);
        a.setPriority(8);
        b.setPriority(10);
        a.start();
        b.start();
    }
}
