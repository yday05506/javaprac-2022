package collection01;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        // v벡터의 기억공간의 개수는 10개로 설정
        // 만약 입력하려는 데이터가 10개가 넘어가는 순간 자동으로 확장(10개 추가)
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        // 데이터 삽입
        v.add(5);   // 0번째
        v.add(4);   // 1번째
        v.add(-1);  // 2번째

        // 2번째에 있는 데이터를 세 번째로 자동으로 이동하고 2번째에 100을 삽입
        v.add(2, 100);

        // 실제 데이터가 들어있는 개수
        System.out.println("벡터 내의 요소 개체 수 : " + v.size());
        // 벡터의 전체 용량
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        for(int i = 0; i < v.size(); i++) {
            int n = v.get(i);   // v벡터에 들어있는 데이터를 순차적으로 읽어 자동으로 언박싱(기본형으로 변환)하여 n에 저장
            System.out.println(n);
        }

        int sum = 0;
        for(int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("벡터에 있는 정수의 합 : " + sum);
    }
}
