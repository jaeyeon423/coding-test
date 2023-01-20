public class Test8 {
    public static void main(String[] args) {
        Test8 test = new Test8();
        test.solution(13, 17);
            
    }

    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right ; i++){
            if(get_divisor(i)){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }

    public boolean get_divisor(int n){
        int cnt = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0 )
                cnt++;
        }
        return (cnt %2 == 0) ? true : false;
    }
}
