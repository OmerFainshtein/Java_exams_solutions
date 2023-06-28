
/**
 * Write a description of class Tester18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester18 extends a2015Moed85
{
    public static void main (String [] args)
    {
        int [][]mat = {{0,0,0,10,0,0},{0,0,8,0,9,0},{0,6,0,0,0,7},{3,0,4,0,0,5},{1,2,100,100,100,2}};
        System.out.println("should get 4 and get: " + countRopes(mat));
        
        int [] arr = {-8,-7,-5,-3,-2,5,8};
        int [] arr1 = {-8,-7,-5,-3,-2,7,8};
        int [] arr2 = {-8,-7,-5,-3,-2,-1,1};
        int [] arr3 = {-8,-7,15,23,32,37,38};
        
        System.out.println("should get true and get: " + splitTo3(arr));
        System.out.println("should get false and get: " +splitTo3(arr1));
        System.out.println("should get true and get: " +splitTo3(arr2));
        System.out.println("should get true and get: " +splitTo3(arr3));
    }
}
