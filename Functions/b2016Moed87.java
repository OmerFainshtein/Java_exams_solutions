
/**
 * Write a description of class b2016Moed87 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class b2016Moed87
{
    //question number 1
    
    public static int count(int num)
    {
        if(num==0)//given that the empty series is increasing series with 0 items
            return 0;
        return count(num,1);
    }
    private static int count(int num, int i)
    {
        if(num<0)
            return 0;
        if(num==0)
            return 1;
        if(i>num)//this if must be after the num==0 condition, if he in the first condition the program act like i calculate with current num and dont have a chance to return 1
            return 0;
        return  count(num-i,i+1) + count(num,i+1);
    }
}
