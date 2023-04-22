//1. Find the odd and even numbers in the array

import java.util.Arrays;

public class SolutionOne {
    public static void main(String[] args) {
        int numbers[] = new int[]{0,1,2,3,4,5,6,7,8,9}; // can be different as per users
        int odd[] = new int[5];
        int even[] = new int[5];
        int o=0,e=0; //for iterate odd and even array;
        for(int i=0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                even[e]= numbers[i];
                e++;
            }
            else
            {
                odd[o]=numbers[i];
                o++;
            }
        }

        System.out.println("Even Numbers : " + Arrays.toString(even));
        System.out.println("Odd Numbers : " + Arrays.toString(odd));
    }
}
