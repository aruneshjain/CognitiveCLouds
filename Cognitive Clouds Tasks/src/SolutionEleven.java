//11. Find if the word is a palindrome

public class SolutionEleven {
    public static void main(String[] args) {

        String str = "abcdcba";
        int len = str.length()-1;
        boolean result = true;

        for(int i=0 ; i <= len/2; i++)
        {
            if(str.charAt(i)!=str.charAt(len)){
                result = false;
                break;
            }
            len--;
        }
        System.out.println(str + " is a Palindrome : "+ result);
    }
}
