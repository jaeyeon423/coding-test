package level0;

public class Test48 {
    public static void main(String[] args) {
        int n = 40;

        int answer = 1;

        for(int i = 2; i <= n ; i++){
            answer++;
            while(answer % 3 ==0 || Integer.toString(answer).contains("3")){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
