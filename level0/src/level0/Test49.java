package level0;

import java.util.ArrayList;

public class Test49 {
    public static void main(String[] args) {
        int n = 420;

        ArrayList<Integer> n_list = new ArrayList<>();

        while(n > 1){
            for(int i = 2; i <= n ; i++){
                if(n % i == 0){
                    if(!n_list.contains(i)){
                        n_list.add(i);
                    }
                    n /= i;
                    break;
                }
            }
        }

        int[] answer = new int[n_list.size()];

        for(int i = 0 ; i < answer.length; i++){
            answer[i] = n_list.get(i);
        }

        System.out.println(n_list);
    }
}
