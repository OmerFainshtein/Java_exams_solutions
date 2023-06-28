public class a2017Moed86
{
    public static int edit(String str1, String str2)
    {
        return edit(str1, str2, 0);
    }
    public static int edit(String str1, String str2, int counter)
    {
        if(str1.length() == 0 && str2.length() == 0)
            return counter;
        if(str1.length() == 0)
        {
            counter += str2.length();
            return counter;
        }
        if(str2.length() == 0)
        {
            counter += str1.length();
            return counter;
        }
        if(str1.charAt(0) == str2.charAt(0))
            return edit(str1.substring(1), str2.substring(1), counter);
        return Math.min(edit(str1.substring(1), str2, counter+1), edit(str1, str2.substring(1), counter+1));
    }
}
