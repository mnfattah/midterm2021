package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        //https://www.javatpoint.com/java-program-to-determine-whether-a-given-string-is-palindrome

        String string = "MADAM";
        boolean flag = true;

        //Converts the given string into lowercase
        string = string.toLowerCase();

        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given string "+string+" is palindrome");
        else
            System.out.println("Given string "+string+" is not a palindrome");

    }
}
