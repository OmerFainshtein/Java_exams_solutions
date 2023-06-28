
/**
 * Write a description of class TesterB2018Moed83 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterB2018Moed83 extends b2018Moed83
{
    public static void main (String [] args)
    {
        int [][] drm = {{2,0,1,2,3},{2,3,5,5,4},{8,-1,6,8,7},{3,4,7,2,4},{2,4,3,1,2}};
        System.out.println("**********question number 1");
        System.out.println("should be 4 and was: " + prince(drm,0,0));
        
        System.out.println("**********question number 2");
        int [] a = {6,6,18,18,-4,-4,12,9,9};
        int [] b = {8,8,-7,-7,3,3,0,0,10,10,5,5,4};
        int [] c = {5};
        System.out.println("should be 12 and was: " + findSingle(a));
        System.out.println("should be 4 and was: " + findSingle(b));
        System.out.println("should be 5 and was: " + findSingle(c));
    }
}
