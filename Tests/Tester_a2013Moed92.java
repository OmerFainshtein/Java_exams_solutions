
/**
 * Write a description of class Tester22 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester22 extends a2013Moed92
{
    public static void main (String [] args)
    {
        int [] match = {2,3,57};
        int [] match1 = {5,39,67};
        int [] match2 = {2,3,573,4,34,35};
        int [] match3 = {2,3,573,4,324,35};
        int [] match4 = {2,3};
        int [] match5 = {2,3,573,4,324,35};
        int [] pattern = {1,0,2};
        int [] pattern1 = {};
        
        System.out.println("***********question number 1");
        System.out.println("should be true and was: " + match(match,pattern));
        System.out.println("should be true and was: " + match(match1,pattern));
        System.out.println("should be true and was: " + match(match2,pattern));
        System.out.println("should be true and was: " + match(match3,pattern1));
        System.out.println("should be false and was: " + match(match4,pattern));
        System.out.println("should be false and was: " + match(match5,pattern)); 
    }
}
