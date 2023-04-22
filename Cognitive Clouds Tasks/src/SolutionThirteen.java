//13. Sort the numbers/words in ascending/descending order

import java.util.Arrays;

public class SolutionThirteen {
    public static void main(String[] args) {

        String line = "AruneshJain";
        char ascending[] = line.toCharArray();
        char descending[] = line.toCharArray();
        for(int i=0;i<line.length();i++)
        {
            for(int j=i;j<line.length();j++)
            {
                if(line.charAt(i)<line.charAt(j))
                {
                    char temp = descending[i];
                    descending[i]=descending[j];
                    descending[j]=temp;
                }
                else if (line.charAt(i)>line.charAt(j))
                {
                    char temp = ascending[i];
                    ascending[i]=ascending[j];
                    ascending[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));
    }
}
