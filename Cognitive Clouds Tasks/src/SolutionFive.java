//5. Find the prime numbers in an array

public class SolutionFive {
    public static void main(String[] args) {
        int numbers[] = new int[]{55,88,4,66,25,34,58,95,12,13,77,5};
        for(int i=0;i<numbers.length;i++)
        {
            boolean flag = true;
            if(numbers[i]==0 || numbers[i]==1)
                continue;
            for(int j = 2; j<numbers[i]/2; j++)
            {
                if(numbers[i]%j == 0) {
                    flag = false;
                    continue;
                }
            }
            if(flag)
                System.out.print(numbers[i] + ", ");
        }
    }
}
