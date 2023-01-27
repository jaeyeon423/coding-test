public class Test19 {
    public static void main(String[] args) {
        Test19 test = new Test19();
        test.solution(3, 2, 20);
    }

    public int solution(int a, int b, int n) {
        int answer = get_cok(a,b,n,0);
        System.out.println("answer = " + answer);
        return answer;
    }
    
    public int get_cok(int a, int b, int n, int total){
        System.out.println(total);
        if(n < a || n < 2){
            return total;
        }else{
            return get_cok(a, b, n - (n/a * a) + (n/a * b), total+n/a*b );
        }
    }
}
