public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        while(n % x != 1) {
            x++;
            if(n % x == 1) {
                answer = x;
                break;
            }
        }
        return answer;
    }
}

