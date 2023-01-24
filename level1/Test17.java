public class Test17 {
    
    public static void main(String[] args) {

        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 5;

        String[] answer = new String[n];

        for(int i = 0 ; i < n ; i++){
            int n1 = arr1[i];
            int n2 = arr2[i];

            String n1_str = "";
            n1_str = get_arr(n1_str, n1, n);
            String n2_str = "";
            n2_str = get_arr(n2_str, n2, n);

            String n_str = "";

            for(int j = 0 ; j < n ; j++){
                if(n1_str.charAt(j) == '1' || n2_str.charAt(j) == '1'){
                    n_str += "#";
                }else{
                    n_str += " ";
                }
            }

            answer[i] = n_str;

            
            // System.out.println(n2_str);

        }
        
    }
    public static String get_arr(String n_str, int n, int len){
        while(n > 0){
            if(n % 2 == 0){
                n_str = 0 + n_str;
            }else{
                n_str = 1 + n_str;
            }

            n /=2;
        }

        if(n_str.length() <= len){
            int word_cnt = len-n_str.length();
            for(int j = 0 ; j < word_cnt ; j++){
                n_str = "0" + n_str; 
            }
        }
        return n_str;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        return answer;
    }
}
