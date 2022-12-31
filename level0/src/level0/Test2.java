package level0;

public class Test2 {

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.runTest();
	}
	
	void runTest() {
		int[] test1 = {1, 2, 3, 4};
		int[] test2 = {2, 4, 8};
		int[] test3 = {3, 9, 27};
		
		solution(test1);
		solution(test2);
		solution(test3);
		
	}
	
	public int solution(int[] common) {
        int answer = 0;
        
        int condition1 = common[1] - common[0];
        int condition2 = common[2] - common[1];
        
        if(condition2 == condition1) {
        	answer = common[common.length-1] + condition1;
        }else {
        	int multi = common[1] / common[0];
        	answer = common[common.length-1]*multi;
        }
        
        
//        System.out.println(answer);
        return answer;
    }

}
