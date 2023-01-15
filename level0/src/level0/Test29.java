package level0;

public class Test29{
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";

        int[] answer = new int[numbers.length];
        if(direction.equals("left")){
            for(int i = 1 ; i < numbers.length ; i++){
                answer[i-1] = numbers[i];
            }
            answer[answer.length - 1] = numbers[0]; 
        }else{
            for(int i = 0 ; i < numbers.length -1 ; i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }
    }
}