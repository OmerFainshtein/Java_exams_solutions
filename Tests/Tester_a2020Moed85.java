

public class Tester11 extends a2020Moed85
{
    public static void main (String [] args)
    {
        int [][] mat = {{1,1,-1,1,1},{1,0,0,-1,1},{1,1,1,1,-1},{-1,-1,1,1,1},{1,1,-1,-1,1}};
        System.out.println(findMaximum(mat));
        
        int [] a = {1,2,4,4,5};
        int [] a1 = {1,3,2};
        int [] a2 = {5,4,3,2,1};
        System.out.println(strictlyIncreasing(a));
        System.out.println(strictlyIncreasing(a1));
        System.out.println(strictlyIncreasing(a2));
    }
}
