
/**
 * Write a description of class TesterA2018Moed85 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterA2018Moed85 extends a2018Moed85
{
    public static void main (String [] args)
    {
        int [][] mat = {{3,13,15,28,30},{55,54,53,27,26},{54,12,52,51,50},{50,10,8,53,11}};
        System.out.println("*************question number 1");
        System.out.println("should be 3 and was: " + longestSlope(mat,2));
        System.out.println("should be 6 and was: " + longestSlope(mat,1));
    }
}
