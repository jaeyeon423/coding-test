package level0;

public class Test15{
    public static void main(String[] args) {
        
    }

    public int solution(int slice, int n) {
        int answer = 0;
        int num = n / slice;
        int last = n % slice;
        return (last == 0) ? num : num+1;
    }
}