package thread03;

public class Top implements Runnable {   // Runnable은 인터페이스, Top은 구현 클래스
    public void run() {
        for(int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}
