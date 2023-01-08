package level0;

public class Test19 {
    public static void main(String[] args) {
        Test19 test19 = new Test19();
        int[] test = {1,2,3,4,5};
        test19.solution(test);
    }

    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0 ; i < numbers.length - 1 ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                Math.max(answer, numbers[i] * numbers[j]);
                System.out.println(numbers[i] * numbers[j]);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
