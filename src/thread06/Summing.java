package thread06;

public class Summing {
    private int sum;

    public synchronized void sumTo(int num) {   // 메소드를 동기화
        // 동기화는 스레드 객체가 먼저 실행하는 쪽이 이 메소드를
        // 실행 종료까지 점유하게 됨
        sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
            // 현재 스레드의 이름을 출력한다.
            System.out.print("스레드 : " + Thread.currentThread().getName());
            System.out.println("의 1 ~ " + i + "까지 합은 " + sum);

            try {
                Thread.sleep(500);  // 0.5초 실행을 지연
            } catch (InterruptedException e) {}
        }
    }
    public int getSum() {return sum;}
}
