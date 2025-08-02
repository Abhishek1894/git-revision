public class Factorial 
{
    public static int fact(int n)
    {
        if(n == 1 || n == 0)
            return n;

        return n * fact(n - 1);
    }    
}
