package level0;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 test = new Test8();
		test.solution(144);
	}
	
	public int solution(int n) {
        int answer = 1;
        int num = 1;
        while(true) {
        	answer = num*num;
        	if(answer >= n)
        		break;
        	num++;
        	
        }
        
        return (answer == n) ? 1 : 2;
    }

}
