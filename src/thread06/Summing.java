package thread06;

public class Summing {
    private int sum;

    public synchronized void sumTo(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
            System.out.print("스레드 : " + Thread.currentThread().getName());
            System.out.println("의 1 ~ " + i + "까지 합은 " + sum);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
    public int getSum() {return sum;}
}
