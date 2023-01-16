package level0;

public class Test45{
    public static void main(String[] args) {
        String s = "10 Z 20 Z";
        String[] s_arr = s.split(" ");
        int answer  = 0;

        int prev = 0;

        for(String num : s_arr){
            if(num.equals("Z")){
                answer -= prev;
            }else{
                answer += Integer.parseInt(num);
                prev = Integer.parseInt(num);
            }
        }

        System.out.println(answer);
    }
}