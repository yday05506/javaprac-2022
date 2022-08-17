package thread04;

public class Top extends Thread {   // Thread 클래스를 반드시 상속을 받아야 함
    public void run() {
        for(int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}
