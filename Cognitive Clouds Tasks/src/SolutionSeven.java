
public class SolutionSeven {
    public static void main(String[] args) {

        int number[] = new int[]{55,48,75,69,44,51,5,84,81};

        for(int i=0; i<number.length;i++)
        {
            for(int j=i+1; j<number.length; j++)
            {
                if(number[i] > number[j])
                {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.print("Third lowest number is : " + number[2]);
    }
}
