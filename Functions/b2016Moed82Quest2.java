
/**
 * Write a description of class b2016Moed2Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class b2016Moed82Quest2
   {
       private int _smallest, _largest;
   public b2016Moed82Quest2(int sm, int la)
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
    
   
    
   public static boolean isSum(b2016Moed82Quest2 [] a, int x)
    {
       int i=0;
       int j=a.length-1;
       int high=a[j].getLargest();
       int low=a[i].getSmallest();
       while(low<high)
       {
            if(high+low==x)
               return true;
            if(high+low>x)
                high--;
            else low++;
            if(high<a[j].getSmallest())
            {
                j--;
                high=a[j].getLargest();
            }
            if(low>a[i].getLargest())
            {
                i++;
                low=a[i].getSmallest();
            }
       }
       return false;
   }
   
   public static void main(String [] args)
    {
        System.out.println("question number 2");
        b2016Moed82Quest2 [] range = {new b2016Moed82Quest2(3,5), new b2016Moed82Quest2(12,12), new b2016Moed82Quest2(19,20), new b2016Moed82Quest2(100,104)};
        System.out.println("should be true and was: " + isSum(range,22));
        System.out.println("should be true and was: " + isSum(range,113));
        System.out.println("should be true and was: " + isSum(range,202));
        System.out.println("should be false and was: " + isSum(range,38));
        System.out.println("should be false and was: " + isSum(range,53));
    }
}
