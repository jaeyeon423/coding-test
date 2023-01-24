public class Test15 {
    public static void main(String[] args) {
        String s = "az";
        int n = 4;

        String answer = " ";

        char[] char_arr = s.toCharArray();
        for(char c : char_arr){
            if(c == " ".charAt(0)){
                answer += " ";
            }else if(c <= 'Z'){
                int tmp = c + n;
                if(tmp > 'Z'){
                    tmp -= 'Z';
                }
            }else{

            }
        }
    }
}
