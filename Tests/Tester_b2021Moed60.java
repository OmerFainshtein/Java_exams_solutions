
/**
 * Write a description of class Tester13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester13 extends b2021Moed60
{
    public static void main (String [] args)
    {
        int [] arr = {8,4,7,1,2,3,5};
        int [] arr2 = {4,7,1,2,3,5};
        
        System.out.println("should be true and was: " + split3(arr));
        System.out.println("should be false and was: " + split3(arr2));
        
        int [] a = {1,4,13,6,0,19};
        System.out.println("should be 3 and was: " + smallestSub(a,22));
        System.out.println("should be 6 and was: " + smallestSub(a,42));
        System.out.println("should be 7 and was: " + smallestSub(a,43));
        System.out.println("should be 4 and was: " + smallestSub(a,26));
        System.out.println("should be 1 and was: " + smallestSub(a,2));
    }
}
