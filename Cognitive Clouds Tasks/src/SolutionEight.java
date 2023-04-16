//8. Generate Fibonacci series

public class SolutionEight {
    public static void main(String[] args) {

        int one=0,two=1,sum=0,count=15;
        System.out.print("Fibonacci Series : " + one+" "+two);//printing first two numbers

        for(int i=2;i<count;++i)
        {
            sum=one+two;
            System.out.print(" "+sum);
            one=two;
            two=sum;
        }
    }
}
