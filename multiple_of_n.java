class Solution {
    public int solution(int num, int n) {
        int answer = 0; // 정수형 변수 answer를 선언하고 0으로 초기화
        
        if (num % n == 0) { // num이 n의 배수인지 확인
            answer = 1;
        } else { // if 조건이 만족되지 않으면 else 블록 안의 코드를 실행
            answer = 0;
        }
        
        return answer;
    }
}
