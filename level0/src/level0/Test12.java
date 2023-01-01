package level0;

public class Test12 {
    public static void main(String[] args) {
        Test12 test = new Test12();
        String arg = "5 + -8 + 4 + 10";
        test.solution(arg);
        
    }

    public int solution(String my_string) {
        int answer = 0;
        String[] str_arr = my_string.split(" ");

        answer = Integer.parseInt(str_arr[0]);
        int next = 0;
        String cur = "";


        for(int i = 1; i < str_arr.length ; i++){
            if(i % 2 != 0){
                cur = str_arr[i];
            }else{
                if(cur.equals("+")){
                    answer += Integer.parseInt(str_arr[i]);
                }else{
                    answer -= Integer.parseInt(str_arr[i]);
                }
            }
        }

        // System.out.println(answer);
        return answer;
    }

}
