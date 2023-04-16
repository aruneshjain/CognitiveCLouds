//10. Find the factorial of a number using recursion

public class SolutionTen {
    public static void main(String[] args) {
        int num = 8;
        long factorial = factorialCalc(num);
        System.out.println("Factorial of " + num + "is = " + factorial);
    }
    public static long factorialCalc(int num)
    {
        if (num >= 1)
            return num * factorialCalc(num - 1);
        else
            return 1;
    }
}
