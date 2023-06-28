
/**
 * Write a description of class Twster12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester12 extends a2020Moed87
{
    public static void main (String [] args)
    {
        int [][] mat = {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println("********question number 1");
        System.out.println("should be 2 and was: " + totalWays(mat,1));
        System.out.println("should be 2 and was: " + totalWays(mat,2));
        System.out.println("should be 2 and was: " + totalWays(mat,3));
        System.out.println("should be 0 and was: " + totalWays(mat,4));
        
        
        System.out.println("********question number 2");
        int [] a ={1,2,3,4,5,7,8,9};
        int [] b = {1,3,6,8};
        System.out.println("should be 2 triplets and was: ") ;
        printTriplets(a,40);
        System.out.println("should be 2 triplets and was: ");
        printTriplets(b,40);
    }
}