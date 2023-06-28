
/**
 * Write a description of class TesterA2015Moed89 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterA2015Moed89 extends a2015Moed89
{
    public static void main(String [] args)
    {
        int [] a = {2,15,3,4,2,5};
        int [] b = {2,4,6,2,3,4};
        System.out.println("********question number 1");
        System.out.println("should be true and was: " + splitEqualMult(a));
        System.out.println("should be false and was: " + splitEqualMult(b));
       
        
        
        System.out.println("********question number 2");
        int [] c = {1,2,5,3,6,10,9};
        System.out.println("should be true and was: " + findX(c,9));
        System.out.println("should be false and was: " + findX(c,5));
    }
}
