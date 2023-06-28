
/**
 * Write a description of class a2013Moed92 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class a2013Moed92
{
    public static boolean match(int [] a, int [] pattern)
    {
        if(pattern.length==0)//empty pattern
            return true;
        return match(a,pattern,0,0,0);
    }
    private static boolean match(int [] a, int [] pattern, int i, int j, int strike)
    {
        if(strike==pattern.length)//find subArray with the required conditions
            return true;
        if(i==a.length && j!=pattern.length)//finish a and didnt reach subArray
            return false;
        if(j==pattern.length)//start the index from 0 in pattern
            j=0;
        if(pattern[j]==0) 
        {
            if(a[i]>=0 && a[i]<=99)
                return match(a,pattern,i+1,j+1,strike+1);  
        }
        if(pattern[j]==1)
        {
            if(a[i]<10 && a[i]>=0)
                return match(a,pattern,i+1,j+1,strike+1);
        }
        if(pattern[j]==2)
        {
            if(a[i]>=10 && a[i]<=99)
                return match(a,pattern,i+1,j+1,strike+1);
        }
        if(a[i]<0||a[i]>99)
        {
            return match(a,pattern,i+1,0,0);
        }
        return false;
    }
}
