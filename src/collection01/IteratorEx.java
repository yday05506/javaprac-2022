package collection01;

import java.util.*;
public class IteratorEx {
    public static void main(String[] args) {
        // 정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<Integer>();
        v.add(5); // 5 삽입
        v.add(4); // 4 삽입
        v.add(-1); // -1 삽입
        v.add(2, 100); // 4와 -1 사이에 정수 100 삽입

        // Iterator를 이용한 모든 정수 출력하기
        // it은 v벡터 객체의 데이터를 순차적으로 접근할 수 있는 변수
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {   // v벡터에 데이터가 존재하면 true값 리턴
            int n = it.next();  // v벡터의 처음 데이터를 가져와서 n에 저장 → it은 그 다음 데이터를 가리킴
            System.out.println(n);
        }
        // Iterator를 이용하여 모든 정수 더하기
        int sum = 0;
        it = v.iterator(); // Iterator 객체 얻기
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}