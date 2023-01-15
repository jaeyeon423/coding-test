package level0;

public class Test25 {
    public static void main(String[] args) {
        int order = 29423;
        int answer= 0;
        String[] order_arr = Integer.toString(order).split("");

        for(String num : order_arr){
            System.out.println(num);
            if(num.equals("3")){
                
                answer++;
            }
        }
    }
}
