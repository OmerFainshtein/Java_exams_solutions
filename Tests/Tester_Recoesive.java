
/**
 * Write a description of class Tester5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester5 extends Recoesive
{
    public static void main (String [] args)
    {
        int [][] mat = {{1,1,1,1,1,1,1},{1,1,0,1,0,0,1},{1,1,1,1,0,1,1}};
        System.out.println(longest(mat, 0, 0));
    }
}
