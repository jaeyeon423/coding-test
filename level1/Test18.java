public class Test18 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};

        int len = number.length;
        int answer = 0;

        for(int i = 0 ; i < len-2; i++){
            for(int j = i+1 ; j < len-1 ; j++){
                for(int k = j+1 ; k < len ; k++){
                    if((number[i] + number[j] + number[k]) == 0)
                        answer++;
                }
            }
        }
        
    }


}
