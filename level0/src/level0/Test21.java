package level0;

public class Test21 {
    public static void main(String[] args) {
        Test21 test21 = new Test21();
        test21.solution(155040);
    }

    public int solution(int price) {
        int answer = 0;
        double price_db = price;
        if(price_db > 500000){
            answer = (int)(price_db * 0.8);
        }else if(price > 300000){
            answer = (int)(price_db * 0.9);
        }else if(price > 100000){
            answer = (int)(price_db * 0.95);
        }
        return answer;
    }
}
