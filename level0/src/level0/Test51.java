package level0;

public class Test51 {
    public static void main(String[] args) {
        String[] dic  = {"def", "dww", "dzx", "loveaw"};
        String[] spell = {"z", "d", "x"};

        for(String d : dic){
            if(d.length() >= spell.length){
                for(String s : spell){
                    d = d.replaceFirst(s, "");
                }       
            }
            if(d.length() == 0){
                // System.out.println("dddd");
                // return 1;
            }
        }

        // return 2;
    }
}
