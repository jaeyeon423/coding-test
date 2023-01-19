public class Test3 {
    public static void main(String[] args) {
        Test3 test = new Test3();
        long tmp = test.solution(3);

        System.out.println(tmp);
    } 

    public long solution(long n) {
        long answer = 0;
        for(long i = 1 ; i <= n /2 + 1; i++){
            if(i*i > n ){
                return -1;
            }else if(i*i == n){
                return (i+1)*(i+1);
            }
        }
        return answer;
    }
}
