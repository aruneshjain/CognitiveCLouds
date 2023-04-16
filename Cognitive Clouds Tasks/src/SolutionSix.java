
public class SolutionSix {
    public static void main(String []args)
    {
        int numbers[]=new int[]{55,48,75,69,44,51,5,84,81};
        int highest=numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i] > highest)
                highest = numbers[i];
        }

        System.out.print("Highest Number Available in Array : " + highest);
    }
}
