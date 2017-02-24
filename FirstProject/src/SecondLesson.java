/**
 * Created by todd on 18/2/17.
 */
public class SecondLesson {
    public static void main (String [] args){
        String s = "hello";

        if (s.equalsIgnoreCase("hello")){
            System.out.println("Hello 1");
        };

        if (s == "hello"){
            System.out.print("Hello 2");
        }

        int i = 0;
        while (i < s.length()){
            System.out.println(s.charAt(i));
            i++;
        }

        for (int j=0;j<s.length();j++){
            System.out.println(s.charAt(j));
        }
    }
}
