
/**
 * Write a description of class TesterA2022Moed67 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterA2022Moed67 extends a2022Moed87
{
    public static void main (String [] args)
    {
        int [][] a = {{1,2,3,2,0,1,2},{0,1,0,0,0,3,0},{0,0,1,0,0,0,0},{5,0,0,1,0,0,0},{7,0,0,0,1,0,0},{8,0,0,0,0,1,0},{1,0,0,0,0,0,0}};
        
        System.out.println("*************question number 1 part a");
        
        System.out.println("should be true and was: " + isIdentity(a,0,1));
        System.out.println("should be true and was: " + isIdentity(a,1,1));
        System.out.println("should be true and was: " + isIdentity(a,1,2));
        System.out.println("should be true and was: " + isIdentity(a,1,3));
        System.out.println("should be true and was: " + isIdentity(a,1,4));
        System.out.println("should be true and was: " + isIdentity(a,4,1));
        System.out.println("should be true and was: " + isIdentity(a,4,2));
        System.out.println("should be false and was: " + isIdentity(a,4,3));
        
        System.out.println("*************question number 1 part b");
        System.out.println("should be 3 and was: " + maxMatrix(a));
        
        
        System.out.println("*************question number 2");
        int [] a1 = {22,24,26,32,34,36,38,40};
        int [] a2 = {22,26,28};
        int [] a3 = {2,4,6,8,10};
        
        System.out.println("should be 3 and was: " + findMissingIndex(a1));
        System.out.println("should be 1 and was: " + findMissingIndex(a2));
        System.out.println("should be 5 and was: " + findMissingIndex(a3));
    }
}
