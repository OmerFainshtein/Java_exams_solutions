public class b2016Moed82
{
   //QESTION NUMBER 1 PART A
   //remember the sum of all array and use binary search to move in array
   public static int where(int [] vec)
   {
       return where(vec,0,vec.length-1,0);
   }
   private static int where(int[]vec, int left, int right, int p)
   {
      if(p>right)
        return -1;
      if(sum(vec,left,p-1,0)==sum(vec,p,right,0))
        return p;
      return where(vec,left, right, p+1);
   }
   private static int sum(int[]vec, int start, int end, int sum)
   {
      if(start>end)
    return sum;
      sum+=vec[start];
      return sum(vec,start+1,end,sum);
   }
   
   public static boolean isBalanced(int [] vec, int k)
   {
       return isBalanced(vec,0,vec.length-1,k);
   }
   public static boolean isBalanced(int [] vec, int left, int right,int k)
   {
       if(k==0)
           return true;
       int p=where(vec,left,right,left+1);
       if(p==-1)
           return false;
       return isBalanced(vec,left,p-1,k-1) && isBalanced(vec,p,right,k-1);
   }
   
   
   //question number 2
   
   public class Range
   {
        private int _smallest, _largest;
       public Range(int sm, int la)
       {
           _smallest=sm;
           _largest=la;
       }
       public int getSmallest()
       {
           return _smallest;
       }
        public int getLargest()
       {
           return _largest;
       }
   }
    
   public static boolean isSum(Range [] a, int x)
    {
       int i=0;
       int j=a.length-1;
       int high=a[j].getLargest();
       int low=a[i].getSmallest();
       while(high!=low)
       {
            if(high+low==x)
               return true;
            if(high+low>x)
                high--;
            else low++;
            if(high<a[j].getSmallest())
                j--;
            if(low>a[i].getLargest())
                i++;
       }
       return false;
   }
}