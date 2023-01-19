public class Test{
    public static void main(String[] args) {
        Test test = new Test();
        test.solution(123456789);
    }   
    public int[] solution(long n) {
        String str = String.valueOf(n); // 1-1 long type의 n을 String으로 변환
        int[] answer = new int[str.length()]; // 1-2 변환한 문자열의 길이를 answer의 배열 길이로 입력
        int index = 0;
        while(n > 0){
            long num = n % 10; // 2 마지막 자리의 수를 계산
            n /= 10; // 3-1 다음 자리수를 위해 10으로 나눈다.
            answer[index++] = (int)num;  //3-2 구한 값을 배열에 순서대로 넣는다.
        }
        return answer;
    }
}