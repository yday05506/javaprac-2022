package thread02;

public class DerivedThread extends Thread {   // Thread 클래스를 반드시 상속을 받아야 함
    public void run() {
        for(int i = 0; i < 20; i++) {
            System.out.print(i + "\t");
        }
    }
}
