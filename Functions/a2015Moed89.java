//qustion number 1
public class a2015Moed89
{
    public static boolean splitEqualMult(int [] a)
    {
        return splitEqualMult(a,1,1,0);//start sum from 1 so mult no stand with 0 and will get true always
    }
    public static boolean splitEqualMult(int [] a, int sum1, int sum2, int i)
    {
        if(i==a.length)//if we reach the end of array we will check if there is an equal between sum 1 and sum2
        {
                if(sum1==sum2)
                    return true;
                return false;
        }
        return splitEqualMult(a,sum1*a[i],sum2,i+1)||splitEqualMult(a,sum1,sum2*a[i],i+1);//mult a[i] by sum 1 or sum 2 
    }
    
    
    //question number 2
    public static boolean findX(int [] a, int x)
    {
        int left = 0;
        int right = a.length-1;
        int mid = (left+right)/2;
        while(left<=right)
        {
            if(mid+1>a.length-1 || mid-1<0)
                return false;
            if(a[mid]+a[mid+1] == x || a[mid]+a[mid-1]==x)
                return true;
            if(a[mid]+a[mid+1]>x)
            {
                right=mid;
                mid=(right+left)/2;
            }
            else{
                left=mid+1;
                mid=(right+left)/2;
            }
        }
        return false;
    }
}
