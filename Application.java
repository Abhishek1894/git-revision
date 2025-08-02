
class General<T> 
{
    public void display(T value)
    {
        System.out.println(value);
    }
}


public class Application 
{
    public static void main(String args[])
    {
        System.out.println("Now we are working in feature1 branch");
        General<Integer> gen1 = new General<>();
        gen1.display(100);

        General<String> gen2 = new General<>();
        gen2.display("Abhishek");

        Double nums[] = {1.1,3.3,4.4,5.3,6.5,7.6,8.7,9.7};
        Another<Double> another = new Another<>(nums);
        System.out.println(another.sum().doubleValue());

        System.out.println("Here we will calculate factorail of some number");
        System.out.println(Factorial.fact(5));


        System.out.println("Here we will calculate the fibonacci of the number");
        System.out.println(Fibonacci.fib(7));

        System.out.println("Here we will check if strings are palindrome");
        System.out.println(Palindrome.check("abhishek", "kehsihba"));

    }    
}
