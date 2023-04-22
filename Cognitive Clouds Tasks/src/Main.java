// # Interview question

import java.io.*;
class Main {
    public static void main(String[] args) {

        String str = "ABCABCD";
        String result= String.valueOf(str.charAt(0));
        for(int i=1; i < str.length();i++)
        {
            char ch = str.charAt(i);
            boolean flag=true;
            for(int j=0;j < result.length();j++)
            {
                if(result.charAt(j)==ch)
                    flag=false;
            }
            if(flag)
                result = result + ch;
        }
        System.out.println(result);
    }
}