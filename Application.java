
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
        General<Integer> gen1 = new General<>();
        gen1.display(100);

        General<String> gen2 = new General<>();
        gen2.display("Abhishek");

        Double nums[] = {1.1,3.3,4.4,5.3,6.5,7.6,8.7,9.7};
        Another<Double> another = new Another<>(nums);
        System.out.println(another.sum().doubleValue());

    }    
}
