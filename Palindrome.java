
public class Palindrome
{
    public static boolean check(String val1, String val2)
    {
        if(val1.length() != val2.length())
            return false;

        int i = 0;
        int j = val2.length() - 1;

        while(i < val1.length() && j >= 0)
        {
            if(val1.charAt(i) != val2.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}