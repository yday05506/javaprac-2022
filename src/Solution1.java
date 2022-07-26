public class Solution1 {
    public int solution(int num) {
        int answer = 0;
        double num2 = num;
        int cnt = 0;
        while (num2 != 1) {
            if (num2 % 2 == 0) {
                ++cnt;
                num2 /= 2;
            } else {
                ++cnt;
                num2 = num2 * 3 + 1;
            }
        }
        answer = cnt;
        if (cnt >= 500) answer = -1;
        return answer;
    }
}
