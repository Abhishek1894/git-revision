
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
    }    
}
