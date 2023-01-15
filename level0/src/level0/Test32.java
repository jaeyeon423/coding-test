package level0;

public class Test32 {
    public static void main(String[] args) {
        String my_string = "aa";
        String answer = "";
        my_string = my_string.replace("a", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("o", "");
        my_string = my_string.replace("u", "");

        System.out.println(my_string);

        answer = my_string;
    }
}
