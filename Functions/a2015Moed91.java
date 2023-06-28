public class a2015Moed91
{
    //question number 1
    public static int makeSum(int [] lengths, int k, int num)
    {
        return makeSum(lengths,k,num,0);
    }
    private static int makeSum(int [] lengths, int k, int num, int i)
    {
       if(i==lengths.length||num<0) 
           return 0;
       if(k==0)
           return 1;
    
       return makeSum(lengths,k,num,i+1) + makeSum(lengths, k-lengths[i],num-1,i);//check with this length value and without him ( without - i++ and k&num stay , with - i stay, k&num changing.
    }
    
    
    //code tracking.. 
}
