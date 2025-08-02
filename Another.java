public class Another<T extends Number>
{
    T [] array;

    public Another()
    {
        array = null;
    }

    public Another(T[] nums)
    {
        this.array = nums;
    }


    public T sum()
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i].doubleValue();

        return (T) (Number) sum;
    }
}
