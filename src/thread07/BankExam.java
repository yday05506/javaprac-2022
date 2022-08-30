package thread07;

public class BankExam {
    // mybank는 클래스 변수(전역 변수)
    public static Bank mybank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금 : " + mybank.getMoney());
        Family1 f1 = new Family1();
        Family2 f2 = new Family2();

        f1.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f2.start();
    }
}
