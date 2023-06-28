
/**
 * Write a description of class TesterA2022Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterA2022Test extends a2022Moed89
{
    public static void main (String [] args)
    {
        String str1 = new String ("adbrcfa");
        String str2 = new String ("abc");
        String str11 = new String ("cbdadbrcfa");
        String str22 = new String ("abcd");
        String str111 = new String ("adcfbaagcxabcd");
        String str222 = new String ("abc");
        String str1111 = new String ("abcfbaagcxabcd");
        String str2222 = new String ("abc");
        
        
        System.out.println("**********question number 1 part a");
        System.out.println("should be true and was: " + isJump(str1, str2, 2));
        System.out.println("should be false and was: " + isJump(str11, str22, 2));
        System.out.println("should be true and was: " + isJump(str111, str222, 4));
        System.out.println("should be false and was: " + isJump(str111, str222, 1));
        System.out.println("should be true and was: " + isJump(str1111, str2222, 1));
        System.out.println("should be true and was: " + isJump(str1111, str2222, 4));
        
        System.out.println("**********question number 1 part b");
        System.out.println("should be 2 and was: " + strStep(str1, str2));
        System.out.println("should be -1 and was: " + strStep(str11, str22));
        System.out.println("should be 4 and was: " + strStep(str111, str222));
        System.out.println("should be 1 and was: " + strStep(str1111, str2222));
        
        
        
        
        
        
        int [] a = {-1,1,-1,-5,2,2};
        int [] b = {3,3,2,-7,2,1,1,-2,-2};
        int [] c = {1,2,3,4,5,4};
        int [] d = {1,-2,3,-4,-5,4,2,-4,6,-2};
        
        System.out.println("**********question number 2");
        System.out.println("should be 3 , 0 - 2 and was: " + longestSubarray(a));
        System.out.println("should be 3 , 2 - 4 and was: " + longestSubarray(b));
        System.out.println("should be 1, 0 - 0 and was: " + longestSubarray(c));
        System.out.println("should be 4 , 0 - 3 and was: " + longestSubarray(d));
    }
}
