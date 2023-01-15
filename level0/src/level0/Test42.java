package level0;

public class Test42 {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        int[] sc_arr = new int[score.length];
        int index = 0;
        for(int[] ar : score){
            System.out.println(ar[0] + " " + ar[1]);
            sc_arr[index] = (ar[0] + ar[1]) / 2;
            index++; 
        }

        int[] answer = new int[score.length];
        int ans = 1;
        for(int tmp : sc_arr){
            int idx = 0;
            int max = Integer.MIN_VALUE;

            for(int i = 0 ; i < sc_arr.length; i++){
                if(max < sc_arr[i]){
                    max = sc_arr[i];
                    idx = i;
                }
            }

            answer[idx] = ans;
            ans++;
            sc_arr[idx] = Integer.MIN_VALUE;

        }
    }
    

    
}
