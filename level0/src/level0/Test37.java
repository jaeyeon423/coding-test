package level0;

public class Test37 {
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + " -> " +isMix(i));    
            if(isMix(i) > 2){
                
                answer++;
            }
        }

    }

    static public int isMix(int number){
        int cnt = 0;
        for(int i = 1 ; i <= number ; i++){
            if(number%i ==0) cnt++;
        }
        return cnt;
    }
}
