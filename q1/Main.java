import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        String[] in_arr = input.split(" ");
        int x = Integer.parseInt(in_arr[0]);
        int y = Integer.parseInt(in_arr[1]);
        
        int answer = 0;
		System.out.println("Hello Goorm! Your input is " + input);
	}
}