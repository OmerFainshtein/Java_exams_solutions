/**
 * Write a description of class Tester8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester8 extends b2019Moed83
{
    public static void main(String [] args)
    {
        int [][] mat = {{1,1,1,1,1,1,1},{1,1,0,1,0,0,1},{1,1,1,1,0,1,1}};
        System.out.println(longestPath(mat,2,5));
        
        int [][] arr = {{-99,-72,-64,-55,-28,-10,-5},{-72,-53,-46,-38,11,13,22},{-63,-48,-27,-12,14,16,23},{-44,-29,-10,0,18,20,28},{0,12,14,20,28,30,35}};
        System.out.println(howManyNegativeNumbers(arr));
    }
}
