package level0;

public class Test22 {
    public static void main(String[] args) {
        int[] board = {7,9};
        String[] input = {"up", "up", "up", "up", "up", "down"};
        Test22 test22 = new Test22();
        test22.solution(input, board);
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int max_right = board[0]/2;
        int max_left = -(board[0]/2);
        int max_top = board[1]/2;
        int max_bottom = -(board[1]/2);

        for(String word : keyinput){
            if(word.equals("left")){
                if(Math.abs(answer[0]) < -max_left){
                    answer[0]--;
                }

            }else if(word.equals("right")){
                if(answer[0] < max_right){
                    answer[0]++;
                }

            }else if(word.equals("up")){
                if(answer[1] < max_top){
                    answer[1]++;
                }

            }else{
                if(Math.abs(answer[1]) < -max_bottom){
                    answer[1]--;
                }

            }
            System.out.println(answer[0]+" "+answer[1]);
        }

        return answer;
    }
}
