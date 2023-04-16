//3. Reverse a string without using built in methods

import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String result = "";
        for(int i=0; i<line.length(); i++)
        {
            char ch = line.charAt(i);
            result = ch + result;
        }
        System.out.println(result);
    }
}
