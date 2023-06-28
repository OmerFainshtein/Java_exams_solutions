
/**
 * Write a description of class TesterB2022Moed91 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterB2022Moed91 extends b2022Moed91
{
    public static void main (String [] args)
    {
        int [] a = {2,4,8,3,10,1,12,3,2};
        System.out.println("***********question number 1");
        System.out.println(cheapRt(a,3,2,4));
        
        
        System.out.println("***********question number 2");
        int [] b = {-4,1,-8,9,6};
        System.out.println("should be 288 and was: " + findTriplet(b));
    }
}
